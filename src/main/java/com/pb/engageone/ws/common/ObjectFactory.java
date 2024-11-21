
package com.pb.engageone.ws.common;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pb.engageone.ws.common package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pb.engageone.ws.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.pb.engageone.ws.common.ResponseMessage.Messages }
     * 
     */
    public com.pb.engageone.ws.common.ResponseMessage.Messages createResponseMessageMessages() {
        return new com.pb.engageone.ws.common.ResponseMessage.Messages();
    }

    /**
     * Create an instance of {@link RequestContext }
     * 
     */
    public RequestContext createRequestContext() {
        return new RequestContext();
    }

    /**
     * Create an instance of {@link AuthContext }
     * 
     */
    public AuthContext createAuthContext() {
        return new AuthContext();
    }

    /**
     * Create an instance of {@link AuthContext.UsernameToken }
     * 
     */
    public AuthContext.UsernameToken createAuthContextUsernameToken() {
        return new AuthContext.UsernameToken();
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link StringIdOrName }
     * 
     */
    public StringIdOrName createStringIdOrName() {
        return new StringIdOrName();
    }

    /**
     * Create an instance of {@link IntegerIdOrName }
     * 
     */
    public IntegerIdOrName createIntegerIdOrName() {
        return new IntegerIdOrName();
    }

    /**
     * Create an instance of {@link com.pb.engageone.ws.common.ResponseMessage.Messages.Message }
     * 
     */
    public com.pb.engageone.ws.common.ResponseMessage.Messages.Message createResponseMessageMessagesMessage() {
        return new com.pb.engageone.ws.common.ResponseMessage.Messages.Message();
    }

    /**
     * Create an instance of {@link RequestContext.Domain }
     * 
     */
    public RequestContext.Domain createRequestContextDomain() {
        return new RequestContext.Domain();
    }

    /**
     * Create an instance of {@link RequestContext.User }
     * 
     */
    public RequestContext.User createRequestContextUser() {
        return new RequestContext.User();
    }

    /**
     * Create an instance of {@link AuthContext.SessionToken }
     * 
     */
    public AuthContext.SessionToken createAuthContextSessionToken() {
        return new AuthContext.SessionToken();
    }

    /**
     * Create an instance of {@link AuthContext.UsernameToken.Domain }
     * 
     */
    public AuthContext.UsernameToken.Domain createAuthContextUsernameTokenDomain() {
        return new AuthContext.UsernameToken.Domain();
    }

}
