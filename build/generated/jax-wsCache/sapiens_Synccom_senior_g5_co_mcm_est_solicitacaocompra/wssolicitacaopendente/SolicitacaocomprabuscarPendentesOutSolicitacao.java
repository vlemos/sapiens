
package wssolicitacaopendente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaocomprabuscarPendentesOutSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaocomprabuscarPendentesOutSolicitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abreviaturaCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoFilial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoSolicitante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoProdutoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeFilial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeSolicitada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="siglaMoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadeMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorAproximado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaocomprabuscarPendentesOutSolicitacao", propOrder = {
    "abreviaturaCentroCusto",
    "codigoCentroCusto",
    "codigoEmpresa",
    "codigoFilial",
    "codigoSolicitante",
    "dataSolicitacao",
    "descricaoMoeda",
    "descricaoProdutoServico",
    "nomeEmpresa",
    "nomeFilial",
    "nomeSolicitante",
    "numero",
    "observacao",
    "quantidadeSolicitada",
    "sequencia",
    "siglaMoeda",
    "unidadeMedida",
    "valorAproximado",
    "valorUnitario"
})
public class SolicitacaocomprabuscarPendentesOutSolicitacao {

    @XmlElementRef(name = "abreviaturaCentroCusto", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abreviaturaCentroCusto;
    @XmlElementRef(name = "codigoCentroCusto", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCentroCusto;
    @XmlElementRef(name = "codigoEmpresa", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoEmpresa;
    @XmlElementRef(name = "codigoFilial", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoFilial;
    @XmlElementRef(name = "codigoSolicitante", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoSolicitante;
    @XmlElementRef(name = "dataSolicitacao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSolicitacao;
    @XmlElementRef(name = "descricaoMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoMoeda;
    @XmlElementRef(name = "descricaoProdutoServico", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoProdutoServico;
    @XmlElementRef(name = "nomeEmpresa", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeEmpresa;
    @XmlElementRef(name = "nomeFilial", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeFilial;
    @XmlElementRef(name = "nomeSolicitante", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeSolicitante;
    @XmlElementRef(name = "numero", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numero;
    @XmlElementRef(name = "observacao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacao;
    @XmlElementRef(name = "quantidadeSolicitada", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> quantidadeSolicitada;
    @XmlElementRef(name = "sequencia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequencia;
    @XmlElementRef(name = "siglaMoeda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siglaMoeda;
    @XmlElementRef(name = "unidadeMedida", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadeMedida;
    @XmlElementRef(name = "valorAproximado", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorAproximado;
    @XmlElementRef(name = "valorUnitario", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorUnitario;

    /**
     * Obtém o valor da propriedade abreviaturaCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbreviaturaCentroCusto() {
        return abreviaturaCentroCusto;
    }

    /**
     * Define o valor da propriedade abreviaturaCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbreviaturaCentroCusto(JAXBElement<String> value) {
        this.abreviaturaCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade codigoCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCentroCusto() {
        return codigoCentroCusto;
    }

    /**
     * Define o valor da propriedade codigoCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCentroCusto(JAXBElement<String> value) {
        this.codigoCentroCusto = value;
    }

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
     * Obtém o valor da propriedade codigoFilial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoFilial() {
        return codigoFilial;
    }

    /**
     * Define o valor da propriedade codigoFilial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoFilial(JAXBElement<Integer> value) {
        this.codigoFilial = value;
    }

    /**
     * Obtém o valor da propriedade codigoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoSolicitante() {
        return codigoSolicitante;
    }

    /**
     * Define o valor da propriedade codigoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoSolicitante(JAXBElement<Integer> value) {
        this.codigoSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSolicitacao(JAXBElement<String> value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoMoeda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricaoMoeda() {
        return descricaoMoeda;
    }

    /**
     * Define o valor da propriedade descricaoMoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricaoMoeda(JAXBElement<String> value) {
        this.descricaoMoeda = value;
    }

    /**
     * Obtém o valor da propriedade descricaoProdutoServico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricaoProdutoServico() {
        return descricaoProdutoServico;
    }

    /**
     * Define o valor da propriedade descricaoProdutoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricaoProdutoServico(JAXBElement<String> value) {
        this.descricaoProdutoServico = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Define o valor da propriedade nomeEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeEmpresa(JAXBElement<String> value) {
        this.nomeEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade nomeFilial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeFilial() {
        return nomeFilial;
    }

    /**
     * Define o valor da propriedade nomeFilial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeFilial(JAXBElement<String> value) {
        this.nomeFilial = value;
    }

    /**
     * Obtém o valor da propriedade nomeSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeSolicitante() {
        return nomeSolicitante;
    }

    /**
     * Define o valor da propriedade nomeSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeSolicitante(JAXBElement<String> value) {
        this.nomeSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumero(JAXBElement<Integer> value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacao(JAXBElement<String> value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Define o valor da propriedade quantidadeSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQuantidadeSolicitada(JAXBElement<Double> value) {
        this.quantidadeSolicitada = value;
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
     * Obtém o valor da propriedade siglaMoeda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiglaMoeda() {
        return siglaMoeda;
    }

    /**
     * Define o valor da propriedade siglaMoeda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiglaMoeda(JAXBElement<String> value) {
        this.siglaMoeda = value;
    }

    /**
     * Obtém o valor da propriedade unidadeMedida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Define o valor da propriedade unidadeMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadeMedida(JAXBElement<String> value) {
        this.unidadeMedida = value;
    }

    /**
     * Obtém o valor da propriedade valorAproximado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorAproximado() {
        return valorAproximado;
    }

    /**
     * Define o valor da propriedade valorAproximado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorAproximado(JAXBElement<Double> value) {
        this.valorAproximado = value;
    }

    /**
     * Obtém o valor da propriedade valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorUnitario(JAXBElement<Double> value) {
        this.valorUnitario = value;
    }

}
