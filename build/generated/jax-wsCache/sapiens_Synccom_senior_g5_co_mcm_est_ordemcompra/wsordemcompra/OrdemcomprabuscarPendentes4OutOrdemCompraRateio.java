
package wsordemcompra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ordemcomprabuscarPendentes4OutOrdemCompraRateio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ordemcomprabuscarPendentes4OutOrdemCompraRateio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abreviaturaCentroCustos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoCentroCustos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentualRateio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorRateio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordemcomprabuscarPendentes4OutOrdemCompraRateio", propOrder = {
    "abreviaturaCentroCustos",
    "codigoCentroCustos",
    "percentualRateio",
    "valorRateio"
})
public class OrdemcomprabuscarPendentes4OutOrdemCompraRateio {

    @XmlElementRef(name = "abreviaturaCentroCustos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abreviaturaCentroCustos;
    @XmlElementRef(name = "codigoCentroCustos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCentroCustos;
    @XmlElementRef(name = "percentualRateio", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentualRateio;
    @XmlElementRef(name = "valorRateio", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorRateio;

    /**
     * Obtém o valor da propriedade abreviaturaCentroCustos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbreviaturaCentroCustos() {
        return abreviaturaCentroCustos;
    }

    /**
     * Define o valor da propriedade abreviaturaCentroCustos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbreviaturaCentroCustos(JAXBElement<String> value) {
        this.abreviaturaCentroCustos = value;
    }

    /**
     * Obtém o valor da propriedade codigoCentroCustos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCentroCustos() {
        return codigoCentroCustos;
    }

    /**
     * Define o valor da propriedade codigoCentroCustos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCentroCustos(JAXBElement<String> value) {
        this.codigoCentroCustos = value;
    }

    /**
     * Obtém o valor da propriedade percentualRateio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentualRateio() {
        return percentualRateio;
    }

    /**
     * Define o valor da propriedade percentualRateio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentualRateio(JAXBElement<Double> value) {
        this.percentualRateio = value;
    }

    /**
     * Obtém o valor da propriedade valorRateio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorRateio() {
        return valorRateio;
    }

    /**
     * Define o valor da propriedade valorRateio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorRateio(JAXBElement<Double> value) {
        this.valorRateio = value;
    }

}
