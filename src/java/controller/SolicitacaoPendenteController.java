package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import model.SolicitacaoPendente;
import model.Usuario;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
import wssolicitacaopendente.G5SeniorServices;
import wssolicitacaopendente.SapiensSynccomSeniorG5CoMcmEstSolicitacaocompra;
import wssolicitacaopendente.SolicitacaocompraaprovarIn;
import wssolicitacaopendente.SolicitacaocompraaprovarInSolicitacao;
import wssolicitacaopendente.SolicitacaocompraaprovarOut;
import wssolicitacaopendente.SolicitacaocompraaprovarOutRetorno;
import wssolicitacaopendente.SolicitacaocomprabuscarPendentes3In;
import wssolicitacaopendente.SolicitacaocomprabuscarPendentes3Out;
import wssolicitacaopendente.SolicitacaocomprabuscarPendentes3OutSolicitacao;
import wssolicitacaopendente.SolicitacaocomprareprovarIn;
import wssolicitacaopendente.SolicitacaocomprareprovarInSolicitacao;
import wssolicitacaopendente.SolicitacaocomprareprovarOut;
import wssolicitacaopendente.SolicitacaocomprareprovarOutRetorno;




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
@ManagedBean(name = "solController")
public class SolicitacaoPendenteController implements java.io.Serializable {
    private List<SolicitacaoPendente> solicitacoesPendentes = new ArrayList();
    private SolicitacaoPendente solicitacaoPendente;
    Usuario usuario =(Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    private int fluxo = 0;
    private DashboardModel model;
    
    
   
     /**
     * Gerador de Mensagem pra tela
     * @param summary
     * @param detail
     */
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
  /**
     *
     * @param event
     * verifica o Especialidade Selecionado na tela
     */
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Solicitação Selecionada ", Integer.toString(((SolicitacaoPendente) event.getObject()).getNumSolicitacao()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    /**
     *
     * @param event
     * verifica o Especialidade não Selecionado
     */
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Solicitação não Selecionado", Integer.toString(((SolicitacaoPendente) event.getObject()).getNumSolicitacao()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    /**
     * @return the solicitacoesPendentes
     */
    public List<SolicitacaoPendente> getSolicitacoesPendentes() {
        String retorno = "";
        
        //solicitacoesPendentes = new ArrayList();
        //solicitacoesPendentes.removeAll(solicitacoesPendentes);
        if (((solicitacoesPendentes == null) || (solicitacoesPendentes.size() == 0)) && (fluxo == 0)) {

            System.out.println("Pesq. Sol   : Inicio da pesquisa de Solicitações Pendentes de Aprovação");

            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstSolicitacaocompra solpendente = service.getSapiensSynccomSeniorG5CoMcmEstSolicitacaocompraPort();

            SolicitacaocomprabuscarPendentes3In InConsultas = new SolicitacaocomprabuscarPendentes3In();

            SolicitacaocomprabuscarPendentes3Out out = solpendente.buscarPendentes3(usuario.getUsuario(), usuario.getSenha(), 0, InConsultas);

            System.out.println("************* Código do Erro da Execução : " + out.getErroExecucao().getValue());
            System.out.println("************* Codigo do Resultado        : " + out.getCodigoResultado().getValue());

            int controle = 1;
            for (Iterator iterator = out.getSolicitacao().iterator(); iterator.hasNext();) {

                SolicitacaocomprabuscarPendentes3OutSolicitacao next = (SolicitacaocomprabuscarPendentes3OutSolicitacao) iterator.next();
                solicitacaoPendente = novaSolicitacao();

                solicitacaoPendente.setChavecontrole(controle);
                solicitacaoPendente.setCodEmpresa(next.getCodigoEmpresa().getValue());
                solicitacaoPendente.setCodFilial(next.getCodigoFilial().getValue());
                solicitacaoPendente.setNumSolicitacao(next.getNumero().getValue());
                solicitacaoPendente.setSeq(next.getSequencia().getValue());
                solicitacaoPendente.setDescProdutoServico(next.getDescricaoProdutoServico().getValue());
                solicitacaoPendente.setQtdsolicitada(next.getQuantidadeSolicitada().getValue());
                solicitacaoPendente.setVlrUnit(next.getValorUnitario().getValue());
                solicitacaoPendente.setDataSolicitacao(next.getDataSolicitacao().getValue());
                solicitacaoPendente.setVlrAproximado(next.getValorAproximado().getValue());
                solicitacaoPendente.setObservacao(next.getObservacao().getValue());
                solicitacaoPendente.setNomeSolicitante(next.getNomeSolicitante().getValue());

                solicitacoesPendentes.add(solicitacaoPendente);
                controle++;
            }
            System.out.println(retorno);
            System.out.println("Pesq. Sol   : Fim da pesquisa de solicitações pendentes");
            //System.out.println(retorno);
            //addMessage("", retorno);
            fluxo++;
        }

        return solicitacoesPendentes;
    }
    
    private SolicitacaoPendente novaSolicitacao(){
        return new SolicitacaoPendente();
    }

    /**
     * @param solicitacaoPendente the solicitacoesPendentes to set
     */
    public void setSolicitacoesPendentes(List<SolicitacaoPendente> solicitacaoPendente) {
        this.solicitacoesPendentes = solicitacaoPendente;
    }

    /**
     * @return the solicitacaoPendente
     */
    public SolicitacaoPendente getSolicitacaoPendente() {
       // solicitacaoPendente = new SolicitacaoPendente();
        return solicitacaoPendente;
    }

    /**
     * @param solicitacaoPendente the solicitacaoPendente to set
     */
    public void setSolicitacaoPendente(SolicitacaoPendente solicitacaoPendente) {
        this.solicitacaoPendente = solicitacaoPendente;
    }
    
    public Integer getQtdePendente(){
        int retorno;
        retorno = getSolicitacoesPendentes().size();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("qtdpendente", retorno);
        return retorno;
    }
    public Integer getQtdePendenteRapido(){
        
        return (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("qtdpendente");
    }
    
    public String aprovarSolicitacao() {
        if (getSolicitacaoPendente() != null) {
            
            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstSolicitacaocompra solpendentes = service.getSapiensSynccomSeniorG5CoMcmEstSolicitacaocompraPort();
            SolicitacaocompraaprovarInSolicitacao inConsultas = new SolicitacaocompraaprovarInSolicitacao();
            
            JAXBElement<Integer> pNumSeq = new JAXBElement<>(new QName("sequencia"), Integer.class, 1);
            JAXBElement<Integer> pCodEmp = new JAXBElement<>(new QName("codigoEmpresa"), Integer.class, solicitacaoPendente.getCodEmpresa());
            JAXBElement<Integer> pNumSol = new JAXBElement<>(new QName("numeroSolicitacao"), Integer.class, solicitacaoPendente.getNumSolicitacao());
            JAXBElement<Integer> pSeqSol = new JAXBElement<>(new QName("sequenciaSolicitacao"), Integer.class, solicitacaoPendente.getSeq());

            inConsultas.setSequencia(pNumSeq);
            inConsultas.setCodigoEmpresa(pCodEmp);
            inConsultas.setNumeroSolicitacao(pNumSol);
            inConsultas.setSequenciaSolicitacao(pSeqSol);

            SolicitacaocompraaprovarIn parametros = new SolicitacaocompraaprovarIn();
            parametros.getSolicitacao().add(inConsultas);
            
            SolicitacaocompraaprovarOut retorno = solpendentes.aprovar(usuario.getUsuario(), usuario.getSenha(), 0, parametros);

            System.out.println("Aprovando a solicitação :");
            System.out.println("Empresa     : " + solicitacaoPendente.getCodEmpresa());
            System.out.println("Solicitação : " + solicitacaoPendente.getNumSolicitacao());
            System.out.println("Sequencia   : " + solicitacaoPendente.getSeq());
            System.out.println("Resultado   : " + retorno.getResultado().getValue());
            System.out.println("Msg Erro    : " + retorno.getErroExecucao().getValue());

            for (Iterator iterator = retorno.getRetorno().iterator(); iterator.hasNext();) {
                SolicitacaocompraaprovarOutRetorno next = (SolicitacaocompraaprovarOutRetorno) iterator.next();
                System.out.println("Msg Erro2   : " + next.getMensagemErro().getValue());
            }

            addMessage("", retorno.getResultado().getValue());
            atualizarSolicitacao();
        } else {
            addMessage("", "Selecione uma solicitação para aprovar!");
        }
        
        return "/restrito/solicitacaopendente.xhtml";
    }

    public String reprovarSolicitacao() {
        if (getSolicitacaoPendente() != null) {

            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5CoMcmEstSolicitacaocompra solPendentes = service.getSapiensSynccomSeniorG5CoMcmEstSolicitacaocompraPort();
            SolicitacaocomprareprovarInSolicitacao inConsultas = new SolicitacaocomprareprovarInSolicitacao();

            JAXBElement<Integer> pNumSeq = new JAXBElement<>(new QName("sequencia"), Integer.class, 1);
            JAXBElement<Integer> pCodEmp = new JAXBElement<>(new QName("codigoEmpresa"), Integer.class, solicitacaoPendente.getCodEmpresa());
            JAXBElement<Integer> pNumSol = new JAXBElement<>(new QName("numeroSolicitacao"), Integer.class, solicitacaoPendente.getNumSolicitacao());
            JAXBElement<Integer> pSeqSol = new JAXBElement<>(new QName("sequenciaSolicitacao"), Integer.class, solicitacaoPendente.getSeq());

            inConsultas.setSequencia(pNumSeq);
            inConsultas.setCodigoEmpresa(pCodEmp);
            inConsultas.setNumeroSolicitacao(pNumSol);
            inConsultas.setSequenciaSolicitacao(pSeqSol);

            SolicitacaocomprareprovarIn parametros = new SolicitacaocomprareprovarIn();
            parametros.getSolicitacao().add(inConsultas);

            SolicitacaocomprareprovarOut retorno = solPendentes.reprovar(usuario.getUsuario(), usuario.getSenha(), 0, parametros);
            System.out.println("reprovando a solicitação :");
            System.out.println("Empresa     : " + solicitacaoPendente.getCodEmpresa());
            System.out.println("Solicitação : " + solicitacaoPendente.getNumSolicitacao());
            System.out.println("Sequencia   : " + solicitacaoPendente.getSeq());
            System.out.println("Resultado   : " + retorno.getResultado().getValue());
            System.out.println("Msg Erro    : " + retorno.getErroExecucao().getValue());

            for (Iterator iterator = retorno.getRetorno().iterator(); iterator.hasNext();) {
                SolicitacaocomprareprovarOutRetorno next = (SolicitacaocomprareprovarOutRetorno) iterator.next();
                System.out.println("Msg Erro2   : " + next.getMensagemErro().getValue());
            }

            addMessage("", retorno.getResultado().getValue());

            atualizarSolicitacao();
        } else{
            addMessage("", "Selecione uma Solicitação para reprovar!");
        }
        return "/restrito/solicitacaopendente.xhtml";

    }
    
    public void atualizarSolicitacao(){
        fluxo = 0;
        solicitacoesPendentes.removeAll(solicitacoesPendentes);
        getSolicitacoesPendentes();
    }
    public String detalharSolicitacao() {
        if (getSolicitacaoPendente() != null) {
            return "/restrito/solicitacaopendentedetalhe.xhtml";
        } else {
            addMessage("", "Selecione uma Solicitação!");
            return "/restrito/solicitacaopendente.xhtml";
        }

    }



    /**
     * @param model the model to set
     */
    public void setModel(DashboardModel model) {
        this.model = model;
    }

  
}
