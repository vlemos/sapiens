
package wsordemcompra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ordemcomprabuscarPendentes3OutOrdemCompra complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ordemcomprabuscarPendentes3OutOrdemCompra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoFilial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://services.senior.com.br}ordemcomprabuscarPendentes3OutOrdemCompraItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeFilial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rateio" type="{http://services.senior.com.br}ordemcomprabuscarPendentes3OutOrdemCompraRateio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usuarioSolicitante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valorAproximado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordemcomprabuscarPendentes3OutOrdemCompra", propOrder = {
    "codigoEmpresa",
    "codigoFilial",
    "dataEmissao",
    "item",
    "nomeEmpresa",
    "nomeFilial",
    "nomeFornecedor",
    "nomeSolicitante",
    "numero",
    "observacao",
    "rateio",
    "usuarioSolicitante",
    "valorAproximado"
})
public class OrdemcomprabuscarPendentes3OutOrdemCompra {

    @XmlElementRef(name = "codigoEmpresa", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoEmpresa;
    @XmlElementRef(name = "codigoFilial", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoFilial;
    @XmlElementRef(name = "dataEmissao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataEmissao;
    @XmlElement(nillable = true)
    protected List<OrdemcomprabuscarPendentes3OutOrdemCompraItem> item;
    @XmlElementRef(name = "nomeEmpresa", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeEmpresa;
    @XmlElementRef(name = "nomeFilial", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeFilial;
    @XmlElementRef(name = "nomeFornecedor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeFornecedor;
    @XmlElementRef(name = "nomeSolicitante", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeSolicitante;
    @XmlElementRef(name = "numero", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numero;
    @XmlElementRef(name = "observacao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElement(nillable = true)
    protected List<OrdemcomprabuscarPendentes3OutOrdemCompraRateio> rateio;
    @XmlElementRef(name = "usuarioSolicitante", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> usuarioSolicitante;
    @XmlElementRef(name = "valorAproximado", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorAproximado;

    /**
     * Obtém o valor da propriedade codigoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Define o valor da propriedade codigoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoEmpresa(JAXBElement<Integer> value) {
        this.codigoEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade codigoFilial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoFilial() {
        return codigoFilial;
    }

    /**
     * Define o valor da propriedade codigoFilial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoFilial(JAXBElement<Integer> value) {
        this.codigoFilial = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataEmissao(JAXBElement<String> value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdemcomprabuscarPendentes3OutOrdemCompraItem }
     * 
     * 
     */
    public List<OrdemcomprabuscarPendentes3OutOrdemCompraItem> getItem() {
        if (item == null) {
            item = new ArrayList<OrdemcomprabuscarPendentes3OutOrdemCompraItem>();
        }
        return this.item;
    }

    /**
     * Obtém o valor da propriedade nomeEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Define o valor da propriedade nomeEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEmpresa(JAXBElement<String> value) {
        this.nomeEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade nomeFilial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeFilial() {
        return nomeFilial;
    }

    /**
     * Define o valor da propriedade nomeFilial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeFilial(JAXBElement<String> value) {
        this.nomeFilial = value;
    }

    /**
     * Obtém o valor da propriedade nomeFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * Define o valor da propriedade nomeFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeFornecedor(JAXBElement<String> value) {
        this.nomeFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade nomeSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeSolicitante() {
        return nomeSolicitante;
    }

    /**
     * Define o valor da propriedade nomeSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeSolicitante(JAXBElement<String> value) {
        this.nomeSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumero(JAXBElement<Integer> value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacao(JAXBElement<String> value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the rateio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdemcomprabuscarPendentes3OutOrdemCompraRateio }
     * 
     * 
     */
    public List<OrdemcomprabuscarPendentes3OutOrdemCompraRateio> getRateio() {
        if (rateio == null) {
            rateio = new ArrayList<OrdemcomprabuscarPendentes3OutOrdemCompraRateio>();
        }
        return this.rateio;
    }

    /**
     * Obtém o valor da propriedade usuarioSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    /**
     * Define o valor da propriedade usuarioSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUsuarioSolicitante(JAXBElement<Integer> value) {
        this.usuarioSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade valorAproximado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorAproximado() {
        return valorAproximado;
    }

    /**
     * Define o valor da propriedade valorAproximado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorAproximado(JAXBElement<Double> value) {
        this.valorAproximado = value;
    }

}
