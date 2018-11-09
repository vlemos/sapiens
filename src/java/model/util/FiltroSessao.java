/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author vinicius.lemos
 */
@WebFilter("/*")
public class FiltroSessao implements Filter, java.io.Serializable {

    private final static String FILTER_APPLIED = "_security_filter_applied";

    public FiltroSessao() {
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest hreq = (HttpServletRequest) request;
        HttpServletResponse hresp = (HttpServletResponse) response;
        HttpSession session = hreq.getSession();

        hreq.getPathInfo();
        String paginaAtual = new String(hreq.getRequestURL());
     //   System.out.println(">>>>>>>" + paginaAtual);

        if ((request.getAttribute(FILTER_APPLIED) == null)
                && paginaAtual != null
                && (!paginaAtual.endsWith("index.xhtml"))
                && (paginaAtual.endsWith(".xhtml"))) {

            request.setAttribute(FILTER_APPLIED, Boolean.TRUE);

           Usuario usuario = (Usuario) session.getAttribute("usuario");
    

            if ((usuario == null) || (usuario.getUsuario().equals(""))) {
                System.out.println("Filtro       : usuario não logado.. perdeu a sessao");
            
                response.setContentType("text/xml");
                response.getWriter()
                        .append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                        .printf("<partial-response><redirect url=\"%s\"></redirect></partial-response>", hreq.getContextPath());
    
                
                
       
            } else {
                chain.doFilter(request, response);
            }
            System.out.println("Filtro       : Passou pelo filtro de Sessão, usuario Logado : " + usuario.getUsuario());

        } else {
            // entrega a requisição para o proximo filtros sss
            chain.doFilter(request, response);
        }
    }

}
