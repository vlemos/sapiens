
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdBlo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdDis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes", propOrder = {
    "codLot",
    "qtdBlo",
    "qtdDis",
    "qtdEst",
    "qtdRes"
})
public class EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes {

    @XmlElementRef(name = "codLot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codLot;
    @XmlElementRef(name = "qtdBlo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdBlo;
    @XmlElementRef(name = "qtdDis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdDis;
    @XmlElementRef(name = "qtdEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdEst;
    @XmlElementRef(name = "qtdRes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdRes;

    /**
     * Obtém o valor da propriedade codLot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodLot() {
        return codLot;
    }

    /**
     * Define o valor da propriedade codLot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodLot(JAXBElement<String> value) {
        this.codLot = value;
    }

    /**
     * Obtém o valor da propriedade qtdBlo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdBlo() {
        return qtdBlo;
    }

    /**
     * Define o valor da propriedade qtdBlo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdBlo(JAXBElement<String> value) {
        this.qtdBlo = value;
    }

    /**
     * Obtém o valor da propriedade qtdDis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdDis() {
        return qtdDis;
    }

    /**
     * Define o valor da propriedade qtdDis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdDis(JAXBElement<String> value) {
        this.qtdDis = value;
    }

    /**
     * Obtém o valor da propriedade qtdEst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdEst() {
        return qtdEst;
    }

    /**
     * Define o valor da propriedade qtdEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdEst(JAXBElement<String> value) {
        this.qtdEst = value;
    }

    /**
     * Obtém o valor da propriedade qtdRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdRes() {
        return qtdRes;
    }

    /**
     * Define o valor da propriedade qtdRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdRes(JAXBElement<String> value) {
        this.qtdRes = value;
    }

}
