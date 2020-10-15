package controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import model.AnexosOC;
import model.OrdemPendente;
import model.Usuario;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import wsordemcompra.G5SeniorServices;
import wsordemcompra.OrdemcompraaprovarIn;
import wsordemcompra.OrdemcompraaprovarInOrdemCompra;
import wsordemcompra.OrdemcompraaprovarOut;
import wsordemcompra.OrdemcompraaprovarOutRetorno;
import wsordemcompra.OrdemcomprabuscarPendentes4In;
import wsordemcompra.OrdemcomprabuscarPendentes4Out;
import wsordemcompra.OrdemcomprabuscarPendentes4OutOrdemCompra;
import wsordemcompra.OrdemcomprareprovarIn;
import wsordemcompra.OrdemcomprareprovarInOrdemCompra;
import wsordemcompra.OrdemcomprareprovarOut;
import wsordemcompra.OrdemcomprareprovarOutRetorno;
import wsordemcompra.SapiensSynccomSeniorG5CoMcmEstOrdemcompra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vinicius.lemos
 */
@SessionScoped
@ManagedBean(name = "ordemController")
public class OrderPendenteController implements java.io.Serializable {

    private List<OrdemPendente> ordensPendentes = new ArrayList();
    private OrdemPendente ordemPendente;
    Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    private int fluxo = 0;

    /**
     * Gerador de Mensagem pra tela
     *
     * @param summary
     * @param detail
     */
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     *
     * @param event verifica o Especialidade Selecionado na tela
     */
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Ordem Selecionada ", Integer.toString(((OrdemPendente) event.getObject()).getNumero()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     *
     * @param event verifica o Especialidade não Selecionado
     */
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Ordem não Selecionado", Integer.toString(((OrdemPendente) event.getObject()).getNumero()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @return the solicitacoesPendentes
     */
    public List<OrdemPendente> getOrdensPendentes() {
        String retorno = "";

        //solicitacoesPendentes = new ArrayList();
        //solicitacoesPendentes.removeAll(solicitacoesPendentes);
        if (((ordensPendentes == null) || (ordensPendentes.size() == 0)) && (fluxo == 0)) {

            System.out.println("Pesq. Ordens   : Inicio da pesquisa de Ordens Pendentes de Aprovação");

            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstOrdemcompra ocpendente = service.getSapiensSynccomSeniorG5CoMcmEstOrdemcompraPort();

            OrdemcomprabuscarPendentes4In InConsultas = new OrdemcomprabuscarPendentes4In();

            OrdemcomprabuscarPendentes4Out out = ocpendente.buscarPendentes4(usuario.getUsuario(), usuario.getSenha(), 0, InConsultas);

            System.out.println("************* Código do Erro da Execução : " + out.getErroExecucao().getValue());
            System.out.println("************* Codigo do Resultado        : " + out.getCodigoResultado().getValue());

            int controle = 1;
            for (Iterator iterator = out.getOrdemCompra().iterator(); iterator.hasNext();) {

                OrdemcomprabuscarPendentes4OutOrdemCompra next = (OrdemcomprabuscarPendentes4OutOrdemCompra) iterator.next();
                ordemPendente = novaOrdem();

                ordemPendente.setChaveControle(controle);
                ordemPendente.setCodigoEmpresa(next.getCodigoEmpresa().getValue());
                ordemPendente.setCodigoFilial(next.getCodigoFilial().getValue());
                ordemPendente.setNumero(next.getNumero().getValue());
                ordemPendente.setNomeFornecedor(next.getNomeFornecedor().getValue());
                ordemPendente.setDataEmissao(next.getDataEmissao().getValue());
                ordemPendente.setValorAproximado(next.getValorAproximado().getValue());
                ordemPendente.setObservacao(next.getObservacao().getValue());
                ordemPendente.setNomeSolicitante(next.getNomeSolicitante().getValue());
                ordemPendente.setNomeFilial(next.getNomeFilial().getValue());
                ordensPendentes.add(ordemPendente);
                controle++;
            }
            System.out.println(retorno);
            System.out.println("Pesq. Ordens   : Fim da pesquisa de Ordens pendentes");
            //System.out.println(retorno);
            //addMessage("", retorno);
            fluxo++;
        }

        return ordensPendentes;

    }

