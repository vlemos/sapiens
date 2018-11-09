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
public class Produto implements java.io.Serializable{
    private String codProduto;
    private String codDerivacao;
    private String codDeposito;
    private String qtdEstoque;

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
     * @return the qtdEstoque
     */
    public String getQtdEstoque() {
        return qtdEstoque;
    }

    /**
     * @param qtdEstoque the qtdEstoque to set
     */
    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
}
