
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesFecharIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesFecharIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ECodDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodDer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodFil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECodPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EDatFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EDatIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EFecOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBAtuSalMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBCorPriMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBDifSalAvi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBDifSalCor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBFecAtuEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBFecAtuFil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBGerMovAce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBMedEstPrm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBMedEstPru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBTipFecNor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBTipFecOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesFecharIn", propOrder = {
    "eCodDep",
    "eCodDer",
    "eCodEmp",
    "eCodFam",
    "eCodFil",
    "eCodOri",
    "eCodPro",
    "eDatFin",
    "eDatIni",
    "eFecOri",
    "flowInstanceID",
    "flowName",
    "rbAtuSalMov",
    "rbCorPriMov",
    "rbDifSalAvi",
    "rbDifSalCor",
    "rbFecAtuEst",
    "rbFecAtuFil",
    "rbGerMovAce",
    "rbMedEstPrm",
    "rbMedEstPru",
    "rbTipFecNor",
    "rbTipFecOri"
})
public class EstoquesFecharIn {

    @XmlElementRef(name = "ECodDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodDep;
    @XmlElementRef(name = "ECodDer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodDer;
    @XmlElementRef(name = "ECodEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodEmp;
    @XmlElementRef(name = "ECodFam", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodFam;
    @XmlElementRef(name = "ECodFil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodFil;
    @XmlElementRef(name = "ECodOri", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodOri;
    @XmlElementRef(name = "ECodPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCodPro;
    @XmlElementRef(name = "EDatFin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eDatFin;
    @XmlElementRef(name = "EDatIni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eDatIni;
    @XmlElementRef(name = "EFecOri", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eFecOri;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "RBAtuSalMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbAtuSalMov;
    @XmlElementRef(name = "RBCorPriMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbCorPriMov;
    @XmlElementRef(name = "RBDifSalAvi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbDifSalAvi;
    @XmlElementRef(name = "RBDifSalCor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbDifSalCor;
    @XmlElementRef(name = "RBFecAtuEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbFecAtuEst;
    @XmlElementRef(name = "RBFecAtuFil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbFecAtuFil;
    @XmlElementRef(name = "RBGerMovAce", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbGerMovAce;
    @XmlElementRef(name = "RBMedEstPrm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbMedEstPrm;
    @XmlElementRef(name = "RBMedEstPru", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbMedEstPru;
    @XmlElementRef(name = "RBTipFecNor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbTipFecNor;
    @XmlElementRef(name = "RBTipFecOri", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rbTipFecOri;

    /**
     * Obtém o valor da propriedade eCodDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodDep() {
        return eCodDep;
    }

    /**
     * Define o valor da propriedade eCodDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodDep(JAXBElement<String> value) {
        this.eCodDep = value;
    }

    /**
     * Obtém o valor da propriedade eCodDer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodDer() {
        return eCodDer;
    }

    /**
     * Define o valor da propriedade eCodDer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodDer(JAXBElement<String> value) {
        this.eCodDer = value;
    }

    /**
     * Obtém o valor da propriedade eCodEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodEmp() {
        return eCodEmp;
    }

    /**
     * Define o valor da propriedade eCodEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodEmp(JAXBElement<String> value) {
        this.eCodEmp = value;
    }

    /**
     * Obtém o valor da propriedade eCodFam.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodFam() {
        return eCodFam;
    }

    /**
     * Define o valor da propriedade eCodFam.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodFam(JAXBElement<String> value) {
        this.eCodFam = value;
    }

    /**
     * Obtém o valor da propriedade eCodFil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodFil() {
        return eCodFil;
    }

    /**
     * Define o valor da propriedade eCodFil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodFil(JAXBElement<String> value) {
        this.eCodFil = value;
    }

    /**
     * Obtém o valor da propriedade eCodOri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodOri() {
        return eCodOri;
    }

    /**
     * Define o valor da propriedade eCodOri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodOri(JAXBElement<String> value) {
        this.eCodOri = value;
    }

    /**
     * Obtém o valor da propriedade eCodPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECodPro() {
        return eCodPro;
    }

    /**
     * Define o valor da propriedade eCodPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECodPro(JAXBElement<String> value) {
        this.eCodPro = value;
    }

    /**
     * Obtém o valor da propriedade eDatFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDatFin() {
        return eDatFin;
    }

    /**
     * Define o valor da propriedade eDatFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDatFin(JAXBElement<String> value) {
        this.eDatFin = value;
    }

    /**
     * Obtém o valor da propriedade eDatIni.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEDatIni() {
        return eDatIni;
    }

    /**
     * Define o valor da propriedade eDatIni.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEDatIni(JAXBElement<String> value) {
        this.eDatIni = value;
    }

    /**
     * Obtém o valor da propriedade eFecOri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEFecOri() {
        return eFecOri;
    }

    /**
     * Define o valor da propriedade eFecOri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEFecOri(JAXBElement<String> value) {
        this.eFecOri = value;
    }

    /**
     * Obtém o valor da propriedade flowInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowInstanceID() {
        return flowInstanceID;
    }

    /**
     * Define o valor da propriedade flowInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowInstanceID(JAXBElement<String> value) {
        this.flowInstanceID = value;
    }

    /**
     * Obtém o valor da propriedade flowName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowName() {
        return flowName;
    }

    /**
     * Define o valor da propriedade flowName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowName(JAXBElement<String> value) {
        this.flowName = value;
    }

    /**
     * Obtém o valor da propriedade rbAtuSalMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBAtuSalMov() {
        return rbAtuSalMov;
    }

    /**
     * Define o valor da propriedade rbAtuSalMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBAtuSalMov(JAXBElement<String> value) {
        this.rbAtuSalMov = value;
    }

    /**
     * Obtém o valor da propriedade rbCorPriMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBCorPriMov() {
        return rbCorPriMov;
    }

    /**
     * Define o valor da propriedade rbCorPriMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBCorPriMov(JAXBElement<String> value) {
        this.rbCorPriMov = value;
    }

    /**
     * Obtém o valor da propriedade rbDifSalAvi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBDifSalAvi() {
        return rbDifSalAvi;
    }

    /**
     * Define o valor da propriedade rbDifSalAvi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBDifSalAvi(JAXBElement<String> value) {
        this.rbDifSalAvi = value;
    }

    /**
     * Obtém o valor da propriedade rbDifSalCor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBDifSalCor() {
        return rbDifSalCor;
    }

    /**
     * Define o valor da propriedade rbDifSalCor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBDifSalCor(JAXBElement<String> value) {
        this.rbDifSalCor = value;
    }

    /**
     * Obtém o valor da propriedade rbFecAtuEst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBFecAtuEst() {
        return rbFecAtuEst;
    }

    /**
     * Define o valor da propriedade rbFecAtuEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBFecAtuEst(JAXBElement<String> value) {
        this.rbFecAtuEst = value;
    }

    /**
     * Obtém o valor da propriedade rbFecAtuFil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBFecAtuFil() {
        return rbFecAtuFil;
    }

    /**
     * Define o valor da propriedade rbFecAtuFil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBFecAtuFil(JAXBElement<String> value) {
        this.rbFecAtuFil = value;
    }

    /**
     * Obtém o valor da propriedade rbGerMovAce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBGerMovAce() {
        return rbGerMovAce;
    }

    /**
     * Define o valor da propriedade rbGerMovAce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBGerMovAce(JAXBElement<String> value) {
        this.rbGerMovAce = value;
    }

    /**
     * Obtém o valor da propriedade rbMedEstPrm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBMedEstPrm() {
        return rbMedEstPrm;
    }

    /**
     * Define o valor da propriedade rbMedEstPrm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBMedEstPrm(JAXBElement<String> value) {
        this.rbMedEstPrm = value;
    }

    /**
     * Obtém o valor da propriedade rbMedEstPru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBMedEstPru() {
        return rbMedEstPru;
    }

    /**
     * Define o valor da propriedade rbMedEstPru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBMedEstPru(JAXBElement<String> value) {
        this.rbMedEstPru = value;
    }

    /**
     * Obtém o valor da propriedade rbTipFecNor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBTipFecNor() {
        return rbTipFecNor;
    }

    /**
     * Define o valor da propriedade rbTipFecNor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBTipFecNor(JAXBElement<String> value) {
        this.rbTipFecNor = value;
    }

    /**
     * Obtém o valor da propriedade rbTipFecOri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRBTipFecOri() {
        return rbTipFecOri;
    }

    /**
     * Define o valor da propriedade rbTipFecOri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRBTipFecOri(JAXBElement<String> value) {
        this.rbTipFecOri = value;
    }

}