    private OrdemPendente novaOrdem() {
        return new OrdemPendente();
    }

    /**
     * @param ordensPendente the solicitacoesPendentes to set
     */
    public void setOrdensPendentes(List<OrdemPendente> ordensPendente) {
        this.ordensPendentes = ordensPendente;
    }

    /**
     * @return the solicitacaoPendente
     */
    public OrdemPendente getOrdemPendente() {
        // solicitacaoPendente = new SolicitacaoPendente();
        return ordemPendente;
    }

    /**
     * @param ordemPendente
     *
     */
    public void setOrdemPendente(OrdemPendente ordemPendente) {
        this.ordemPendente = ordemPendente;
    }

    /*  public Integer getQtdePendente(){
        int retorno;
        retorno = getSolicitacoesPendentes().size();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("qtdpendente", retorno);
        return retorno;
    }
    public Integer getQtdePendenteRapido(){
        
        return (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("qtdpendente");
    }*/
    public String aprovarSolicitacao() {
        if (getOrdemPendente() != null) {

            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstOrdemcompra ocpendentes = service.getSapiensSynccomSeniorG5CoMcmEstOrdemcompraPort();
            OrdemcompraaprovarInOrdemCompra inConsultas = new OrdemcompraaprovarInOrdemCompra();

            JAXBElement<Integer> pNumSeq = new JAXBElement<>(new QName("sequencia"), Integer.class, 1);
            JAXBElement<Integer> pCodEmp = new JAXBElement<>(new QName("codigoEmpresa"), Integer.class, ordemPendente.getCodigoEmpresa());
            JAXBElement<Integer> pCodFil = new JAXBElement<>(new QName("codigoFilial"), Integer.class, ordemPendente.getCodigoFilial());
            JAXBElement<Integer> pNumero = new JAXBElement<>(new QName("numero"), Integer.class, ordemPendente.getNumero());

            inConsultas.setSequencia(pNumSeq);
            inConsultas.setCodigoEmpresa(pCodEmp);
            inConsultas.setCodigoFilial(pCodFil);
            inConsultas.setNumero(pNumero);

            OrdemcompraaprovarIn parametros = new OrdemcompraaprovarIn();
            parametros.getOrdemCompra().add(inConsultas);

            OrdemcompraaprovarOut retorno = ocpendentes.aprovar(usuario.getUsuario(), usuario.getSenha(), 0, parametros);

            System.out.println("Aprovando a Ordem Compra :");

            System.out.println("Empresa     : " + ordemPendente.getCodigoEmpresa());
            System.out.println("codigoFilial: " + ordemPendente.getCodigoFilial());
            System.out.println("Numero   : " + ordemPendente.getNumero());
            System.out.println("Resultado   : " + retorno.getResultado().getValue());
            System.out.println("Msg Erro    : " + retorno.getErroExecucao().getValue());

            for (Iterator iterator = retorno.getRetorno().iterator(); iterator.hasNext();) {
                OrdemcompraaprovarOutRetorno next = (OrdemcompraaprovarOutRetorno) iterator.next();
                System.out.println("Msg Erro2   : " + next.getMensagemErro().getValue());
            }

            addMessage("", retorno.getResultado().getValue());
            atualizarSolicitacao();
        } else {
            addMessage("", "Selecione uma Ordem para aprovar!");
        }

        return "/restrito/ordempendente.xhtml";

    }

