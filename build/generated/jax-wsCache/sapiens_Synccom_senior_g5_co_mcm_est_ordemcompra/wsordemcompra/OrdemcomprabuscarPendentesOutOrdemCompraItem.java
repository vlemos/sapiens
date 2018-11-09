
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
 * <p>Classe Java de ordemcomprabuscarPendentesOutOrdemCompraItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ordemcomprabuscarPendentesOutOrdemCompraItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeSolicitada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rateio" type="{http://services.senior.com.br}ordemcomprabuscarPendentesOutOrdemCompraItemRateio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="siglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorLiquido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorLiquidoMoeda" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordemcomprabuscarPendentesOutOrdemCompraItem", propOrder = {
    "descricao",
    "descricaoMoeda",
    "observacao",
    "quantidadeSolicitada",
    "rateio",
    "siglaMoeda",
    "unidadeMedida",
    "valorLiquido",
    "valorLiquidoMoeda",
    "valorUnitario"
})
public class OrdemcomprabuscarPendentesOutOrdemCompraItem {

    @XmlElementRef(name = "descricao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;
    @XmlElementRef(name = "descricaoMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoMoeda;
    @XmlElementRef(name = "observacao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "quantidadeSolicitada", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quantidadeSolicitada;
    @XmlElement(nillable = true)
    protected List<OrdemcomprabuscarPendentesOutOrdemCompraItemRateio> rateio;
    @XmlElementRef(name = "siglaMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaMoeda;
    @XmlElementRef(name = "unidadeMedida", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadeMedida;
    @XmlElementRef(name = "valorLiquido", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorLiquido;
    @XmlElementRef(name = "valorLiquidoMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorLiquidoMoeda;
    @XmlElementRef(name = "valorUnitario", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorUnitario;

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoMoeda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricaoMoeda() {
        return descricaoMoeda;
    }

    /**
     * Define o valor da propriedade descricaoMoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricaoMoeda(JAXBElement<String> value) {
        this.descricaoMoeda = value;
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
     * Obtém o valor da propriedade quantidadeSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Define o valor da propriedade quantidadeSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQuantidadeSolicitada(JAXBElement<Double> value) {
        this.quantidadeSolicitada = value;
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
     * {@link OrdemcomprabuscarPendentesOutOrdemCompraItemRateio }
     * 
     * 
     */
    public List<OrdemcomprabuscarPendentesOutOrdemCompraItemRateio> getRateio() {
        if (rateio == null) {
            rateio = new ArrayList<OrdemcomprabuscarPendentesOutOrdemCompraItemRateio>();
        }
        return this.rateio;
    }

    /**
     * Obtém o valor da propriedade siglaMoeda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaMoeda() {
        return siglaMoeda;
    }

    /**
     * Define o valor da propriedade siglaMoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaMoeda(JAXBElement<String> value) {
        this.siglaMoeda = value;
    }

    /**
     * Obtém o valor da propriedade unidadeMedida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Define o valor da propriedade unidadeMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadeMedida(JAXBElement<String> value) {
        this.unidadeMedida = value;
    }

    /**
     * Obtém o valor da propriedade valorLiquido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorLiquido() {
        return valorLiquido;
    }

    /**
     * Define o valor da propriedade valorLiquido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorLiquido(JAXBElement<Double> value) {
        this.valorLiquido = value;
    }

    /**
     * Obtém o valor da propriedade valorLiquidoMoeda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorLiquidoMoeda() {
        return valorLiquidoMoeda;
    }

    /**
     * Define o valor da propriedade valorLiquidoMoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorLiquidoMoeda(JAXBElement<Double> value) {
        this.valorLiquidoMoeda = value;
    }

    /**
     * Obtém o valor da propriedade valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorUnitario(JAXBElement<Double> value) {
        this.valorUnitario = value;
    }

}
