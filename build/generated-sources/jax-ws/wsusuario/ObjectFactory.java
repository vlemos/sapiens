
package wsusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsusuario package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _McwfUsersGetPersonKindOutErroExecucao_QNAME = new QName("", "erroExecucao");
    private final static QName _McwfUsersGetPersonKindOutPmPersonKind_QNAME = new QName("", "pmPersonKind");
    private final static QName _McwfUsersGetPersonKindInFlowInstanceID_QNAME = new QName("", "flowInstanceID");
    private final static QName _McwfUsersGetPersonKindInFlowName_QNAME = new QName("", "flowName");
    private final static QName _McwfUsersGetPersonKindInPmPersonName_QNAME = new QName("", "pmPersonName");
    private final static QName _McwfUsersPersonExistsOutPmPersonExists_QNAME = new QName("", "pmPersonExists");
    private final static QName _McwfUsersAuthenticateJAASOutPmLogged_QNAME = new QName("", "pmLogged");
    private final static QName _McwfUsersAuthenticateJAASInPmEncrypted_QNAME = new QName("", "pmEncrypted");
    private final static QName _McwfUsersAuthenticateJAASInPmUserName_QNAME = new QName("", "pmUserName");
    private final static QName _McwfUsersAuthenticateJAASInPmUserPassword_QNAME = new QName("", "pmUserPassword");
    private final static QName _McwfUsersDiscoverUsersGroupsOutPmReturn_QNAME = new QName("", "pmReturn");
    private final static QName _McwfUsersGetUserGroupsOutPmGetUserGroupsResult_QNAME = new QName("", "pmGetUserGroupsResult");
    private final static QName _McwfUsersGetUserGroupsInPmGetUserGroupsUserName_QNAME = new QName("", "pmGetUserGroupsUserName");
    private final static QName _McwfUsersUserReplicationInPmUserReplicationXML_QNAME = new QName("", "pmUserReplicationXML");
    private final static QName _McwfUsersChangePasswordInPmNewPassword_QNAME = new QName("", "pmNewPassword");
    private final static QName _McwfUsersChangePasswordInPmNewPasswordConfirmation_QNAME = new QName("", "pmNewPasswordConfirmation");
    private final static QName _McwfUsersChangePasswordInPmPassword_QNAME = new QName("", "pmPassword");
    private final static QName _McwfUsersChangePasswordInPmUser_QNAME = new QName("", "pmUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsusuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link McwfUsersChangePasswordIn }
     * 
     */
    public McwfUsersChangePasswordIn createMcwfUsersChangePasswordIn() {
        return new McwfUsersChangePasswordIn();
    }

    /**
     * Create an instance of {@link McwfUsersChangePasswordOut }
     * 
     */
    public McwfUsersChangePasswordOut createMcwfUsersChangePasswordOut() {
        return new McwfUsersChangePasswordOut();
    }

    /**
     * Create an instance of {@link McwfUsersUserReplicationIn }
     * 
     */
    public McwfUsersUserReplicationIn createMcwfUsersUserReplicationIn() {
        return new McwfUsersUserReplicationIn();
    }

    /**
     * Create an instance of {@link McwfUsersUserReplicationOut }
     * 
     */
    public McwfUsersUserReplicationOut createMcwfUsersUserReplicationOut() {
        return new McwfUsersUserReplicationOut();
    }

    /**
     * Create an instance of {@link McwfUsersGetUserGroupsIn }
     * 
     */
    public McwfUsersGetUserGroupsIn createMcwfUsersGetUserGroupsIn() {
        return new McwfUsersGetUserGroupsIn();
    }

    /**
     * Create an instance of {@link McwfUsersGetUserGroupsOut }
     * 
     */
    public McwfUsersGetUserGroupsOut createMcwfUsersGetUserGroupsOut() {
        return new McwfUsersGetUserGroupsOut();
    }

    /**
     * Create an instance of {@link McwfUsersDiscoverUsersGroupsIn }
     * 
     */
    public McwfUsersDiscoverUsersGroupsIn createMcwfUsersDiscoverUsersGroupsIn() {
        return new McwfUsersDiscoverUsersGroupsIn();
    }

    /**
     * Create an instance of {@link McwfUsersDiscoverUsersGroupsOut }
     * 
     */
    public McwfUsersDiscoverUsersGroupsOut createMcwfUsersDiscoverUsersGroupsOut() {
        return new McwfUsersDiscoverUsersGroupsOut();
    }

    /**
     * Create an instance of {@link McwfUsersAuthenticateJAASIn }
     * 
     */
    public McwfUsersAuthenticateJAASIn createMcwfUsersAuthenticateJAASIn() {
        return new McwfUsersAuthenticateJAASIn();
    }

    /**
     * Create an instance of {@link McwfUsersAuthenticateJAASOut }
     * 
     */
    public McwfUsersAuthenticateJAASOut createMcwfUsersAuthenticateJAASOut() {
        return new McwfUsersAuthenticateJAASOut();
    }

    /**
     * Create an instance of {@link McwfUsersPersonExistsIn }
     * 
     */
    public McwfUsersPersonExistsIn createMcwfUsersPersonExistsIn() {
        return new McwfUsersPersonExistsIn();
    }

    /**
     * Create an instance of {@link McwfUsersPersonExistsOut }
     * 
     */
    public McwfUsersPersonExistsOut createMcwfUsersPersonExistsOut() {
        return new McwfUsersPersonExistsOut();
    }

    /**
     * Create an instance of {@link McwfUsersGetPersonKindIn }
     * 
     */
    public McwfUsersGetPersonKindIn createMcwfUsersGetPersonKindIn() {
        return new McwfUsersGetPersonKindIn();
    }

    /**
     * Create an instance of {@link McwfUsersGetPersonKindOut }
     * 
     */
    public McwfUsersGetPersonKindOut createMcwfUsersGetPersonKindOut() {
        return new McwfUsersGetPersonKindOut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersGetPersonKindOut.class)
    public JAXBElement<String> createMcwfUsersGetPersonKindOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersGetPersonKindOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPersonKind", scope = McwfUsersGetPersonKindOut.class)
    public JAXBElement<String> createMcwfUsersGetPersonKindOutPmPersonKind(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutPmPersonKind_QNAME, String.class, McwfUsersGetPersonKindOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersGetPersonKindIn.class)
    public JAXBElement<String> createMcwfUsersGetPersonKindInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersGetPersonKindIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersGetPersonKindIn.class)
    public JAXBElement<String> createMcwfUsersGetPersonKindInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersGetPersonKindIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPersonName", scope = McwfUsersGetPersonKindIn.class)
    public JAXBElement<String> createMcwfUsersGetPersonKindInPmPersonName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInPmPersonName_QNAME, String.class, McwfUsersGetPersonKindIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersPersonExistsOut.class)
    public JAXBElement<String> createMcwfUsersPersonExistsOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersPersonExistsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPersonExists", scope = McwfUsersPersonExistsOut.class)
    public JAXBElement<String> createMcwfUsersPersonExistsOutPmPersonExists(String value) {
        return new JAXBElement<String>(_McwfUsersPersonExistsOutPmPersonExists_QNAME, String.class, McwfUsersPersonExistsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersPersonExistsIn.class)
    public JAXBElement<String> createMcwfUsersPersonExistsInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersPersonExistsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersPersonExistsIn.class)
    public JAXBElement<String> createMcwfUsersPersonExistsInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersPersonExistsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPersonKind", scope = McwfUsersPersonExistsIn.class)
    public JAXBElement<String> createMcwfUsersPersonExistsInPmPersonKind(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutPmPersonKind_QNAME, String.class, McwfUsersPersonExistsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPersonName", scope = McwfUsersPersonExistsIn.class)
    public JAXBElement<String> createMcwfUsersPersonExistsInPmPersonName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInPmPersonName_QNAME, String.class, McwfUsersPersonExistsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersAuthenticateJAASOut.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersAuthenticateJAASOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmLogged", scope = McwfUsersAuthenticateJAASOut.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASOutPmLogged(String value) {
        return new JAXBElement<String>(_McwfUsersAuthenticateJAASOutPmLogged_QNAME, String.class, McwfUsersAuthenticateJAASOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersAuthenticateJAASIn.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersAuthenticateJAASIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersAuthenticateJAASIn.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersAuthenticateJAASIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmEncrypted", scope = McwfUsersAuthenticateJAASIn.class)
    public JAXBElement<Integer> createMcwfUsersAuthenticateJAASInPmEncrypted(Integer value) {
        return new JAXBElement<Integer>(_McwfUsersAuthenticateJAASInPmEncrypted_QNAME, Integer.class, McwfUsersAuthenticateJAASIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmUserName", scope = McwfUsersAuthenticateJAASIn.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASInPmUserName(String value) {
        return new JAXBElement<String>(_McwfUsersAuthenticateJAASInPmUserName_QNAME, String.class, McwfUsersAuthenticateJAASIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmUserPassword", scope = McwfUsersAuthenticateJAASIn.class)
    public JAXBElement<String> createMcwfUsersAuthenticateJAASInPmUserPassword(String value) {
        return new JAXBElement<String>(_McwfUsersAuthenticateJAASInPmUserPassword_QNAME, String.class, McwfUsersAuthenticateJAASIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersDiscoverUsersGroupsOut.class)
    public JAXBElement<String> createMcwfUsersDiscoverUsersGroupsOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersDiscoverUsersGroupsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmReturn", scope = McwfUsersDiscoverUsersGroupsOut.class)
    public JAXBElement<String> createMcwfUsersDiscoverUsersGroupsOutPmReturn(String value) {
        return new JAXBElement<String>(_McwfUsersDiscoverUsersGroupsOutPmReturn_QNAME, String.class, McwfUsersDiscoverUsersGroupsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersDiscoverUsersGroupsIn.class)
    public JAXBElement<String> createMcwfUsersDiscoverUsersGroupsInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersDiscoverUsersGroupsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersDiscoverUsersGroupsIn.class)
    public JAXBElement<String> createMcwfUsersDiscoverUsersGroupsInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersDiscoverUsersGroupsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersGetUserGroupsOut.class)
    public JAXBElement<String> createMcwfUsersGetUserGroupsOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersGetUserGroupsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmGetUserGroupsResult", scope = McwfUsersGetUserGroupsOut.class)
    public JAXBElement<String> createMcwfUsersGetUserGroupsOutPmGetUserGroupsResult(String value) {
        return new JAXBElement<String>(_McwfUsersGetUserGroupsOutPmGetUserGroupsResult_QNAME, String.class, McwfUsersGetUserGroupsOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersGetUserGroupsIn.class)
    public JAXBElement<String> createMcwfUsersGetUserGroupsInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersGetUserGroupsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersGetUserGroupsIn.class)
    public JAXBElement<String> createMcwfUsersGetUserGroupsInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersGetUserGroupsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmGetUserGroupsUserName", scope = McwfUsersGetUserGroupsIn.class)
    public JAXBElement<String> createMcwfUsersGetUserGroupsInPmGetUserGroupsUserName(String value) {
        return new JAXBElement<String>(_McwfUsersGetUserGroupsInPmGetUserGroupsUserName_QNAME, String.class, McwfUsersGetUserGroupsIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersUserReplicationOut.class)
    public JAXBElement<String> createMcwfUsersUserReplicationOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersUserReplicationOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersUserReplicationIn.class)
    public JAXBElement<String> createMcwfUsersUserReplicationInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersUserReplicationIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersUserReplicationIn.class)
    public JAXBElement<String> createMcwfUsersUserReplicationInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersUserReplicationIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmUserReplicationXML", scope = McwfUsersUserReplicationIn.class)
    public JAXBElement<String> createMcwfUsersUserReplicationInPmUserReplicationXML(String value) {
        return new JAXBElement<String>(_McwfUsersUserReplicationInPmUserReplicationXML_QNAME, String.class, McwfUsersUserReplicationIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = McwfUsersChangePasswordOut.class)
    public JAXBElement<String> createMcwfUsersChangePasswordOutErroExecucao(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindOutErroExecucao_QNAME, String.class, McwfUsersChangePasswordOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInFlowInstanceID(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowInstanceID_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInFlowName(String value) {
        return new JAXBElement<String>(_McwfUsersGetPersonKindInFlowName_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmNewPassword", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInPmNewPassword(String value) {
        return new JAXBElement<String>(_McwfUsersChangePasswordInPmNewPassword_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmNewPasswordConfirmation", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInPmNewPasswordConfirmation(String value) {
        return new JAXBElement<String>(_McwfUsersChangePasswordInPmNewPasswordConfirmation_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmPassword", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInPmPassword(String value) {
        return new JAXBElement<String>(_McwfUsersChangePasswordInPmPassword_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pmUser", scope = McwfUsersChangePasswordIn.class)
    public JAXBElement<String> createMcwfUsersChangePasswordInPmUser(String value) {
        return new JAXBElement<String>(_McwfUsersChangePasswordInPmUser_QNAME, String.class, McwfUsersChangePasswordIn.class, value);
    }

}