    public String reprovarSolicitacao() {
        String mensagem = " ";
        if (getOrdemPendente() != null) {

            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstOrdemcompra ocPendentes = service.getSapiensSynccomSeniorG5CoMcmEstOrdemcompraPort();
            OrdemcomprareprovarInOrdemCompra inConsultas = new OrdemcomprareprovarInOrdemCompra();

            JAXBElement<Integer> pNumSeq = new JAXBElement<>(new QName("sequencia"), Integer.class, 1);
            JAXBElement<Integer> pCodEmp = new JAXBElement<>(new QName("codigoEmpresa"), Integer.class, ordemPendente.getCodigoEmpresa());
            JAXBElement<Integer> pCodFil = new JAXBElement<>(new QName("codigoFilial"), Integer.class, ordemPendente.getCodigoFilial());
            JAXBElement<Integer> pNumero = new JAXBElement<>(new QName("numero"), Integer.class, ordemPendente.getNumero());

            inConsultas.setSequencia(pNumSeq);
            inConsultas.setCodigoEmpresa(pCodEmp);
            inConsultas.setCodigoFilial(pCodFil);
            inConsultas.setNumero(pNumero);

            OrdemcomprareprovarIn parametros = new OrdemcomprareprovarIn();
            parametros.getOrdemCompra().add(inConsultas);

            OrdemcomprareprovarOut retorno = ocPendentes.reprovar(usuario.getUsuario(), usuario.getSenha(), 0, parametros);

            System.out.println("reprovando a Ordem :");

            System.out.println("Empresa     : " + ordemPendente.getCodigoEmpresa());
            System.out.println("codigoFilial: " + ordemPendente.getCodigoFilial());
            System.out.println("Numero   : " + ordemPendente.getNumero());
            System.out.println("Resultado   : " + retorno.getResultado().getValue());
            System.out.println("Msg Erro    : " + retorno.getErroExecucao().getValue());

            for (Iterator iterator = retorno.getRetorno().iterator(); iterator.hasNext();) {
                OrdemcomprareprovarOutRetorno next = (OrdemcomprareprovarOutRetorno) iterator.next();
                System.out.println("Msg Erro2   : " + next.getMensagemErro().getValue());
                mensagem += " " + next.getMensagemErro().getValue();
            }
            mensagem += " " + retorno.getResultado().getValue();
            addMessage("", mensagem);

            atualizarSolicitacao();
        } else {
            addMessage("", "Selecione uma Ordem para reprovar!");
        }
        return "/restrito/ordempendente.xhtml";

    }

    public void atualizarSolicitacao() {
        fluxo = 0;
        ordensPendentes.removeAll(ordensPendentes);
        getOrdensPendentes();
    }

    public String detalharSolicitacao() throws FileNotFoundException, URISyntaxException, IOException {
        System.out.println("Encontrou em detalharSolicitacao ");
        if (getOrdemPendente() != null) {
            System.out.println("Encontrou em if (getOrdemPendente() != null) ");
            System.out.println("Ordem pendente: " + ordemPendente.getNumero());
            //lerAquivos(ordemPendente.getNumero(), ordemPendente.getCodigoFilial());
            lerArquivosRede(ordemPendente.getNumero(), ordemPendente.getCodigoFilial());

            return "/restrito/ordempendentedetalhe.xhtml";
        } else {
            addMessage("", "Selecione uma Ordem!");
            return "/restrito/ordempendente.xhtml";
        }

    }

    /*private void lerAquivos(int numeroOrdemPendente) throws FileNotFoundException, URISyntaxException, IOException {
        System.out.println("Entrou em lerAquivos");
        
        ordemPendente.removeAllAnexos();
        System.out.println("Passou ordemPendente.removeAllAnexos();");
        
        FTPFile[] conteudoPasta = null;
        System.out.println("Passou File[] conteudoPasta = null;");
        //File f = new File("\\\\baltimore\\arquivos$\\Doc_Compras\\OC\\processos 2017"); // busca todas as pastas de OC
                
        FTPClient ftp = new FTPClient();
        ftp.connect("192.168.16.22");
        boolean result = ftp.login("ftp.sapiens","123Frescatto");
        boolean sucess = ftp.changeWorkingDirectory ("/OC/processos 2017");
        System.out.println("Conexão com FTP com sucesso ? " + result);
        System.out.println("Pasta de arquivos encontrada ? " + sucess);
        
        String[] nomes = ftp.listNames();
        System.out.println ("Listando arquivos: \n");
   
        //System.out.println("Passou f: " + f);
        //String[] nomes = f != null ? f.list() : new String[0];
                
        for (String s : nomes) {
            System.out.println("Entrou for (String s : nomes)");
            
            if (Integer.toString(numeroOrdemPendente).equals(s)) { //localiza a pasta especifica da OC
                System.out.println("Encontrou a pasta " + numeroOrdemPendente);
        
                //File pasta = new File("\\\\baltimore\\arquivos$\\Doc_Compras\\OC\\processos 2017\\" + Integer.toString(numeroOrdemPendente)); //pega conteudo da pasta especifica
                
                ftp.changeWorkingDirectory ("/OC/processos 2017/" + Integer.toString(numeroOrdemPendente)); //pega conteudo da pasta especifica
                conteudoPasta = ftp.listFiles();
                System.out.println("listando o conteúdo da pasta");
                
                for (FTPFile x : conteudoPasta) {
                                        
                    AnexosOC anexo = new AnexosOC();
                    
                    /** Stream estava retornando null usando a linha abaixo. */
    //InputStream stream = this.getClass().getResourceAsStream(x.getAbsolutePath());
    /**
     * Arquivo sempre baixa com o nome "downloaded_file.pdf" coloquei para
     * baixar com nome real do arquivo
     */
    //anexo.setArquivo(new DefaultStreamedContent(stream, "application/pdf",
    //        "downloaded_file.pdf"));
    //             InputStream stream = ftp.retrieveFileStream(x.getName());
    //           anexo.setArquivo(new DefaultStreamedContent(stream, "application/pdf", x.getName()));
    //         anexo.setNome(x.getName());
    //     anexo.setCaminho(ftp.getRemoteAddress().getHostAddress() + "/OC/processos 2017/" + x.getName());
    //       ordemPendente.addAnexos(anexo);
    //   System.out.println("Terminou lerAquivos");
    // ftp.completePendingCommand();
    // }
    // }
    // }
    //}/
    
