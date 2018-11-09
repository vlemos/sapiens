/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author vinicius.lemos
 */

@SessionScoped
@ManagedBean(name = "principalManager")
public class PrincipalManager {
    private DashboardModel model;
    /**
     * @return the model
     */
    public DashboardModel getModel() {
         model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
              
        column1.addWidget("OC");       
        column2.addWidget("SOLICITACAO");
        column3.addWidget("MP");
        
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);

        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DashboardModel model) {
        this.model = model;
    }
 
     
    
}
