
package wssolicitacaopendente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaocomprareprovarOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaocomprareprovarOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erroExecucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retorno" type="{http://services.senior.com.br}solicitacaocomprareprovarOutRetorno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaocomprareprovarOut", propOrder = {
    "codigoResultado",
    "erroExecucao",
    "resultado",
    "retorno"
})
public class SolicitacaocomprareprovarOut {

    @XmlElementRef(name = "codigoResultado", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoResultado;
    @XmlElementRef(name = "erroExecucao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> erroExecucao;
    @XmlElementRef(name = "resultado", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;
    @XmlElement(nillable = true)
    protected List<SolicitacaocomprareprovarOutRetorno> retorno;

    /**
     * Obtém o valor da propriedade codigoResultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoResultado() {
        return codigoResultado;
    }

    /**
     * Define o valor da propriedade codigoResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoResultado(JAXBElement<String> value) {
        this.codigoResultado = value;
    }

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
     * Obtém o valor da propriedade resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultado(JAXBElement<String> value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the retorno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retorno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetorno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitacaocomprareprovarOutRetorno }
     * 
     * 
     */
    public List<SolicitacaocomprareprovarOutRetorno> getRetorno() {
        if (retorno == null) {
            retorno = new ArrayList<SolicitacaocomprareprovarOutRetorno>();
        }
        return this.retorno;
    }

}
