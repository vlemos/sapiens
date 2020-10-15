
package wsestoque;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCli" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codLot" type="{http://services.senior.com.br}estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctaFin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ctaRed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="qtdMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniMed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada", propOrder = {
    "codCcu",
    "codCli",
    "codDep",
    "codDer",
    "codFor",
    "codLot",
    "codPro",
    "ctaFin",
    "ctaRed",
    "numDoc",
    "qtdMov",
    "uniMed",
    "vlrMov"
})
public class EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada {

    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codCli", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codCli;
    @XmlElementRef(name = "codDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDep;
    @XmlElementRef(name = "codDer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDer;
    @XmlElementRef(name = "codFor", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFor;
    @XmlElement(nillable = true)
    protected List<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot> codLot;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPro;
    @XmlElementRef(name = "ctaFin", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ctaFin;
    @XmlElementRef(name = "ctaRed", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ctaRed;
    @XmlElementRef(name = "numDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numDoc;
    @XmlElementRef(name = "qtdMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdMov;
    @XmlElementRef(name = "uniMed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniMed;
    @XmlElementRef(name = "vlrMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrMov;

    /**
     * Obtém o valor da propriedade codCcu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCcu() {
        return codCcu;
    }

    /**
     * Define o valor da propriedade codCcu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCcu(JAXBElement<String> value) {
        this.codCcu = value;
    }

    /**
     * Obtém o valor da propriedade codCli.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodCli() {
        return codCli;
    }

    /**
     * Define o valor da propriedade codCli.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodCli(JAXBElement<Integer> value) {
        this.codCli = value;
    }

    /**
     * Obtém o valor da propriedade codDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodDep() {
        return codDep;
    }

    /**
     * Define o valor da propriedade codDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodDep(JAXBElement<String> value) {
        this.codDep = value;
    }

    /**
     * Obtém o valor da propriedade codDer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodDer() {
        return codDer;
    }

    /**
     * Define o valor da propriedade codDer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodDer(JAXBElement<String> value) {
        this.codDer = value;
    }

    /**
     * Obtém o valor da propriedade codFor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodFor() {
        return codFor;
    }

    /**
     * Define o valor da propriedade codFor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodFor(JAXBElement<Integer> value) {
        this.codFor = value;
    }

    /**
     * Gets the value of the codLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot }
     * 
     * 
     */
    public List<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot> getCodLot() {
        if (codLot == null) {
            codLot = new ArrayList<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot>();
        }
        return this.codLot;
    }

    /**
     * Obtém o valor da propriedade codPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPro() {
        return codPro;
    }

    /**
     * Define o valor da propriedade codPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPro(JAXBElement<String> value) {
        this.codPro = value;
    }

    /**
     * Obtém o valor da propriedade ctaFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCtaFin() {
        return ctaFin;
    }

    /**
     * Define o valor da propriedade ctaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCtaFin(JAXBElement<Integer> value) {
        this.ctaFin = value;
    }

    /**
     * Obtém o valor da propriedade ctaRed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCtaRed() {
        return ctaRed;
    }

    /**
     * Define o valor da propriedade ctaRed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCtaRed(JAXBElement<Integer> value) {
        this.ctaRed = value;
    }

    /**
     * Obtém o valor da propriedade numDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumDoc() {
        return numDoc;
    }

    /**
     * Define o valor da propriedade numDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumDoc(JAXBElement<Integer> value) {
        this.numDoc = value;
    }

    /**
     * Obtém o valor da propriedade qtdMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdMov() {
        return qtdMov;
    }

    /**
     * Define o valor da propriedade qtdMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdMov(JAXBElement<String> value) {
        this.qtdMov = value;
    }

    /**
     * Obtém o valor da propriedade uniMed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniMed() {
        return uniMed;
    }

    /**
     * Define o valor da propriedade uniMed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniMed(JAXBElement<String> value) {
        this.uniMed = value;
    }

    /**
     * Obtém o valor da propriedade vlrMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrMov() {
        return vlrMov;
    }

    /**
     * Define o valor da propriedade vlrMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrMov(JAXBElement<String> value) {
        this.vlrMov = value;
    }

}
