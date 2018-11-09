/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.primefaces.PrimeFaces;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.UsuarioRubi;

/**
 *
 * @author vinicius.lemos
 */

@SessionScoped
@ManagedBean(name = "loginrubicontroller")
public class LoginRubiController {
    
    private UsuarioRubi usuarioRubi;

    /**
     * @return the usuarioRubi
     */
    public UsuarioRubi getUsuarioRubi() {
        
        return usuarioRubi;
    }

    /**
     * @param usuarioRubi the usuarioRubi to set
     */
    public void setUsuarioRubi(UsuarioRubi usuarioRubi) {
        this.usuarioRubi = usuarioRubi;
    }
    
    public void loginRubi(){
        System.out.println("Logando no Rubi");
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", true);
        options.put("modal", true);
        options.put("width", 350);
        options.put("height", 150);

        PrimeFaces.current().dialog().openDynamic("loginrubi.xhtml", options, null);
    }
    
    public String confirmarLoginRubi(){
        return "Confirmado";
    }
    
  
    
    
}