    private void lerArquivosRede(int numeroOCPendente, int filial) {
        String caminho = "C:\\DocCompras\\Doc_Compras\\OC\\processos 2020\\";
        //String caminho = "\\\\baltimore\\doc_compras$\\Doc_Compras\\OC\\processos 2020\\";
        //\\baltimore\doc_compras$\Doc_Compras\OC\processos 2020
        File f = new File(caminho + Integer.toString(filial) + "\\" + Integer.toString(numeroOCPendente));
        if (f.exists()) {
            File[] arquivos = f.listFiles(); //retorna um array de Files
            String[] nomes = f.list(); //retorna o nome dos arquivos em Strings
            ordemPendente.removeAllAnexos();

            for (int z = 0; z <= nomes.length - 1; z++) {

                AnexosOC anexo = new AnexosOC();
                File file = new File(caminho + Integer.toString(filial) + "\\" + Integer.toString(numeroOCPendente) + "\\" + nomes[z]);
                InputStream stream = null;
                // algumas variaveis
                int tam = 999999999;
                int retorno = 0;
                int inicio = 0;
                int fim = tam;
                int length = (int) file.length();
                // byte[] que guarda tudo
                byte bytes[] = new byte[(int) file.length()];
                try {
                    // apontei para o arquivo
                    stream = new FileInputStream(file);
                    // enquanto nao chegar ao fim...
                    while ((retorno = stream.read(bytes, inicio, fim)) > 0) {
                        System.out.println("de " + inicio + " ate " + fim);
                        // aqui o inicio é aumentado pra onde parou da ultima vez...
                        // o fim é aumentado para mais "10" depois so inicio
                        inicio += retorno;
                        fim = inicio + tam;
                    }
                    // mostra como ficou a ultima iteracao
                    System.out.println("de " + inicio + " ate " + fim);
                    System.out.println(new String(bytes) + " " + fim);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("pro de " + inicio + " ate " + fim);
                }
                //InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/images/boromir.jpg");
                StreamedContent download = new DefaultStreamedContent(stream, "application/pdf", file.getPath());

                if(!file.getName().equals("Thumbs.db")){
                    
                    anexo.setArquivo(download);
                    anexo.setNome(file.getName());
                    anexo.setCaminho(file.getPath());

                    if (ordemPendente != null && ordemPendente.getAnexos() != null) {
                        if (!ordemPendente.getAnexos().contains(anexo)) {
                            ordemPendente.addAnexos(anexo);
                        }
                    }
                    
                }
                
              

                System.out.println("Terminou lerAquivos");

            }
        } 

        
    }
    
    private void lerAquivos(int numeroOrdemPendente, int filial) throws FileNotFoundException, URISyntaxException, IOException {
        FTPClient ftp = new FTPClient();

        try {
            System.out.println("Entrou em lerAquivos");

            ordemPendente.removeAllAnexos();
            System.out.println("Passou ordemPendente.removeAllAnexos();");

            FTPFile[] conteudoPasta = null;
            System.out.println("Passou File[] conteudoPasta = null;");
            //File f = new File("\\\\baltimore\\arquivos$\\Doc_Compras\\OC\\processos 2017"); // busca todas as pastas de OC

            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    // do nothing
                }
            }

