//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.17 a las 02:59:51 PM CDT 
//


package https.uv_mx.ejercicioss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.uv_mx.ejercicioss package. 
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

    private final static QName _BuscarReservacionRequest_QNAME = new QName("https://uv.mx/ejercicioss", "BuscarReservacionRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.uv_mx.ejercicioss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarReservacionResponse }
     * 
     */
    public BuscarReservacionResponse createBuscarReservacionResponse() {
        return new BuscarReservacionResponse();
    }

    /**
     * Create an instance of {@link ReservarRequest }
     * 
     */
    public ReservarRequest createReservarRequest() {
        return new ReservarRequest();
    }

    /**
     * Create an instance of {@link ReservarResponse }
     * 
     */
    public ReservarResponse createReservarResponse() {
        return new ReservarResponse();
    }

    /**
     * Create an instance of {@link BuscarReservacionResponse.Reservaciones }
     * 
     */
    public BuscarReservacionResponse.Reservaciones createBuscarReservacionResponseReservaciones() {
        return new BuscarReservacionResponse.Reservaciones();
    }

    /**
     * Create an instance of {@link ModificarReservacionRequest }
     * 
     */
    public ModificarReservacionRequest createModificarReservacionRequest() {
        return new ModificarReservacionRequest();
    }

    /**
     * Create an instance of {@link ModificarReservacionResponse }
     * 
     */
    public ModificarReservacionResponse createModificarReservacionResponse() {
        return new ModificarReservacionResponse();
    }

    /**
     * Create an instance of {@link BorrarReservacionRequest }
     * 
     */
    public BorrarReservacionRequest createBorrarReservacionRequest() {
        return new BorrarReservacionRequest();
    }

    /**
     * Create an instance of {@link BorrarReservacionResponse }
     * 
     */
    public BorrarReservacionResponse createBorrarReservacionResponse() {
        return new BorrarReservacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://uv.mx/ejercicioss", name = "BuscarReservacionRequest")
    public JAXBElement<Object> createBuscarReservacionRequest(Object value) {
        return new JAXBElement<Object>(_BuscarReservacionRequest_QNAME, Object.class, null, value);
    }

}
