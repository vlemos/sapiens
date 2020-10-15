
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
 * <p>Classe Java de estoquesTransferenciaProdutosIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesTransferenciaProdutosIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferenciaEntreProdutosSaida" type="{http://services.senior.com.br}estoquesTransferenciaProdutosInTransferenciaEntreProdutosSaida" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transferenciasEntreProdutosEntrada" type="{http://services.senior.com.br}estoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesTransferenciaProdutosIn", propOrder = {
    "flowInstanceID",
    "flowName",
    "transferenciaEntreProdutosSaida",
    "transferenciasEntreProdutosEntrada"
})
public class EstoquesTransferenciaProdutosIn {

    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElement(nillable = true)
    protected List<EstoquesTransferenciaProdutosInTransferenciaEntreProdutosSaida> transferenciaEntreProdutosSaida;
    @XmlElement(nillable = true)
    protected List<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada> transferenciasEntreProdutosEntrada;

    /**
     * Obtém o valor da propriedade flowInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowInstanceID() {
        return flowInstanceID;
    }

    /**
     * Define o valor da propriedade flowInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowInstanceID(JAXBElement<String> value) {
        this.flowInstanceID = value;
    }

    /**
     * Obtém o valor da propriedade flowName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowName() {
        return flowName;
    }

    /**
     * Define o valor da propriedade flowName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowName(JAXBElement<String> value) {
        this.flowName = value;
    }

    /**
     * Gets the value of the transferenciaEntreProdutosSaida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferenciaEntreProdutosSaida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferenciaEntreProdutosSaida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesTransferenciaProdutosInTransferenciaEntreProdutosSaida }
     * 
     * 
     */
    public List<EstoquesTransferenciaProdutosInTransferenciaEntreProdutosSaida> getTransferenciaEntreProdutosSaida() {
        if (transferenciaEntreProdutosSaida == null) {
            transferenciaEntreProdutosSaida = new ArrayList<EstoquesTransferenciaProdutosInTransferenciaEntreProdutosSaida>();
        }
        return this.transferenciaEntreProdutosSaida;
    }

    /**
     * Gets the value of the transferenciasEntreProdutosEntrada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferenciasEntreProdutosEntrada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferenciasEntreProdutosEntrada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada }
     * 
     * 
     */
    public List<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada> getTransferenciasEntreProdutosEntrada() {
        if (transferenciasEntreProdutosEntrada == null) {
            transferenciasEntreProdutosEntrada = new ArrayList<EstoquesTransferenciaProdutosInTransferenciasEntreProdutosEntrada>();
        }
        return this.transferenciasEntreProdutosEntrada;
    }

}
