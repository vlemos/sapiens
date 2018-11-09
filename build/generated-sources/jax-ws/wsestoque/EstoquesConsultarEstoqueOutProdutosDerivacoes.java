
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
 * <p>Classe Java de estoquesConsultarEstoqueOutProdutosDerivacoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesConsultarEstoqueOutProdutosDerivacoes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codDer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPdv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositos" type="{http://services.senior.com.br}estoquesConsultarEstoqueOutProdutosDerivacoesDepositos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="qtdBlo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qtdDis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdEst" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qtdRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesConsultarEstoqueOutProdutosDerivacoes", propOrder = {
    "codDer",
    "codPdv",
    "depositos",
    "qtdBlo",
    "qtdDis",
    "qtdEst",
    "qtdRes"
})
public class EstoquesConsultarEstoqueOutProdutosDerivacoes {

    @XmlElementRef(name = "codDer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDer;
    @XmlElementRef(name = "codPdv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPdv;
    @XmlElement(nillable = true)
    protected List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos> depositos;
    @XmlElementRef(name = "qtdBlo", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qtdBlo;
    @XmlElementRef(name = "qtdDis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdDis;
    @XmlElementRef(name = "qtdEst", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qtdEst;
    @XmlElementRef(name = "qtdRes", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qtdRes;

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
     * Obtém o valor da propriedade codPdv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPdv() {
        return codPdv;
    }

    /**
     * Define o valor da propriedade codPdv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPdv(JAXBElement<String> value) {
        this.codPdv = value;
    }

    /**
     * Gets the value of the depositos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos }
     * 
     * 
     */
    public List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos> getDepositos() {
        if (depositos == null) {
            depositos = new ArrayList<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos>();
        }
        return this.depositos;
    }

    /**
     * Obtém o valor da propriedade qtdBlo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQtdBlo() {
        return qtdBlo;
    }

    /**
     * Define o valor da propriedade qtdBlo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQtdBlo(JAXBElement<Double> value) {
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
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQtdEst() {
        return qtdEst;
    }

    /**
     * Define o valor da propriedade qtdEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQtdEst(JAXBElement<Double> value) {
        this.qtdEst = value;
    }

    /**
     * Obtém o valor da propriedade qtdRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQtdRes() {
        return qtdRes;
    }

    /**
     * Define o valor da propriedade qtdRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQtdRes(JAXBElement<Double> value) {
        this.qtdRes = value;
    }

}
