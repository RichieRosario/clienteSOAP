
package src.main.java.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AcademicWebServices", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AcademicWebServices {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "holaMundo", targetNamespace = "http://servicios/", className = "src.main.java.client.HolaMundo")
    @ResponseWrapper(localName = "holaMundoResponse", targetNamespace = "http://servicios/", className = "src.main.java.client.HolaMundoResponse")
    @Action(input = "http://servicios/AcademicWebServices/holaMundoRequest", output = "http://servicios/AcademicWebServices/holaMundoResponse")
    public String holaMundo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<src.main.java.client.PostSOAP>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPublicaciones", targetNamespace = "http://servicios/", className = "src.main.java.client.GetPublicaciones")
    @ResponseWrapper(localName = "getPublicacionesResponse", targetNamespace = "http://servicios/", className = "src.main.java.client.GetPublicacionesResponse")
    @Action(input = "http://servicios/AcademicWebServices/getPublicacionesRequest", output = "http://servicios/AcademicWebServices/getPublicacionesResponse")
    public List<PostSOAP> getPublicaciones(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "CrearPublicacion")
    @RequestWrapper(localName = "CrearPublicacion", targetNamespace = "http://servicios/", className = "src.main.java.client.CrearPublicacion")
    @ResponseWrapper(localName = "CrearPublicacionResponse", targetNamespace = "http://servicios/", className = "src.main.java.client.CrearPublicacionResponse")
    @Action(input = "http://servicios/AcademicWebServices/CrearPublicacionRequest", output = "http://servicios/AcademicWebServices/CrearPublicacionResponse")
    public void crearPublicacion(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

}
