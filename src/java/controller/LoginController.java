package controller;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import model.Usuario;
import wsusuario.G5SeniorServices;
import wsusuario.McwfUsersAuthenticateJAASIn;
import wsusuario.McwfUsersAuthenticateJAASOut;
import wsusuario.SapiensSyncMCWFUsers;

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
@ManagedBean(name = "loginController")
public class LoginController implements java.io.Serializable {
    private Usuario usuario = new Usuario();
    

    
    public String logar(){
        G5SeniorServices teste = new G5SeniorServices();
        SapiensSyncMCWFUsers usuarios = teste.getSapiensSyncMCWFUsersPort();
         JAXBElement<String> pNome = new JAXBElement<>(new QName("pmUserName"),String.class, usuario.getUsuario());
         JAXBElement<String> pSenha = new JAXBElement<>(new QName("pmUserPassword"),String.class, usuario.getSenha());
         JAXBElement<Integer> pEncrypted = new JAXBElement<>(new QName("pmEncrypted"),Integer.class, 0);
         
         
         McwfUsersAuthenticateJAASIn parametros = new McwfUsersAuthenticateJAASIn();
         parametros.setPmUserName(pNome);
         parametros.setPmUserPassword(pSenha);
         parametros.setPmEncrypted(pEncrypted);
         
         
         
         
        McwfUsersAuthenticateJAASOut retorno = usuarios.authenticateJAAS("", "", 0, parametros);
        //System.out.println(retorno.getPmLogged().getValue());
        //System.out.println(retorno.getErroExecucao().getValue());
        
        
        
        if(retorno.getPmLogged().getValue().equals("0")){
            System.out.println("Usuario Logou com sucesso :" + usuario.getUsuario() );
            addMessage("", "Login com Sucesso!");
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
            return "/restrito/principal.xhtml";
        }else{
            addMessage("", "Usuário ou senha inválidos");
            System.out.println("Usuario errou a senha");
            return "/index.xhtml";
        }
            
        
                       
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
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
 
    
   
}
