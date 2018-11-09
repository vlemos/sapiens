
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesMovimentarEstoqueInDadosGerais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesMovimentarEstoqueInDadosGerais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSnf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctaRed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datVlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motMvp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNfv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPrj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numSep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oriOrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqIpv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrIcm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesMovimentarEstoqueInDadosGerais", propOrder = {
    "codCcu",
    "codCli",
    "codDep",
    "codDer",
    "codEmp",
    "codFil",
    "codFor",
    "codFpj",
    "codLot",
    "codPro",
    "codSnf",
    "codTns",
    "ctaFin",
    "ctaRed",
    "datFab",
    "datMov",
    "datVlt",
    "depTrf",
    "derTrf",
    "motMvp",
    "numDoc",
    "numNfv",
    "numPrj",
    "numSep",
    "oriOrp",
    "proTrf",
    "qtdMov",
    "seqIpv",
    "usuRec",
    "usuRes",
    "vlrIcm",
    "vlrMov"
})
public class EstoquesMovimentarEstoqueInDadosGerais {

    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codCli", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCli;
    @XmlElementRef(name = "codDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDep;
    @XmlElementRef(name = "codDer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDer;
    @XmlElementRef(name = "codEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEmp;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFil;
    @XmlElementRef(name = "codFor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFor;
    @XmlElementRef(name = "codFpj", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFpj;
    @XmlElementRef(name = "codLot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codLot;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPro;
    @XmlElementRef(name = "codSnf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSnf;
    @XmlElementRef(name = "codTns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTns;
    @XmlElementRef(name = "ctaFin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctaFin;
    @XmlElementRef(name = "ctaRed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctaRed;
    @XmlElementRef(name = "datFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datFab;
    @XmlElementRef(name = "datMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datMov;
    @XmlElementRef(name = "datVlt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datVlt;
    @XmlElementRef(name = "depTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depTrf;
    @XmlElementRef(name = "derTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> derTrf;
    @XmlElementRef(name = "motMvp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motMvp;
    @XmlElementRef(name = "numDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDoc;
    @XmlElementRef(name = "numNfv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numNfv;
    @XmlElementRef(name = "numPrj", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numPrj;
    @XmlElementRef(name = "numSep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numSep;
    @XmlElementRef(name = "oriOrp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oriOrp;
    @XmlElementRef(name = "proTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proTrf;
    @XmlElementRef(name = "qtdMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdMov;
    @XmlElementRef(name = "seqIpv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqIpv;
    @XmlElementRef(name = "usuRec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuRec;
    @XmlElementRef(name = "usuRes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuRes;
    @XmlElementRef(name = "vlrIcm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrIcm;
    @XmlElementRef(name = "vlrMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrMov;

    /**
     * Obtém o valor da propriedade codCcu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCcu() {
        return codCcu;
    }

    /**
     * Define o valor da propriedade codCcu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCcu(JAXBElement<String> value) {
        this.codCcu = value;
    }

    /**
     * Obtém o valor da propriedade codCli.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCli() {
        return codCli;
    }

    /**
     * Define o valor da propriedade codCli.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCli(JAXBElement<String> value) {
        this.codCli = value;
    }

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
     * Obtém o valor da propriedade codEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEmp() {
        return codEmp;
    }

    /**
     * Define o valor da propriedade codEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEmp(JAXBElement<String> value) {
        this.codEmp = value;
    }

    /**
     * Obtém o valor da propriedade codFil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFil() {
        return codFil;
    }

    /**
     * Define o valor da propriedade codFil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFil(JAXBElement<String> value) {
        this.codFil = value;
    }

    /**
     * Obtém o valor da propriedade codFor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFor() {
        return codFor;
    }

    /**
     * Define o valor da propriedade codFor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFor(JAXBElement<String> value) {
        this.codFor = value;
    }

    /**
     * Obtém o valor da propriedade codFpj.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFpj() {
        return codFpj;
    }

    /**
     * Define o valor da propriedade codFpj.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFpj(JAXBElement<String> value) {
        this.codFpj = value;
    }

    /**
     * Obtém o valor da propriedade codLot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodLot() {
        return codLot;
    }

    /**
     * Define o valor da propriedade codLot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodLot(JAXBElement<String> value) {
        this.codLot = value;
    }

    /**
     * Obtém o valor da propriedade codPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPro() {
        return codPro;
    }

    /**
     * Define o valor da propriedade codPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPro(JAXBElement<String> value) {
        this.codPro = value;
    }

    /**
     * Obtém o valor da propriedade codSnf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSnf() {
        return codSnf;
    }

    /**
     * Define o valor da propriedade codSnf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSnf(JAXBElement<String> value) {
        this.codSnf = value;
    }

    /**
     * Obtém o valor da propriedade codTns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTns() {
        return codTns;
    }

    /**
     * Define o valor da propriedade codTns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTns(JAXBElement<String> value) {
        this.codTns = value;
    }

    /**
     * Obtém o valor da propriedade ctaFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtaFin() {
        return ctaFin;
    }

    /**
     * Define o valor da propriedade ctaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtaFin(JAXBElement<String> value) {
        this.ctaFin = value;
    }

    /**
     * Obtém o valor da propriedade ctaRed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCtaRed() {
        return ctaRed;
    }

    /**
     * Define o valor da propriedade ctaRed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCtaRed(JAXBElement<String> value) {
        this.ctaRed = value;
    }

    /**
     * Obtém o valor da propriedade datFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatFab() {
        return datFab;
    }

    /**
     * Define o valor da propriedade datFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatFab(JAXBElement<String> value) {
        this.datFab = value;
    }

    /**
     * Obtém o valor da propriedade datMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatMov() {
        return datMov;
    }

    /**
     * Define o valor da propriedade datMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatMov(JAXBElement<String> value) {
        this.datMov = value;
    }

    /**
     * Obtém o valor da propriedade datVlt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatVlt() {
        return datVlt;
    }

    /**
     * Define o valor da propriedade datVlt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatVlt(JAXBElement<String> value) {
        this.datVlt = value;
    }

    /**
     * Obtém o valor da propriedade depTrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepTrf() {
        return depTrf;
    }

    /**
     * Define o valor da propriedade depTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepTrf(JAXBElement<String> value) {
        this.depTrf = value;
    }

    /**
     * Obtém o valor da propriedade derTrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDerTrf() {
        return derTrf;
    }

    /**
     * Define o valor da propriedade derTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDerTrf(JAXBElement<String> value) {
        this.derTrf = value;
    }

    /**
     * Obtém o valor da propriedade motMvp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotMvp() {
        return motMvp;
    }

    /**
     * Define o valor da propriedade motMvp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotMvp(JAXBElement<String> value) {
        this.motMvp = value;
    }

    /**
     * Obtém o valor da propriedade numDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumDoc() {
        return numDoc;
    }

    /**
     * Define o valor da propriedade numDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumDoc(JAXBElement<String> value) {
        this.numDoc = value;
    }

    /**
     * Obtém o valor da propriedade numNfv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumNfv() {
        return numNfv;
    }

    /**
     * Define o valor da propriedade numNfv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumNfv(JAXBElement<String> value) {
        this.numNfv = value;
    }

    /**
     * Obtém o valor da propriedade numPrj.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumPrj() {
        return numPrj;
    }

    /**
     * Define o valor da propriedade numPrj.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumPrj(JAXBElement<String> value) {
        this.numPrj = value;
    }

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
     * Obtém o valor da propriedade oriOrp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriOrp() {
        return oriOrp;
    }

    /**
     * Define o valor da propriedade oriOrp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriOrp(JAXBElement<String> value) {
        this.oriOrp = value;
    }

    /**
     * Obtém o valor da propriedade proTrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProTrf() {
        return proTrf;
    }

    /**
     * Define o valor da propriedade proTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProTrf(JAXBElement<String> value) {
        this.proTrf = value;
    }

    /**
     * Obtém o valor da propriedade qtdMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdMov() {
        return qtdMov;
    }

    /**
     * Define o valor da propriedade qtdMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdMov(JAXBElement<String> value) {
        this.qtdMov = value;
    }

    /**
     * Obtém o valor da propriedade seqIpv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqIpv() {
        return seqIpv;
    }

    /**
     * Define o valor da propriedade seqIpv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqIpv(JAXBElement<String> value) {
        this.seqIpv = value;
    }

    /**
     * Obtém o valor da propriedade usuRec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuRec() {
        return usuRec;
    }

    /**
     * Define o valor da propriedade usuRec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuRec(JAXBElement<String> value) {
        this.usuRec = value;
    }

    /**
     * Obtém o valor da propriedade usuRes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuRes() {
        return usuRes;
    }

    /**
     * Define o valor da propriedade usuRes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuRes(JAXBElement<String> value) {
        this.usuRes = value;
    }

    /**
     * Obtém o valor da propriedade vlrIcm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrIcm() {
        return vlrIcm;
    }

    /**
     * Define o valor da propriedade vlrIcm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrIcm(JAXBElement<String> value) {
        this.vlrIcm = value;
    }

    /**
     * Obtém o valor da propriedade vlrMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrMov() {
        return vlrMov;
    }

    /**
     * Define o valor da propriedade vlrMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrMov(JAXBElement<String> value) {
        this.vlrMov = value;
    }

}
