
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
 * <p>Classe Java de estoquesMovimentarEstoqueOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesMovimentarEstoqueOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erroExecucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retornoMovimento" type="{http://services.senior.com.br}estoquesMovimentarEstoqueOutRetornoMovimento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tipoRetorno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesMovimentarEstoqueOut", propOrder = {
    "erroExecucao",
    "mensagemRetorno",
    "retornoMovimento",
    "tipoRetorno"
})
public class EstoquesMovimentarEstoqueOut {

    @XmlElementRef(name = "erroExecucao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> erroExecucao;
    @XmlElementRef(name = "mensagemRetorno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensagemRetorno;
    @XmlElement(nillable = true)
    protected List<EstoquesMovimentarEstoqueOutRetornoMovimento> retornoMovimento;
    @XmlElementRef(name = "tipoRetorno", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipoRetorno;

    /**
     * Obtém o valor da propriedade erroExecucao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErroExecucao() {
        return erroExecucao;
    }

    /**
     * Define o valor da propriedade erroExecucao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErroExecucao(JAXBElement<String> value) {
        this.erroExecucao = value;
    }

    /**
     * Obtém o valor da propriedade mensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Define o valor da propriedade mensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensagemRetorno(JAXBElement<String> value) {
        this.mensagemRetorno = value;
    }

    /**
     * Gets the value of the retornoMovimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoMovimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoMovimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstoquesMovimentarEstoqueOutRetornoMovimento }
     * 
     * 
     */
    public List<EstoquesMovimentarEstoqueOutRetornoMovimento> getRetornoMovimento() {
        if (retornoMovimento == null) {
            retornoMovimento = new ArrayList<EstoquesMovimentarEstoqueOutRetornoMovimento>();
        }
        return this.retornoMovimento;
    }

    /**
     * Obtém o valor da propriedade tipoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipoRetorno() {
        return tipoRetorno;
    }

    /**
     * Define o valor da propriedade tipoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipoRetorno(JAXBElement<Integer> value) {
        this.tipoRetorno = value;
    }

}
