
package src.main.java.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the src.main.java.client package. 
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

    private final static QName _CrearPublicacionResponse_QNAME = new QName("http://servicios/", "CrearPublicacionResponse");
    private final static QName _GetPublicaciones_QNAME = new QName("http://servicios/", "getPublicaciones");
    private final static QName _HolaMundo_QNAME = new QName("http://servicios/", "holaMundo");
    private final static QName _HolaMundoResponse_QNAME = new QName("http://servicios/", "holaMundoResponse");
    private final static QName _GetPublicacionesResponse_QNAME = new QName("http://servicios/", "getPublicacionesResponse");
    private final static QName _CrearPublicacion_QNAME = new QName("http://servicios/", "CrearPublicacion");
    private final static QName _CrearPublicacionArg0_QNAME = new QName("", "arg0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: src.main.java.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HolaMundoResponse }
     * 
     */
    public HolaMundoResponse createHolaMundoResponse() {
        return new HolaMundoResponse();
    }

    /**
     * Create an instance of {@link GetPublicacionesResponse }
     * 
     */
    public GetPublicacionesResponse createGetPublicacionesResponse() {
        return new GetPublicacionesResponse();
    }

    /**
     * Create an instance of {@link CrearPublicacion }
     * 
     */
    public CrearPublicacion createCrearPublicacion() {
        return new CrearPublicacion();
    }

    /**
     * Create an instance of {@link CrearPublicacionResponse }
     * 
     */
    public CrearPublicacionResponse createCrearPublicacionResponse() {
        return new CrearPublicacionResponse();
    }

    /**
     * Create an instance of {@link GetPublicaciones }
     * 
     */
    public GetPublicaciones createGetPublicaciones() {
        return new GetPublicaciones();
    }

    /**
     * Create an instance of {@link HolaMundo }
     * 
     */
    public HolaMundo createHolaMundo() {
        return new HolaMundo();
    }

    /**
     * Create an instance of {@link PostSOAP }
     * 
     */
    public PostSOAP createPostSOAP() {
        return new PostSOAP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPublicacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CrearPublicacionResponse")
    public JAXBElement<CrearPublicacionResponse> createCrearPublicacionResponse(CrearPublicacionResponse value) {
        return new JAXBElement<CrearPublicacionResponse>(_CrearPublicacionResponse_QNAME, CrearPublicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getPublicaciones")
    public JAXBElement<GetPublicaciones> createGetPublicaciones(GetPublicaciones value) {
        return new JAXBElement<GetPublicaciones>(_GetPublicaciones_QNAME, GetPublicaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "holaMundo")
    public JAXBElement<HolaMundo> createHolaMundo(HolaMundo value) {
        return new JAXBElement<HolaMundo>(_HolaMundo_QNAME, HolaMundo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "holaMundoResponse")
    public JAXBElement<HolaMundoResponse> createHolaMundoResponse(HolaMundoResponse value) {
        return new JAXBElement<HolaMundoResponse>(_HolaMundoResponse_QNAME, HolaMundoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getPublicacionesResponse")
    public JAXBElement<GetPublicacionesResponse> createGetPublicacionesResponse(GetPublicacionesResponse value) {
        return new JAXBElement<GetPublicacionesResponse>(_GetPublicacionesResponse_QNAME, GetPublicacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPublicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CrearPublicacion")
    public JAXBElement<CrearPublicacion> createCrearPublicacion(CrearPublicacion value) {
        return new JAXBElement<CrearPublicacion>(_CrearPublicacion_QNAME, CrearPublicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = CrearPublicacion.class)
    public JAXBElement<byte[]> createCrearPublicacionArg0(byte[] value) {
        return new JAXBElement<byte[]>(_CrearPublicacionArg0_QNAME, byte[].class, CrearPublicacion.class, ((byte[]) value));
    }

}
