/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;


/**
 *
 * @author vinicius.lemos
 */

@ManagedBean(name = "menuManager")
@SessionScoped
public class MenuManager implements java.io.Serializable {
    private DashboardModel model;
    
    
    /**
     *
     * @return para Saida do Programa
     */
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml";
    }
    
     /**
     *
     * @return para Saida do Programa
     */
    public String login(){
        
        return "/restrito/principal.xhtml";
    }
    
    
    
    /**
     *
     * @return Chama o Menu de Usuario
     */
    public String menuEstoquePosicaoEstoque(){
    
        return "/restrito/consultarestoque.xhtml";
    }
    
      /**
     *
     * @return Chama o Menu de Usuario
     */
    public String menuSolicitacaoPendente(){
    
        return "/restrito/solicitacaopendente.xhtml";
    }
    
        
      /**
     *
     * @return Chama o Menu de Usuario
     */
    public String menuOrdemPendente(){
    
        return "/restrito/ordempendente.xhtml";
    }
    
      /**
     *
     * @return Chama o Menu de Usuario
     */
    public String menuMPPendente(){
    
        return "/restrito/mppendente.xhtml";
    }
    
    
        /**
     * @return the model
     */
    public DashboardModel getModel() {
        model = new DefaultDashboardModel();
        DashboardColumn coluna1 = new DefaultDashboardColumn();
        //DashboardColumn coluna2 = new DefaultDashboardColumn();
        //DashboardColumn coluna3 = new DefaultDashboardColumn();
        coluna1.addWidget("SolCompras");
        model.addColumn(coluna1);
        
        return model;
    }
   
    
}
