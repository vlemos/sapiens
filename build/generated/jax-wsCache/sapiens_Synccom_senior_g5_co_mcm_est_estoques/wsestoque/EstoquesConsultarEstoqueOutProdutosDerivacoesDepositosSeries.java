
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numSep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdDis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries", propOrder = {
    "numSep",
    "qtdDis"
})
public class EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries {

    @XmlElementRef(name = "numSep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numSep;
    @XmlElementRef(name = "qtdDis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdDis;

    /**
     * Obtém o valor da propriedade numSep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumSep() {
        return numSep;
    }

    /**
     * Define o valor da propriedade numSep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumSep(JAXBElement<String> value) {
        this.numSep = value;
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

}
