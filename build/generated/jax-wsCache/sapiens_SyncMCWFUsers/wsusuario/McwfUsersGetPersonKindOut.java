
package wsusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mcwfUsersGetPersonKindOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mcwfUsersGetPersonKindOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erroExecucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pmPersonKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mcwfUsersGetPersonKindOut", propOrder = {
    "erroExecucao",
    "pmPersonKind"
})
public class McwfUsersGetPersonKindOut {

    @XmlElementRef(name = "erroExecucao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> erroExecucao;
    @XmlElementRef(name = "pmPersonKind", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pmPersonKind;

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
     * Obtém o valor da propriedade pmPersonKind.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPmPersonKind() {
        return pmPersonKind;
    }

    /**
     * Define o valor da propriedade pmPersonKind.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPmPersonKind(JAXBElement<String> value) {
        this.pmPersonKind = value;
    }

}
