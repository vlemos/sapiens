
package wssolicitacaopendente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaocompraaprovarInSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaocompraaprovarInSolicitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numeroSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sequenciaSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaocompraaprovarInSolicitacao", propOrder = {
    "codigoEmpresa",
    "numeroSolicitacao",
    "sequencia",
    "sequenciaSolicitacao"
})
public class SolicitacaocompraaprovarInSolicitacao {

    @XmlElementRef(name = "codigoEmpresa", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoEmpresa;
    @XmlElementRef(name = "numeroSolicitacao", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroSolicitacao;
    @XmlElementRef(name = "sequencia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequencia;
    @XmlElementRef(name = "sequenciaSolicitacao", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequenciaSolicitacao;

    /**
     * Obtém o valor da propriedade codigoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Define o valor da propriedade codigoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoEmpresa(JAXBElement<Integer> value) {
        this.codigoEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade numeroSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroSolicitacao() {
        return numeroSolicitacao;
    }

    /**
     * Define o valor da propriedade numeroSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroSolicitacao(JAXBElement<Integer> value) {
        this.numeroSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade sequencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequencia() {
        return sequencia;
    }

    /**
     * Define o valor da propriedade sequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequencia(JAXBElement<Integer> value) {
        this.sequencia = value;
    }

    /**
     * Obtém o valor da propriedade sequenciaSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequenciaSolicitacao() {
        return sequenciaSolicitacao;
    }

    /**
     * Define o valor da propriedade sequenciaSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequenciaSolicitacao(JAXBElement<Integer> value) {
        this.sequenciaSolicitacao = value;
    }

}
