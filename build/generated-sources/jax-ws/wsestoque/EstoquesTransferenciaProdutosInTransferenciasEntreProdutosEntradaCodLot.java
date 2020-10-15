
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datVlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot", propOrder = {
    "codLot",
    "datFab",
    "datVlt",
    "qtdEst"
})
public class EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntradaCodLot {

    @XmlElementRef(name = "codLot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codLot;
    @XmlElementRef(name = "datFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datFab;
    @XmlElementRef(name = "datVlt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datVlt;
    @XmlElementRef(name = "qtdEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdEst;

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
     * Obtém o valor da propriedade datFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatFab() {
        return datFab;
    }

    /**
     * Define o valor da propriedade datFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatFab(JAXBElement<String> value) {
        this.datFab = value;
    }

    /**
     * Obtém o valor da propriedade datVlt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatVlt() {
        return datVlt;
    }

    /**
     * Define o valor da propriedade datVlt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatVlt(JAXBElement<String> value) {
        this.datVlt = value;
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

}
