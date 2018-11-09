/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius.lemos
 */
public class OrdemPendente {
private int usuarioSolicitante;
private String nomeSolicitante; 
private int codigoEmpresa;
private String nomeEmpresa; 
private int codigoFilial; 
private String nomeFilial;
private int numero;
private String dataEmissao;
private String nomeFornecedor;
private double valorAproximado;
private String observacao;
private int chaveControle;
private List<AnexosOC> anexos = new ArrayList();

    /**
     * @return the usuarioSolicitante
     */
    public int getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    /**
     * @param usuarioSolicitante the usuarioSolicitante to set
     */
    public void setUsuarioSolicitante(int usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    /**
     * @return the nomeSolicitante
     */
    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    /**
     * @param nomeSolicitante the nomeSolicitante to set
     */
    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    /**
     * @return the codigoEmpresa
     */
    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the codigoFilial
     */
    public int getCodigoFilial() {
        return codigoFilial;
    }

    /**
     * @param codigoFilial the codigoFilial to set
     */
    public void setCodigoFilial(int codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    /**
     * @return the nomeFilial
     */
    public String getNomeFilial() {
        return nomeFilial;
    }

    /**
     * @param nomeFilial the nomeFilial to set
     */
    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dataEmissao
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the valorAproximado
     */
    public double getValorAproximado() {
        return valorAproximado;
    }

    /**
     * @param valorAproximado the valorAproximado to set
     */
    public void setValorAproximado(double valorAproximado) {
        this.valorAproximado = valorAproximado;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the chaveControle
     */
    public int getChaveControle() {
        return chaveControle;
    }

    /**
     * @param chaveControle the chaveControle to set
     */
    public void setChaveControle(int chaveControle) {
        this.chaveControle = chaveControle;
    }

    /**
     * @return the anexos
     */
    public List<AnexosOC> getAnexos() {
        return anexos;
    }

    /**
     * @param anexos the anexos to set
     */
    public void setAnexos(List<AnexosOC> anexos) {
        this.anexos = anexos;
    }
    
    public void addAnexos(AnexosOC anexo){
        anexos.add(anexo);
    }
    
    public void removeAnexos(AnexosOC anexo){
        anexos.remove(anexo);
    }
    
    public void removeAllAnexos(){
        anexos.removeAll(anexos);
    }


    
}
