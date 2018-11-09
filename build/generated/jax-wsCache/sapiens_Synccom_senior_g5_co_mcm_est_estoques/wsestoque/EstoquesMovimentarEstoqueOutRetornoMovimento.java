
package wsestoque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de estoquesMovimentarEstoqueOutRetornoMovimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="estoquesMovimentarEstoqueOutRetornoMovimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aceFec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amoNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codBem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codBnf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEtg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSnf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTrm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cotCm1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cotCm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctaRed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datCm1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datCm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datDig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datEnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datFec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datInv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datTes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datVlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estCoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estCof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estEos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estNeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estVmv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estWms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expWms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filAne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filCle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filNfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filNfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filOcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filPed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forNfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horDig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horVlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="icmAcf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lctFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motMvp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mskDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numAmo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numAne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numAog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numEme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNfv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numOcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPfa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPrj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numSep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numTer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsMvp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oriOrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perGer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perPur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perUmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prmEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prmIcm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sepDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqCmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqEme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqFec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqIpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqIpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqIpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqIpv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqPes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqTrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snfNfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snfNfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ultMdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuDig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuRes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utiRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrCm1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrCm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrDm6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrIcm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vlrMov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vltFab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estoquesMovimentarEstoqueOutRetornoMovimento", propOrder = {
    "aceFec",
    "amoNum",
    "codBem",
    "codBnf",
    "codCat",
    "codCcu",
    "codCli",
    "codCul",
    "codDep",
    "codDer",
    "codEmp",
    "codEnd",
    "codEtg",
    "codEtp",
    "codFab",
    "codFil",
    "codFor",
    "codFpj",
    "codLig",
    "codLot",
    "codMar",
    "codPne",
    "codPro",
    "codSaf",
    "codSlt",
    "codSnf",
    "codTns",
    "codTrm",
    "cotCm1",
    "cotCm2",
    "ctaFin",
    "ctaRed",
    "datCm1",
    "datCm2",
    "datDig",
    "datEnt",
    "datFab",
    "datFec",
    "datInv",
    "datMov",
    "datTes",
    "datVlt",
    "depTrf",
    "derTrf",
    "estCoc",
    "estCof",
    "estEos",
    "estMov",
    "estNeg",
    "estVmv",
    "estWms",
    "expWms",
    "filAne",
    "filCle",
    "filDep",
    "filNfc",
    "filNfo",
    "filOcp",
    "filPed",
    "forNfo",
    "horDig",
    "horFab",
    "horVlt",
    "icmAcf",
    "indFab",
    "lctFin",
    "lotDes",
    "lotFab",
    "motMvp",
    "mskDep",
    "nivDep",
    "numAmo",
    "numAne",
    "numAog",
    "numBol",
    "numCer",
    "numCle",
    "numDoc",
    "numEme",
    "numLot",
    "numNfc",
    "numNfo",
    "numNfv",
    "numOcp",
    "numPed",
    "numPfa",
    "numPrj",
    "numSep",
    "numTer",
    "obsMvp",
    "oriOrp",
    "perGer",
    "perPur",
    "perUmi",
    "prmEst",
    "prmIcm",
    "proFab",
    "proTrf",
    "qtdAnt",
    "qtdEst",
    "qtdMov",
    "retorno",
    "sepDes",
    "seqCmp",
    "seqEme",
    "seqFec",
    "seqIpc",
    "seqIpd",
    "seqIpo",
    "seqIpv",
    "seqMov",
    "seqPes",
    "seqTrf",
    "snfNfc",
    "snfNfo",
    "ultMdi",
    "usuDig",
    "usuRec",
    "usuRes",
    "utiRep",
    "vlrAnt",
    "vlrCm1",
    "vlrCm2",
    "vlrDm1",
    "vlrDm2",
    "vlrDm3",
    "vlrDm4",
    "vlrDm5",
    "vlrDm6",
    "vlrEst",
    "vlrIcm",
    "vlrMov",
    "vltFab"
})
public class EstoquesMovimentarEstoqueOutRetornoMovimento {

