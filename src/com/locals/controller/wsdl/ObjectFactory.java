//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.24 a las 01:25:36 PM CEST 
//


package com.locals.controller.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.locals.controller.wsdl package. 
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

    private final static QName _LlistarLocalsResponse_QNAME = new QName("http://guioSWWeb/", "llistarLocalsResponse");
    private final static QName _BaixaLocalResponse_QNAME = new QName("http://guioSWWeb/", "baixaLocalResponse");
    private final static QName _VerificarLocalResponse_QNAME = new QName("http://guioSWWeb/", "verificarLocalResponse");
    private final static QName _VerificarLocal_QNAME = new QName("http://guioSWWeb/", "verificarLocal");
    private final static QName _AltaLocalResponse_QNAME = new QName("http://guioSWWeb/", "altaLocalResponse");
    private final static QName _AltaLocal_QNAME = new QName("http://guioSWWeb/", "altaLocal");
    private final static QName _BaixaLocal_QNAME = new QName("http://guioSWWeb/", "baixaLocal");
    private final static QName _LlistarLocals_QNAME = new QName("http://guioSWWeb/", "llistarLocals");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.locals.controller.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LlistarLocals }
     * 
     */
    public LlistarLocals createLlistarLocals() {
        return new LlistarLocals();
    }

    /**
     * Create an instance of {@link BaixaLocal }
     * 
     */
    public BaixaLocal createBaixaLocal() {
        return new BaixaLocal();
    }

    /**
     * Create an instance of {@link AltaLocal }
     * 
     */
    public AltaLocal createAltaLocal() {
        return new AltaLocal();
    }

    /**
     * Create an instance of {@link AltaLocalResponse }
     * 
     */
    public AltaLocalResponse createAltaLocalResponse() {
        return new AltaLocalResponse();
    }

    /**
     * Create an instance of {@link VerificarLocalResponse }
     * 
     */
    public VerificarLocalResponse createVerificarLocalResponse() {
        return new VerificarLocalResponse();
    }

    /**
     * Create an instance of {@link BaixaLocalResponse }
     * 
     */
    public BaixaLocalResponse createBaixaLocalResponse() {
        return new BaixaLocalResponse();
    }

    /**
     * Create an instance of {@link VerificarLocal }
     * 
     */
    public VerificarLocal createVerificarLocal() {
        return new VerificarLocal();
    }

    /**
     * Create an instance of {@link LlistarLocalsResponse }
     * 
     */
    public LlistarLocalsResponse createLlistarLocalsResponse() {
        return new LlistarLocalsResponse();
    }

    /**
     * Create an instance of {@link LocalAccessibilitatDTO }
     * 
     */
    public LocalAccessibilitatDTO createLocalAccessibilitatDTO() {
        return new LocalAccessibilitatDTO();
    }

    /**
     * Create an instance of {@link Local }
     * 
     */
    public Local createLocal() {
        return new Local();
    }

    /**
     * Create an instance of {@link Accessibilitat }
     * 
     */
    public Accessibilitat createAccessibilitat() {
        return new Accessibilitat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlistarLocalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "llistarLocalsResponse")
    public JAXBElement<LlistarLocalsResponse> createLlistarLocalsResponse(LlistarLocalsResponse value) {
        return new JAXBElement<LlistarLocalsResponse>(_LlistarLocalsResponse_QNAME, LlistarLocalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaixaLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "baixaLocalResponse")
    public JAXBElement<BaixaLocalResponse> createBaixaLocalResponse(BaixaLocalResponse value) {
        return new JAXBElement<BaixaLocalResponse>(_BaixaLocalResponse_QNAME, BaixaLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "verificarLocalResponse")
    public JAXBElement<VerificarLocalResponse> createVerificarLocalResponse(VerificarLocalResponse value) {
        return new JAXBElement<VerificarLocalResponse>(_VerificarLocalResponse_QNAME, VerificarLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "verificarLocal")
    public JAXBElement<VerificarLocal> createVerificarLocal(VerificarLocal value) {
        return new JAXBElement<VerificarLocal>(_VerificarLocal_QNAME, VerificarLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "altaLocalResponse")
    public JAXBElement<AltaLocalResponse> createAltaLocalResponse(AltaLocalResponse value) {
        return new JAXBElement<AltaLocalResponse>(_AltaLocalResponse_QNAME, AltaLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "altaLocal")
    public JAXBElement<AltaLocal> createAltaLocal(AltaLocal value) {
        return new JAXBElement<AltaLocal>(_AltaLocal_QNAME, AltaLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaixaLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "baixaLocal")
    public JAXBElement<BaixaLocal> createBaixaLocal(BaixaLocal value) {
        return new JAXBElement<BaixaLocal>(_BaixaLocal_QNAME, BaixaLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlistarLocals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guioSWWeb/", name = "llistarLocals")
    public JAXBElement<LlistarLocals> createLlistarLocals(LlistarLocals value) {
        return new JAXBElement<LlistarLocals>(_LlistarLocals_QNAME, LlistarLocals.class, null, value);
    }

}
