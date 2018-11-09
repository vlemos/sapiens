
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
 * <p>Classe Java de ordemcomprabuscarPendentes3OutOrdemCompraItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ordemcomprabuscarPendentes3OutOrdemCompraItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeSolicitada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rateio" type="{http://services.senior.com.br}ordemcomprabuscarPendentes3OutOrdemCompraItemRateio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="siglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorLiquido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorLiquidoMoeda" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDs1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDs2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDs3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDs4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDs5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrDsc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrEmb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrFre" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrLpr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrOut" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vlrSeg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordemcomprabuscarPendentes3OutOrdemCompraItem", propOrder = {
    "descricao",
    "descricaoMoeda",
    "observacao",
    "quantidadeSolicitada",
    "rateio",
    "siglaMoeda",
    "unidadeMedida",
    "valorLiquido",
    "valorLiquidoMoeda",
    "valorUnitario",
    "vlrBru",
    "vlrDs1",
    "vlrDs2",
    "vlrDs3",
    "vlrDs4",
    "vlrDs5",
    "vlrDsc",
    "vlrEmb",
    "vlrFre",
    "vlrLpr",
    "vlrOut",
    "vlrSeg"
})
public class OrdemcomprabuscarPendentes3OutOrdemCompraItem {

    @XmlElementRef(name = "descricao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;
    @XmlElementRef(name = "descricaoMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoMoeda;
    @XmlElementRef(name = "observacao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "quantidadeSolicitada", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quantidadeSolicitada;
    @XmlElement(nillable = true)
    protected List<OrdemcomprabuscarPendentes3OutOrdemCompraItemRateio> rateio;
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
    @XmlElementRef(name = "vlrBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrBru;
    @XmlElementRef(name = "vlrDs1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDs1;
    @XmlElementRef(name = "vlrDs2", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDs2;
    @XmlElementRef(name = "vlrDs3", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDs3;
    @XmlElementRef(name = "vlrDs4", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDs4;
    @XmlElementRef(name = "vlrDs5", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDs5;
    @XmlElementRef(name = "vlrDsc", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrDsc;
    @XmlElementRef(name = "vlrEmb", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrEmb;
    @XmlElementRef(name = "vlrFre", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrFre;
    @XmlElementRef(name = "vlrLpr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrLpr;
    @XmlElementRef(name = "vlrOut", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrOut;
    @XmlElementRef(name = "vlrSeg", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrSeg;

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
     * {@link OrdemcomprabuscarPendentes3OutOrdemCompraItemRateio }
     * 
     * 
     */
    public List<OrdemcomprabuscarPendentes3OutOrdemCompraItemRateio> getRateio() {
        if (rateio == null) {
            rateio = new ArrayList<OrdemcomprabuscarPendentes3OutOrdemCompraItemRateio>();
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

    /**
     * Obtém o valor da propriedade vlrBru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrBru() {
        return vlrBru;
    }

    /**
     * Define o valor da propriedade vlrBru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrBru(JAXBElement<Double> value) {
        this.vlrBru = value;
    }

    /**
     * Obtém o valor da propriedade vlrDs1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDs1() {
        return vlrDs1;
    }

    /**
     * Define o valor da propriedade vlrDs1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDs1(JAXBElement<Double> value) {
        this.vlrDs1 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDs2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDs2() {
        return vlrDs2;
    }

    /**
     * Define o valor da propriedade vlrDs2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDs2(JAXBElement<Double> value) {
        this.vlrDs2 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDs3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDs3() {
        return vlrDs3;
    }

    /**
     * Define o valor da propriedade vlrDs3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDs3(JAXBElement<Double> value) {
        this.vlrDs3 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDs4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDs4() {
        return vlrDs4;
    }

    /**
     * Define o valor da propriedade vlrDs4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDs4(JAXBElement<Double> value) {
        this.vlrDs4 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDs5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDs5() {
        return vlrDs5;
    }

    /**
     * Define o valor da propriedade vlrDs5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDs5(JAXBElement<Double> value) {
        this.vlrDs5 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDsc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrDsc() {
        return vlrDsc;
    }

    /**
     * Define o valor da propriedade vlrDsc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrDsc(JAXBElement<Double> value) {
        this.vlrDsc = value;
    }

    /**
     * Obtém o valor da propriedade vlrEmb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrEmb() {
        return vlrEmb;
    }

    /**
     * Define o valor da propriedade vlrEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrEmb(JAXBElement<Double> value) {
        this.vlrEmb = value;
    }

    /**
     * Obtém o valor da propriedade vlrFre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrFre() {
        return vlrFre;
    }

    /**
     * Define o valor da propriedade vlrFre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrFre(JAXBElement<Double> value) {
        this.vlrFre = value;
    }

    /**
     * Obtém o valor da propriedade vlrLpr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrLpr() {
        return vlrLpr;
    }

    /**
     * Define o valor da propriedade vlrLpr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrLpr(JAXBElement<Double> value) {
        this.vlrLpr = value;
    }

    /**
     * Obtém o valor da propriedade vlrOut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrOut() {
        return vlrOut;
    }

    /**
     * Define o valor da propriedade vlrOut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrOut(JAXBElement<Double> value) {
        this.vlrOut = value;
    }

    /**
     * Obtém o valor da propriedade vlrSeg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrSeg() {
        return vlrSeg;
    }

    /**
     * Define o valor da propriedade vlrSeg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrSeg(JAXBElement<Double> value) {
        this.vlrSeg = value;
    }

}