    @XmlElementRef(name = "aceFec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aceFec;
    @XmlElementRef(name = "amoNum", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amoNum;
    @XmlElementRef(name = "codBem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codBem;
    @XmlElementRef(name = "codBnf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codBnf;
    @XmlElementRef(name = "codCat", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCat;
    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codCli", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCli;
    @XmlElementRef(name = "codCul", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCul;
    @XmlElementRef(name = "codDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDep;
    @XmlElementRef(name = "codDer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codDer;
    @XmlElementRef(name = "codEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEmp;
    @XmlElementRef(name = "codEnd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEnd;
    @XmlElementRef(name = "codEtg", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEtg;
    @XmlElementRef(name = "codEtp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEtp;
    @XmlElementRef(name = "codFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFab;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFil;
    @XmlElementRef(name = "codFor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFor;
    @XmlElementRef(name = "codFpj", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codFpj;
    @XmlElementRef(name = "codLig", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codLig;
    @XmlElementRef(name = "codLot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codLot;
    @XmlElementRef(name = "codMar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codMar;
    @XmlElementRef(name = "codPne", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPne;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPro;
    @XmlElementRef(name = "codSaf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSaf;
    @XmlElementRef(name = "codSlt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSlt;
    @XmlElementRef(name = "codSnf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSnf;
    @XmlElementRef(name = "codTns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTns;
    @XmlElementRef(name = "codTrm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTrm;
    @XmlElementRef(name = "cotCm1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cotCm1;
    @XmlElementRef(name = "cotCm2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cotCm2;
    @XmlElementRef(name = "ctaFin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctaFin;
    @XmlElementRef(name = "ctaRed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ctaRed;
    @XmlElementRef(name = "datCm1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datCm1;
    @XmlElementRef(name = "datCm2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datCm2;
    @XmlElementRef(name = "datDig", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datDig;
    @XmlElementRef(name = "datEnt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datEnt;
    @XmlElementRef(name = "datFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datFab;
    @XmlElementRef(name = "datFec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datFec;
    @XmlElementRef(name = "datInv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datInv;
    @XmlElementRef(name = "datMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datMov;
    @XmlElementRef(name = "datTes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datTes;
    @XmlElementRef(name = "datVlt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datVlt;
    @XmlElementRef(name = "depTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depTrf;
    @XmlElementRef(name = "derTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> derTrf;
    @XmlElementRef(name = "estCoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estCoc;
    @XmlElementRef(name = "estCof", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estCof;
    @XmlElementRef(name = "estEos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estEos;
    @XmlElementRef(name = "estMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estMov;
    @XmlElementRef(name = "estNeg", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estNeg;
    @XmlElementRef(name = "estVmv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estVmv;
    @XmlElementRef(name = "estWms", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estWms;
    @XmlElementRef(name = "expWms", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expWms;
    @XmlElementRef(name = "filAne", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filAne;
    @XmlElementRef(name = "filCle", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filCle;
    @XmlElementRef(name = "filDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filDep;
    @XmlElementRef(name = "filNfc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filNfc;
    @XmlElementRef(name = "filNfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filNfo;
    @XmlElementRef(name = "filOcp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filOcp;
    @XmlElementRef(name = "filPed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filPed;
    @XmlElementRef(name = "forNfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forNfo;
    @XmlElementRef(name = "horDig", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horDig;
    @XmlElementRef(name = "horFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horFab;
    @XmlElementRef(name = "horVlt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horVlt;
    @XmlElementRef(name = "icmAcf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icmAcf;
    @XmlElementRef(name = "indFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indFab;
    @XmlElementRef(name = "lctFin", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lctFin;
    @XmlElementRef(name = "lotDes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotDes;
    @XmlElementRef(name = "lotFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotFab;
    @XmlElementRef(name = "motMvp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motMvp;
    @XmlElementRef(name = "mskDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mskDep;
    @XmlElementRef(name = "nivDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nivDep;
    @XmlElementRef(name = "numAmo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numAmo;
    @XmlElementRef(name = "numAne", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numAne;
    @XmlElementRef(name = "numAog", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numAog;
    @XmlElementRef(name = "numBol", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numBol;
    @XmlElementRef(name = "numCer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCer;
    @XmlElementRef(name = "numCle", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numCle;
    @XmlElementRef(name = "numDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDoc;
    @XmlElementRef(name = "numEme", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numEme;
    @XmlElementRef(name = "numLot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLot;
    @XmlElementRef(name = "numNfc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numNfc;
    @XmlElementRef(name = "numNfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numNfo;
    @XmlElementRef(name = "numNfv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numNfv;
    @XmlElementRef(name = "numOcp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numOcp;
    @XmlElementRef(name = "numPed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numPed;
    @XmlElementRef(name = "numPfa", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numPfa;
    @XmlElementRef(name = "numPrj", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numPrj;
    @XmlElementRef(name = "numSep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numSep;
    @XmlElementRef(name = "numTer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numTer;
    @XmlElementRef(name = "obsMvp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obsMvp;
    @XmlElementRef(name = "oriOrp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oriOrp;
    @XmlElementRef(name = "perGer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perGer;
    @XmlElementRef(name = "perPur", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perPur;
    @XmlElementRef(name = "perUmi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perUmi;
    @XmlElementRef(name = "prmEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prmEst;
    @XmlElementRef(name = "prmIcm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prmIcm;
    @XmlElementRef(name = "proFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proFab;
    @XmlElementRef(name = "proTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proTrf;
    @XmlElementRef(name = "qtdAnt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdAnt;
    @XmlElementRef(name = "qtdEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdEst;
    @XmlElementRef(name = "qtdMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qtdMov;
    @XmlElementRef(name = "retorno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retorno;
    @XmlElementRef(name = "sepDes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sepDes;
    @XmlElementRef(name = "seqCmp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqCmp;
    @XmlElementRef(name = "seqEme", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqEme;
    @XmlElementRef(name = "seqFec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqFec;
    @XmlElementRef(name = "seqIpc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqIpc;
    @XmlElementRef(name = "seqIpd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqIpd;
    @XmlElementRef(name = "seqIpo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqIpo;
    @XmlElementRef(name = "seqIpv", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqIpv;
    @XmlElementRef(name = "seqMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqMov;
    @XmlElementRef(name = "seqPes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqPes;
    @XmlElementRef(name = "seqTrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqTrf;
    @XmlElementRef(name = "snfNfc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> snfNfc;
    @XmlElementRef(name = "snfNfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> snfNfo;
    @XmlElementRef(name = "ultMdi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ultMdi;
    @XmlElementRef(name = "usuDig", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuDig;
    @XmlElementRef(name = "usuRec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuRec;
    @XmlElementRef(name = "usuRes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuRes;
    @XmlElementRef(name = "utiRep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utiRep;
    @XmlElementRef(name = "vlrAnt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrAnt;
    @XmlElementRef(name = "vlrCm1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrCm1;
    @XmlElementRef(name = "vlrCm2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrCm2;
    @XmlElementRef(name = "vlrDm1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm1;
    @XmlElementRef(name = "vlrDm2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm2;
    @XmlElementRef(name = "vlrDm3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm3;
    @XmlElementRef(name = "vlrDm4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm4;
    @XmlElementRef(name = "vlrDm5", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm5;
    @XmlElementRef(name = "vlrDm6", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrDm6;
    @XmlElementRef(name = "vlrEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrEst;
    @XmlElementRef(name = "vlrIcm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrIcm;
    @XmlElementRef(name = "vlrMov", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlrMov;
    @XmlElementRef(name = "vltFab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vltFab;

    /**
     * Obtém o valor da propriedade aceFec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAceFec() {
        return aceFec;
    }

    /**
     * Define o valor da propriedade aceFec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAceFec(JAXBElement<String> value) {
        this.aceFec = value;
    }

    /**
     * Obtém o valor da propriedade amoNum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmoNum() {
        return amoNum;
    }

    /**
     * Define o valor da propriedade amoNum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmoNum(JAXBElement<String> value) {
        this.amoNum = value;
    }

    /**
     * Obtém o valor da propriedade codBem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodBem() {
        return codBem;
    }

    /**
     * Define o valor da propriedade codBem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodBem(JAXBElement<String> value) {
        this.codBem = value;
    }

    /**
     * Obtém o valor da propriedade codBnf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodBnf() {
        return codBnf;
    }

    /**
     * Define o valor da propriedade codBnf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodBnf(JAXBElement<String> value) {
        this.codBnf = value;
    }

    /**
     * Obtém o valor da propriedade codCat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCat() {
        return codCat;
    }

    /**
     * Define o valor da propriedade codCat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCat(JAXBElement<String> value) {
        this.codCat = value;
    }

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
     * Obtém o valor da propriedade codCul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCul() {
        return codCul;
    }

    /**
     * Define o valor da propriedade codCul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCul(JAXBElement<String> value) {
        this.codCul = value;
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
     * Obtém o valor da propriedade codEnd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEnd() {
        return codEnd;
    }

    /**
     * Define o valor da propriedade codEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEnd(JAXBElement<String> value) {
        this.codEnd = value;
    }

    /**
     * Obtém o valor da propriedade codEtg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEtg() {
        return codEtg;
    }

    /**
     * Define o valor da propriedade codEtg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEtg(JAXBElement<String> value) {
        this.codEtg = value;
    }

    /**
     * Obtém o valor da propriedade codEtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEtp() {
        return codEtp;
    }

    /**
     * Define o valor da propriedade codEtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEtp(JAXBElement<String> value) {
        this.codEtp = value;
    }

    /**
     * Obtém o valor da propriedade codFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodFab() {
        return codFab;
    }

    /**
     * Define o valor da propriedade codFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodFab(JAXBElement<String> value) {
        this.codFab = value;
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
     * Obtém o valor da propriedade codLig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodLig() {
        return codLig;
    }

    /**
     * Define o valor da propriedade codLig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodLig(JAXBElement<String> value) {
        this.codLig = value;
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
     * Obtém o valor da propriedade codMar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMar() {
        return codMar;
    }

    /**
     * Define o valor da propriedade codMar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMar(JAXBElement<String> value) {
        this.codMar = value;
    }

    /**
     * Obtém o valor da propriedade codPne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPne() {
        return codPne;
    }

    /**
     * Define o valor da propriedade codPne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPne(JAXBElement<String> value) {
        this.codPne = value;
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
     * Obtém o valor da propriedade codSaf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSaf() {
        return codSaf;
    }

    /**
     * Define o valor da propriedade codSaf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSaf(JAXBElement<String> value) {
        this.codSaf = value;
    }

    /**
     * Obtém o valor da propriedade codSlt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSlt() {
        return codSlt;
    }

    /**
     * Define o valor da propriedade codSlt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSlt(JAXBElement<String> value) {
        this.codSlt = value;
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
     * Obtém o valor da propriedade codTrm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTrm() {
        return codTrm;
    }

    /**
     * Define o valor da propriedade codTrm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTrm(JAXBElement<String> value) {
        this.codTrm = value;
    }

    /**
     * Obtém o valor da propriedade cotCm1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCotCm1() {
        return cotCm1;
    }

    /**
     * Define o valor da propriedade cotCm1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCotCm1(JAXBElement<String> value) {
        this.cotCm1 = value;
    }

    /**
     * Obtém o valor da propriedade cotCm2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCotCm2() {
        return cotCm2;
    }

    /**
     * Define o valor da propriedade cotCm2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCotCm2(JAXBElement<String> value) {
        this.cotCm2 = value;
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
     * Obtém o valor da propriedade datCm1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatCm1() {
        return datCm1;
    }

    /**
     * Define o valor da propriedade datCm1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatCm1(JAXBElement<String> value) {
        this.datCm1 = value;
    }

    /**
     * Obtém o valor da propriedade datCm2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatCm2() {
        return datCm2;
    }

    /**
     * Define o valor da propriedade datCm2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatCm2(JAXBElement<String> value) {
        this.datCm2 = value;
    }

    /**
     * Obtém o valor da propriedade datDig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatDig() {
        return datDig;
    }

    /**
     * Define o valor da propriedade datDig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatDig(JAXBElement<String> value) {
        this.datDig = value;
    }

    /**
     * Obtém o valor da propriedade datEnt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatEnt() {
        return datEnt;
    }

    /**
     * Define o valor da propriedade datEnt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatEnt(JAXBElement<String> value) {
        this.datEnt = value;
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
     * Obtém o valor da propriedade datFec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatFec() {
        return datFec;
    }

    /**
     * Define o valor da propriedade datFec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatFec(JAXBElement<String> value) {
        this.datFec = value;
    }

    /**
     * Obtém o valor da propriedade datInv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatInv() {
        return datInv;
    }

    /**
     * Define o valor da propriedade datInv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatInv(JAXBElement<String> value) {
        this.datInv = value;
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
     * Obtém o valor da propriedade datTes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatTes() {
        return datTes;
    }

    /**
     * Define o valor da propriedade datTes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatTes(JAXBElement<String> value) {
        this.datTes = value;
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
     * Obtém o valor da propriedade estCoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstCoc() {
        return estCoc;
    }

    /**
     * Define o valor da propriedade estCoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstCoc(JAXBElement<String> value) {
        this.estCoc = value;
    }

    /**
     * Obtém o valor da propriedade estCof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstCof() {
        return estCof;
    }

    /**
     * Define o valor da propriedade estCof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstCof(JAXBElement<String> value) {
        this.estCof = value;
    }

    /**
     * Obtém o valor da propriedade estEos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstEos() {
        return estEos;
    }

    /**
     * Define o valor da propriedade estEos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstEos(JAXBElement<String> value) {
        this.estEos = value;
    }

    /**
     * Obtém o valor da propriedade estMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstMov() {
        return estMov;
    }

    /**
     * Define o valor da propriedade estMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstMov(JAXBElement<String> value) {
        this.estMov = value;
    }

    /**
     * Obtém o valor da propriedade estNeg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstNeg() {
        return estNeg;
    }

    /**
     * Define o valor da propriedade estNeg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstNeg(JAXBElement<String> value) {
        this.estNeg = value;
    }

    /**
     * Obtém o valor da propriedade estVmv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstVmv() {
        return estVmv;
    }

    /**
     * Define o valor da propriedade estVmv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstVmv(JAXBElement<String> value) {
        this.estVmv = value;
    }

    /**
     * Obtém o valor da propriedade estWms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstWms() {
        return estWms;
    }

    /**
     * Define o valor da propriedade estWms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstWms(JAXBElement<String> value) {
        this.estWms = value;
    }

    /**
     * Obtém o valor da propriedade expWms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpWms() {
        return expWms;
    }

    /**
     * Define o valor da propriedade expWms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpWms(JAXBElement<String> value) {
        this.expWms = value;
    }

    /**
     * Obtém o valor da propriedade filAne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilAne() {
        return filAne;
    }

    /**
     * Define o valor da propriedade filAne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilAne(JAXBElement<String> value) {
        this.filAne = value;
    }

    /**
     * Obtém o valor da propriedade filCle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilCle() {
        return filCle;
    }

    /**
     * Define o valor da propriedade filCle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilCle(JAXBElement<String> value) {
        this.filCle = value;
    }

    /**
     * Obtém o valor da propriedade filDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilDep() {
        return filDep;
    }

    /**
     * Define o valor da propriedade filDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilDep(JAXBElement<String> value) {
        this.filDep = value;
    }

    /**
     * Obtém o valor da propriedade filNfc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilNfc() {
        return filNfc;
    }

    /**
     * Define o valor da propriedade filNfc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilNfc(JAXBElement<String> value) {
        this.filNfc = value;
    }

    /**
     * Obtém o valor da propriedade filNfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilNfo() {
        return filNfo;
    }

    /**
     * Define o valor da propriedade filNfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilNfo(JAXBElement<String> value) {
        this.filNfo = value;
    }

    /**
     * Obtém o valor da propriedade filOcp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilOcp() {
        return filOcp;
    }

    /**
     * Define o valor da propriedade filOcp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilOcp(JAXBElement<String> value) {
        this.filOcp = value;
    }

    /**
     * Obtém o valor da propriedade filPed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilPed() {
        return filPed;
    }

    /**
     * Define o valor da propriedade filPed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilPed(JAXBElement<String> value) {
        this.filPed = value;
    }

    /**
     * Obtém o valor da propriedade forNfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForNfo() {
        return forNfo;
    }

    /**
     * Define o valor da propriedade forNfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForNfo(JAXBElement<String> value) {
        this.forNfo = value;
    }

    /**
     * Obtém o valor da propriedade horDig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorDig() {
        return horDig;
    }

    /**
     * Define o valor da propriedade horDig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorDig(JAXBElement<String> value) {
        this.horDig = value;
    }

    /**
     * Obtém o valor da propriedade horFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorFab() {
        return horFab;
    }

    /**
     * Define o valor da propriedade horFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorFab(JAXBElement<String> value) {
        this.horFab = value;
    }

    /**
     * Obtém o valor da propriedade horVlt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorVlt() {
        return horVlt;
    }

    /**
     * Define o valor da propriedade horVlt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorVlt(JAXBElement<String> value) {
        this.horVlt = value;
    }

    /**
     * Obtém o valor da propriedade icmAcf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcmAcf() {
        return icmAcf;
    }

    /**
     * Define o valor da propriedade icmAcf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcmAcf(JAXBElement<String> value) {
        this.icmAcf = value;
    }

    /**
     * Obtém o valor da propriedade indFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndFab() {
        return indFab;
    }

    /**
     * Define o valor da propriedade indFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndFab(JAXBElement<String> value) {
        this.indFab = value;
    }

    /**
     * Obtém o valor da propriedade lctFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLctFin() {
        return lctFin;
    }

    /**
     * Define o valor da propriedade lctFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLctFin(JAXBElement<String> value) {
        this.lctFin = value;
    }

    /**
     * Obtém o valor da propriedade lotDes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotDes() {
        return lotDes;
    }

    /**
     * Define o valor da propriedade lotDes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotDes(JAXBElement<String> value) {
        this.lotDes = value;
    }

    /**
     * Obtém o valor da propriedade lotFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotFab() {
        return lotFab;
    }

    /**
     * Define o valor da propriedade lotFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotFab(JAXBElement<String> value) {
        this.lotFab = value;
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
     * Obtém o valor da propriedade mskDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMskDep() {
        return mskDep;
    }

    /**
     * Define o valor da propriedade mskDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMskDep(JAXBElement<String> value) {
        this.mskDep = value;
    }

    /**
     * Obtém o valor da propriedade nivDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNivDep() {
        return nivDep;
    }

    /**
     * Define o valor da propriedade nivDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNivDep(JAXBElement<String> value) {
        this.nivDep = value;
    }

    /**
     * Obtém o valor da propriedade numAmo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAmo() {
        return numAmo;
    }

    /**
     * Define o valor da propriedade numAmo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAmo(JAXBElement<String> value) {
        this.numAmo = value;
    }

    /**
     * Obtém o valor da propriedade numAne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAne() {
        return numAne;
    }

    /**
     * Define o valor da propriedade numAne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAne(JAXBElement<String> value) {
        this.numAne = value;
    }

    /**
     * Obtém o valor da propriedade numAog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAog() {
        return numAog;
    }

    /**
     * Define o valor da propriedade numAog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAog(JAXBElement<String> value) {
        this.numAog = value;
    }

    /**
     * Obtém o valor da propriedade numBol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumBol() {
        return numBol;
    }

    /**
     * Define o valor da propriedade numBol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumBol(JAXBElement<String> value) {
        this.numBol = value;
    }

    /**
     * Obtém o valor da propriedade numCer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumCer() {
        return numCer;
    }

    /**
     * Define o valor da propriedade numCer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumCer(JAXBElement<String> value) {
        this.numCer = value;
    }

    /**
     * Obtém o valor da propriedade numCle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumCle() {
        return numCle;
    }

    /**
     * Define o valor da propriedade numCle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumCle(JAXBElement<String> value) {
        this.numCle = value;
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
     * Obtém o valor da propriedade numEme.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumEme() {
        return numEme;
    }

    /**
     * Define o valor da propriedade numEme.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumEme(JAXBElement<String> value) {
        this.numEme = value;
    }

    /**
     * Obtém o valor da propriedade numLot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumLot() {
        return numLot;
    }

    /**
     * Define o valor da propriedade numLot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumLot(JAXBElement<String> value) {
        this.numLot = value;
    }

    /**
     * Obtém o valor da propriedade numNfc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumNfc() {
        return numNfc;
    }

    /**
     * Define o valor da propriedade numNfc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumNfc(JAXBElement<String> value) {
        this.numNfc = value;
    }

    /**
     * Obtém o valor da propriedade numNfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumNfo() {
        return numNfo;
    }

    /**
     * Define o valor da propriedade numNfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumNfo(JAXBElement<String> value) {
        this.numNfo = value;
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
     * Obtém o valor da propriedade numOcp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumOcp() {
        return numOcp;
    }

    /**
     * Define o valor da propriedade numOcp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumOcp(JAXBElement<String> value) {
        this.numOcp = value;
    }

    /**
     * Obtém o valor da propriedade numPed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumPed() {
        return numPed;
    }

    /**
     * Define o valor da propriedade numPed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumPed(JAXBElement<String> value) {
        this.numPed = value;
    }

    /**
     * Obtém o valor da propriedade numPfa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumPfa() {
        return numPfa;
    }

    /**
     * Define o valor da propriedade numPfa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumPfa(JAXBElement<String> value) {
        this.numPfa = value;
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
     * Obtém o valor da propriedade numTer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumTer() {
        return numTer;
    }

    /**
     * Define o valor da propriedade numTer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumTer(JAXBElement<String> value) {
        this.numTer = value;
    }

    /**
     * Obtém o valor da propriedade obsMvp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObsMvp() {
        return obsMvp;
    }

    /**
     * Define o valor da propriedade obsMvp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObsMvp(JAXBElement<String> value) {
        this.obsMvp = value;
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
     * Obtém o valor da propriedade perGer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerGer() {
        return perGer;
    }

    /**
     * Define o valor da propriedade perGer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerGer(JAXBElement<String> value) {
        this.perGer = value;
    }

    /**
     * Obtém o valor da propriedade perPur.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerPur() {
        return perPur;
    }

    /**
     * Define o valor da propriedade perPur.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerPur(JAXBElement<String> value) {
        this.perPur = value;
    }

    /**
     * Obtém o valor da propriedade perUmi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerUmi() {
        return perUmi;
    }

    /**
     * Define o valor da propriedade perUmi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerUmi(JAXBElement<String> value) {
        this.perUmi = value;
    }

    /**
     * Obtém o valor da propriedade prmEst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmEst() {
        return prmEst;
    }

    /**
     * Define o valor da propriedade prmEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmEst(JAXBElement<String> value) {
        this.prmEst = value;
    }

    /**
     * Obtém o valor da propriedade prmIcm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrmIcm() {
        return prmIcm;
    }

    /**
     * Define o valor da propriedade prmIcm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrmIcm(JAXBElement<String> value) {
        this.prmIcm = value;
    }

    /**
     * Obtém o valor da propriedade proFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProFab() {
        return proFab;
    }

    /**
     * Define o valor da propriedade proFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProFab(JAXBElement<String> value) {
        this.proFab = value;
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
     * Obtém o valor da propriedade qtdAnt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQtdAnt() {
        return qtdAnt;
    }

    /**
     * Define o valor da propriedade qtdAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQtdAnt(JAXBElement<String> value) {
        this.qtdAnt = value;
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
     * Obtém o valor da propriedade retorno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetorno() {
        return retorno;
    }

    /**
     * Define o valor da propriedade retorno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetorno(JAXBElement<String> value) {
        this.retorno = value;
    }

    /**
     * Obtém o valor da propriedade sepDes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSepDes() {
        return sepDes;
    }

    /**
     * Define o valor da propriedade sepDes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSepDes(JAXBElement<String> value) {
        this.sepDes = value;
    }

    /**
     * Obtém o valor da propriedade seqCmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqCmp() {
        return seqCmp;
    }

    /**
     * Define o valor da propriedade seqCmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqCmp(JAXBElement<String> value) {
        this.seqCmp = value;
    }

    /**
     * Obtém o valor da propriedade seqEme.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqEme() {
        return seqEme;
    }

    /**
     * Define o valor da propriedade seqEme.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqEme(JAXBElement<String> value) {
        this.seqEme = value;
    }

    /**
     * Obtém o valor da propriedade seqFec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqFec() {
        return seqFec;
    }

    /**
     * Define o valor da propriedade seqFec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqFec(JAXBElement<String> value) {
        this.seqFec = value;
    }

    /**
     * Obtém o valor da propriedade seqIpc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqIpc() {
        return seqIpc;
    }

    /**
     * Define o valor da propriedade seqIpc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqIpc(JAXBElement<String> value) {
        this.seqIpc = value;
    }

    /**
     * Obtém o valor da propriedade seqIpd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqIpd() {
        return seqIpd;
    }

    /**
     * Define o valor da propriedade seqIpd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqIpd(JAXBElement<String> value) {
        this.seqIpd = value;
    }

    /**
     * Obtém o valor da propriedade seqIpo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqIpo() {
        return seqIpo;
    }

    /**
     * Define o valor da propriedade seqIpo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqIpo(JAXBElement<String> value) {
        this.seqIpo = value;
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
     * Obtém o valor da propriedade seqMov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqMov() {
        return seqMov;
    }

    /**
     * Define o valor da propriedade seqMov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqMov(JAXBElement<String> value) {
        this.seqMov = value;
    }

    /**
     * Obtém o valor da propriedade seqPes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqPes() {
        return seqPes;
    }

    /**
     * Define o valor da propriedade seqPes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqPes(JAXBElement<String> value) {
        this.seqPes = value;
    }

    /**
     * Obtém o valor da propriedade seqTrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqTrf() {
        return seqTrf;
    }

    /**
     * Define o valor da propriedade seqTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqTrf(JAXBElement<String> value) {
        this.seqTrf = value;
    }

    /**
     * Obtém o valor da propriedade snfNfc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSnfNfc() {
        return snfNfc;
    }

    /**
     * Define o valor da propriedade snfNfc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSnfNfc(JAXBElement<String> value) {
        this.snfNfc = value;
    }

    /**
     * Obtém o valor da propriedade snfNfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSnfNfo() {
        return snfNfo;
    }

    /**
     * Define o valor da propriedade snfNfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSnfNfo(JAXBElement<String> value) {
        this.snfNfo = value;
    }

    /**
     * Obtém o valor da propriedade ultMdi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUltMdi() {
        return ultMdi;
    }

    /**
     * Define o valor da propriedade ultMdi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUltMdi(JAXBElement<String> value) {
        this.ultMdi = value;
    }

    /**
     * Obtém o valor da propriedade usuDig.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuDig() {
        return usuDig;
    }

    /**
     * Define o valor da propriedade usuDig.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuDig(JAXBElement<String> value) {
        this.usuDig = value;
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
     * Obtém o valor da propriedade utiRep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUtiRep() {
        return utiRep;
    }

    /**
     * Define o valor da propriedade utiRep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUtiRep(JAXBElement<String> value) {
        this.utiRep = value;
    }

    /**
     * Obtém o valor da propriedade vlrAnt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrAnt() {
        return vlrAnt;
    }

    /**
     * Define o valor da propriedade vlrAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrAnt(JAXBElement<String> value) {
        this.vlrAnt = value;
    }

    /**
     * Obtém o valor da propriedade vlrCm1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrCm1() {
        return vlrCm1;
    }

    /**
     * Define o valor da propriedade vlrCm1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrCm1(JAXBElement<String> value) {
        this.vlrCm1 = value;
    }

    /**
     * Obtém o valor da propriedade vlrCm2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrCm2() {
        return vlrCm2;
    }

    /**
     * Define o valor da propriedade vlrCm2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrCm2(JAXBElement<String> value) {
        this.vlrCm2 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm1() {
        return vlrDm1;
    }

    /**
     * Define o valor da propriedade vlrDm1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm1(JAXBElement<String> value) {
        this.vlrDm1 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm2() {
        return vlrDm2;
    }

    /**
     * Define o valor da propriedade vlrDm2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm2(JAXBElement<String> value) {
        this.vlrDm2 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm3() {
        return vlrDm3;
    }

    /**
     * Define o valor da propriedade vlrDm3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm3(JAXBElement<String> value) {
        this.vlrDm3 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm4() {
        return vlrDm4;
    }

    /**
     * Define o valor da propriedade vlrDm4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm4(JAXBElement<String> value) {
        this.vlrDm4 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm5() {
        return vlrDm5;
    }

    /**
     * Define o valor da propriedade vlrDm5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm5(JAXBElement<String> value) {
        this.vlrDm5 = value;
    }

    /**
     * Obtém o valor da propriedade vlrDm6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrDm6() {
        return vlrDm6;
    }

    /**
     * Define o valor da propriedade vlrDm6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrDm6(JAXBElement<String> value) {
        this.vlrDm6 = value;
    }

    /**
     * Obtém o valor da propriedade vlrEst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVlrEst() {
        return vlrEst;
    }

    /**
     * Define o valor da propriedade vlrEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVlrEst(JAXBElement<String> value) {
        this.vlrEst = value;
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

    /**
     * Obtém o valor da propriedade vltFab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVltFab() {
        return vltFab;
    }

    /**
     * Define o valor da propriedade vltFab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVltFab(JAXBElement<String> value) {
        this.vltFab = value;
    }

}