            ftp.connect("192.168.16.22");
            boolean result = ftp.login("ftp.sapiens", "123Frescatto");
            ftp.enterLocalPassiveMode();
            boolean sucess = ftp.changeWorkingDirectory("/OC/processos 2020/" + filial);
            System.out.println("Conexão com FTP com sucesso ? " + result);
            System.out.println("Pasta de arquivos encontrada ? " + sucess);

            String[] nomes = ftp.listNames();
            System.out.println("Listando arquivos: \n");

            //System.out.println("Passou f: " + f);
            //String[] nomes = f != null ? f.list() : new String[0];
            for (String s : nomes) {
                //System.out.println("Entrou for (String s : nomes)");

                if (Integer.toString(numeroOrdemPendente).equals(s)) { //localiza a pasta especifica da OC

                    ordemPendente.removeAllAnexos();
                    System.out.println("Encontrou a pasta " + numeroOrdemPendente);

                    //File pasta = new File("\\\\baltimore\\arquivos$\\Doc_Compras\\OC\\processos 2017\\" + Integer.toString(numeroOrdemPendente)); //pega conteudo da pasta especifica
                    ftp.changeWorkingDirectory("/OC/processos 2020/" + Integer.toString(filial) + "/" + Integer.toString(numeroOrdemPendente)); //pega conteudo da pasta especifica
                    conteudoPasta = ftp.listFiles();
                    System.out.println("listando o conteúdo da pasta");

                    for (FTPFile x : conteudoPasta) {

                        AnexosOC anexo = new AnexosOC();

                        /**
                         * Stream estava retornando null usando a linha abaixo.
                         */
                        //InputStream stream = this.getClass().getResourceAsStream(x.getAbsolutePath());
                        /**
                         * Arquivo sempre baixa com o nome "downloaded_file.pdf"
                         * coloquei para baixar com nome real do arquivo
                         */
                        //anexo.setArquivo(new DefaultStreamedContent(stream, "application/pdf",
                        //        "downloaded_file.pdf"));
                        ftp.setAutodetectUTF8(true);
                        ftp.setFileType(ftp.BINARY_FILE_TYPE);
                        // ftp.setFileTransferMode(ftp.STREAM_TRANSFER_MODE);

                        InputStream stream = ftp.retrieveFileStream(x.getName());

                        BufferedOutputStream out = null;
                        byte[] chunk = new byte[4096];
                        int count = 0;
                        out = new BufferedOutputStream(new FileOutputStream(x.getName()));
                        while ((count = stream.read(chunk)) >= 0) {
                            out.write(chunk, 0, count);
                        }

                        ftp.completePendingCommand();

                        /*     if (!FTPReply.isPositiveIntermediate(ftp.getReplyCode())) {
                        stream.close();
                        ftp.logout();
                        ftp.disconnect();
                        System.err.println("File transfer failed.");
                        System.exit(1);
                    }*/
                        anexo.setArquivo(new DefaultStreamedContent(stream, "application/pdf", x.getName()));
                        anexo.setNome(x.getName());
                        anexo.setCaminho("ftp://" + ftp.getRemoteAddress().getHostAddress() + "/OC/processos 2020/"
                                + Integer.toString(filial) + "/"
                                + Integer.toString(numeroOrdemPendente) + "/"
                                + x.getName());

//                    anexo.setCaminho(ftp.getRemoteAddress().getHostAddress() + "/OC/processos 2020/" 
//                            + Integer.toString(filial) + "/" 
//                            + Integer.toString(numeroOrdemPendente) + "/"
//                            + x.getName());
                        if (ordemPendente != null && ordemPendente.getAnexos() != null) {
                            if (!ordemPendente.getAnexos().contains(anexo)) {
                                ordemPendente.addAnexos(anexo);
                            }
                        }

                        System.out.println("Terminou lerAquivos");
                        //ftp.logout();

                        stream.close();
                        if (!ftp.completePendingCommand()) {
                            ftp.logout();
                            ftp.disconnect();
                        }

                    }

                    ftp.logout();
                    //ftp.completePendingCommand();
                    ftp.disconnect();
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        } finally {
            ftp.disconnect();
        }
    }

}
