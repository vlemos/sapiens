
package wsusuario;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "sapiens_SyncMCWFUsers", targetNamespace = "http://services.senior.com.br")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SapiensSyncMCWFUsers {


    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersAuthenticateJAASOut
     */
    @WebMethod(operationName = "AuthenticateJAAS")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/AuthenticateJAASRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/AuthenticateJAASResponse")
    public McwfUsersAuthenticateJAASOut authenticateJAAS(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersAuthenticateJAASIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersDiscoverUsersGroupsOut
     */
    @WebMethod(operationName = "DiscoverUsersGroups")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/DiscoverUsersGroupsRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/DiscoverUsersGroupsResponse")
    public McwfUsersDiscoverUsersGroupsOut discoverUsersGroups(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersDiscoverUsersGroupsIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersUserReplicationOut
     */
    @WebMethod(operationName = "UserReplication")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/UserReplicationRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/UserReplicationResponse")
    public McwfUsersUserReplicationOut userReplication(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersUserReplicationIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersChangePasswordOut
     */
    @WebMethod(operationName = "ChangePassword")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/ChangePasswordRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/ChangePasswordResponse")
    public McwfUsersChangePasswordOut changePassword(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersChangePasswordIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersGetPersonKindOut
     */
    @WebMethod(operationName = "GetPersonKind")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/GetPersonKindRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/GetPersonKindResponse")
    public McwfUsersGetPersonKindOut getPersonKind(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersGetPersonKindIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersGetUserGroupsOut
     */
    @WebMethod(operationName = "GetUserGroups")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/GetUserGroupsRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/GetUserGroupsResponse")
    public McwfUsersGetUserGroupsOut getUserGroups(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersGetUserGroupsIn parameters);

    /**
     * 
     * @param password
     * @param encryption
     * @param user
     * @param parameters
     * @return
     *     returns wsusuario.McwfUsersPersonExistsOut
     */
    @WebMethod(operationName = "PersonExists")
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://services.senior.com.br/sapiens_SyncMCWFUsers/PersonExistsRequest", output = "http://services.senior.com.br/sapiens_SyncMCWFUsers/PersonExistsResponse")
    public McwfUsersPersonExistsOut personExists(
        @WebParam(name = "user", partName = "user")
        String user,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "encryption", partName = "encryption")
        int encryption,
        @WebParam(name = "parameters", partName = "parameters")
        McwfUsersPersonExistsIn parameters);

}