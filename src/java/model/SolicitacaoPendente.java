/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinicius.lemos
 */
public class SolicitacaoPendente implements java.io.Serializable {
    private int codEmpresa;
    private int codFilial;
    private int numSolicitacao;
    private int seq;
    private String descProdutoServico;
    private double qtdsolicitada;
    private double vlrUnit;
    private String dataSolicitacao;
    private double vlrAproximado;
    private int chavecontrole;
    private String observacao;
    private String nomeSolicitante;
    
    

    /**
     * @return the codEmpresa
     */
    public int getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * @param codEmpresa the codEmpresa to set
     */
    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    /**
     * @return the codFilial
     */
    public int getCodFilial() {
        return codFilial;
    }

    /**
     * @param codFilial the codFilial to set
     */
    public void setCodFilial(int codFilial) {
        this.codFilial = codFilial;
    }

    /**
     * @return the numSolicitacao
     */
    public int getNumSolicitacao() {
        return numSolicitacao;
    }

    /**
     * @param numSolicitacao the numSolicitacao to set
     */
    public void setNumSolicitacao(int numSolicitacao) {
        this.numSolicitacao = numSolicitacao;
    }

    /**
     * @return the descProdutoServico
     */
    public String getDescProdutoServico() {
        return descProdutoServico;
    }

    /**
     * @param descProdutoServico the descProdutoServico to set
     */
    public void setDescProdutoServico(String descProdutoServico) {
        this.descProdutoServico = descProdutoServico;
    }

    /**
     * @return the qtdsolicitada
     */
    public double getQtdsolicitada() {
        return qtdsolicitada;
    }

    /**
     * @param qtdsolicitada the qtdsolicitada to set
     */
    public void setQtdsolicitada(double qtdsolicitada) {
        this.qtdsolicitada = qtdsolicitada;
    }

    /**
     * @return the vlrUnit
     */
    public double getVlrUnit() {
        return vlrUnit;
    }

    /**
     * @param vlrUnit the vlrUnit to set
     */
    public void setVlrUnit(double vlrUnit) {
        this.vlrUnit = vlrUnit;
    }

   
    /**
     * @return the seq
     */
    public int getSeq() {
        return seq;
    }

    /**
     * @param seq the seq to set
     */
    public void setSeq(int seq) {
        this.seq = seq;
    }

    /**
     * @return the vlrAproximado
     */
    public double getVlrAproximado() {
        return vlrAproximado;
    }

    /**
     * @param vlrAproximado the vlrAproximado to set
     */
    public void setVlrAproximado(double vlrAproximado) {
        this.vlrAproximado = vlrAproximado;
    }

    /**
     * @return the dataSolicitacao
     */
    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * @param dataSolicitacao the dataSolicitacao to set
     */
    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    /**
     * @return the chavecontrole
     */
    public int getChavecontrole() {
        return chavecontrole;
    }

    /**
     * @param chavecontrole the chavecontrole to set
     */
    public void setChavecontrole(int chavecontrole) {
        this.chavecontrole = chavecontrole;
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
    
}
