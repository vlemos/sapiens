
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
 * <p>Classe Java de estoquesConsultarEstoqueOutProdutosDerivacoesDepositos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesConsultarEstoqueOutProdutosDerivacoesDepositos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lotes" type="{http://services.senior.com.br}estoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numCgc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdBlo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdDis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="series" type="{http://services.senior.com.br}estoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesConsultarEstoqueOutProdutosDerivacoesDepositos", propOrder = {
    "codDep",
    "codFil",
    "lotes",
    "numCgc",
    "qtdBlo",
    "qtdDis",
    "qtdEst",
    "qtdRes",
    "series"
})
public class EstoquesConsultarEstoqueOutProdutosDerivacoesDepositos {

    @XmlElementRef(name = "codDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDep;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElement(nillable = true)
    protected List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes> lotes;
    @XmlElementRef(name = "numCgc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCgc;
    @XmlElementRef(name = "qtdBlo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdBlo;
    @XmlElementRef(name = "qtdDis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdDis;
    @XmlElementRef(name = "qtdEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdEst;
    @XmlElementRef(name = "qtdRes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdRes;
    @XmlElement(nillable = true)
    protected List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries> series;

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
     * Obtém o valor da propriedade codFil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodFil() {
        return codFil;
    }

    /**
     * Define o valor da propriedade codFil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodFil(JAXBElement<Integer> value) {
        this.codFil = value;
    }

    /**
     * Gets the value of the lotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes }
     * 
     * 
     */
    public List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes> getLotes() {
        if (lotes == null) {
            lotes = new ArrayList<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosLotes>();
        }
        return this.lotes;
    }

    /**
     * Obtém o valor da propriedade numCgc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumCgc() {
        return numCgc;
    }

    /**
     * Define o valor da propriedade numCgc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumCgc(JAXBElement<String> value) {
        this.numCgc = value;
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

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries }
     * 
     * 
     */
    public List<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries> getSeries() {
        if (series == null) {
            series = new ArrayList<EstoquesConsultarEstoqueOutProdutosDerivacoesDepositosSeries>();
        }
        return this.series;
    }

}
