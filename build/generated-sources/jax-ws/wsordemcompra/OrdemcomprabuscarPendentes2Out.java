
package wsordemcompra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ordemcomprabuscarPendentes2Out complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ordemcomprabuscarPendentes2Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erroExecucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordemCompra" type="{http://services.senior.com.br}ordemcomprabuscarPendentes2OutOrdemCompra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordemcomprabuscarPendentes2Out", propOrder = {
    "codigoResultado",
    "erroExecucao",
    "ordemCompra",
    "resultado"
})
public class OrdemcomprabuscarPendentes2Out {

    @XmlElementRef(name = "codigoResultado", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoResultado;
    @XmlElementRef(name = "erroExecucao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> erroExecucao;
    @XmlElement(nillable = true)
    protected List<OrdemcomprabuscarPendentes2OutOrdemCompra> ordemCompra;
    @XmlElementRef(name = "resultado", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;

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
     * Gets the value of the ordemCompra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordemCompra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdemCompra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdemcomprabuscarPendentes2OutOrdemCompra }
     * 
     * 
     */
    public List<OrdemcomprabuscarPendentes2OutOrdemCompra> getOrdemCompra() {
        if (ordemCompra == null) {
            ordemCompra = new ArrayList<OrdemcomprabuscarPendentes2OutOrdemCompra>();
        }
        return this.ordemCompra;
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

}
