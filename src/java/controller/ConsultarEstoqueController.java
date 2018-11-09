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

import model.Produto;
import model.Usuario;
import wsestoque.EstoquesConsultarEstoqueIn;
import wsestoque.EstoquesConsultarEstoqueInEntrada;
import wsestoque.EstoquesConsultarEstoqueOut;
import wsestoque.EstoquesConsultarEstoqueOutProdutos;
import wsestoque.EstoquesConsultarEstoqueOutProdutosDerivacoes;
import wsestoque.EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos;
import wsestoque.G5SeniorServices;
import wsestoque.SapiensSynccomSeniorG5CoMcmEstEstoques;



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
@ManagedBean(name = "consultarEstoqueController")
public class ConsultarEstoqueController implements java.io.Serializable {
    private String codProduto;
    private String codDerivacao;
    private String codDeposito;
    private List<Produto> produtos = new ArrayList();
    private Produto produto = new Produto();
    Usuario usuario =(Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    
    
    public void consultarEstoque(){
        String retorno = "";
        produtos.removeAll(produtos);
        
        System.out.println(" ***** inicio da pesquisa **** ");
        
        G5SeniorServices service = new G5SeniorServices();
        SapiensSynccomSeniorG5CoMcmEstEstoques estoque = service.getSapiensSynccomSeniorG5CoMcmEstEstoquesPort();
        JAXBElement<String> pCodEmp = new JAXBElement<>(new QName("codEmp"),String.class, "1");
        JAXBElement<String> pCodPro = new JAXBElement<>(new QName("codPro"),String.class,getCodProduto());
        JAXBElement<String> pCodDer = new JAXBElement<>(new QName("codDer"),String.class,getCodDerivacao());
        JAXBElement<String> pCodDep = new JAXBElement<>(new QName("codDep"),String.class,getCodDeposito());  
             
        EstoquesConsultarEstoqueInEntrada InConsultas = new EstoquesConsultarEstoqueInEntrada();
        InConsultas.setCodEmp(pCodEmp);
        InConsultas.setCodPro(pCodPro);
        InConsultas.setCodDer(pCodDer);
        InConsultas.setCodDep(pCodDep);
        
        EstoquesConsultarEstoqueIn parametros = new EstoquesConsultarEstoqueIn();
              
        parametros.getEntrada().add(InConsultas);
        
        EstoquesConsultarEstoqueOut out = estoque.consultarEstoque(usuario.getUsuario(), usuario.getSenha(), 0, parametros);
        
        System.out.println("Retorno da Pesquisa :" + out.getErroExecucao().getValue());
        //System.out.println(out.getProdutos().toString());
        
             
            for (Iterator iterator = out.getProdutos().iterator(); iterator.hasNext();) {
                EstoquesConsultarEstoqueOutProdutos next = (EstoquesConsultarEstoqueOutProdutos) iterator.next();
                
                retorno = next.getRetorno().getValue();

                for (Iterator iterator1 = next.getDerivacoes().iterator(); iterator1.hasNext();) {
                    EstoquesConsultarEstoqueOutProdutosDerivacoes next1 = (EstoquesConsultarEstoqueOutProdutosDerivacoes) iterator1.next();
                   
                    for (Iterator iterator2 = next1.getDepositos().iterator(); iterator2.hasNext();) {
                        EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos next2 = (EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos) iterator2.next();
                        
                        produto = new Produto();
                        produto.setCodProduto(next.getCodPro().getValue());
                        produto.setCodDerivacao(next1.getCodDer().getValue());
                        produto.setCodDeposito(next2.getCodDep().getValue());
                        produto.setQtdEstoque(next2.getQtdEst().getValue());
                        produtos.add(produto);
                    }

                }
            }

      //  }
        System.out.println(" ***** fim da pesquisa **** ");
        System.out.println(retorno);
        addMessage("",retorno);
        
    }
    
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
     * @return the codProduto
     */
    public String getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the codDerivacao
     */
    public String getCodDerivacao() {
        return codDerivacao;
    }

    /**
     * @param codDerivacao the codDerivacao to set
     */
    public void setCodDerivacao(String codDerivacao) {
        this.codDerivacao = codDerivacao;
    }

    /**
     * @return the codDeposito
     */
    public String getCodDeposito() {
        return codDeposito;
    }

    /**
     * @param codDeposito the codDeposito to set
     */
    public void setCodDeposito(String codDeposito) {
        this.codDeposito = codDeposito;
    }

    /**
     * @return the produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
