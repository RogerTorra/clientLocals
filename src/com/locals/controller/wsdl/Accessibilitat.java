//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.24 a las 01:25:36 PM CEST 
//


package com.locals.controller.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accessibilitat complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accessibilitat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiAccessibilitat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiCaracteristica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiLocal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiNivell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessibilitat", propOrder = {
    "codiAccessibilitat",
    "codiCaracteristica",
    "codiLocal",
    "codiNivell",
    "valor"
})
public class Accessibilitat {

    protected int codiAccessibilitat;
    protected int codiCaracteristica;
    protected int codiLocal;
    protected int codiNivell;
    protected int valor;

    /**
     * Obtiene el valor de la propiedad codiAccessibilitat.
     * 
     */
    public int getCodiAccessibilitat() {
        return codiAccessibilitat;
    }

    /**
     * Define el valor de la propiedad codiAccessibilitat.
     * 
     */
    public void setCodiAccessibilitat(int value) {
        this.codiAccessibilitat = value;
    }

    /**
     * Obtiene el valor de la propiedad codiCaracteristica.
     * 
     */
    public int getCodiCaracteristica() {
        return codiCaracteristica;
    }

    /**
     * Define el valor de la propiedad codiCaracteristica.
     * 
     */
    public void setCodiCaracteristica(int value) {
        this.codiCaracteristica = value;
    }

    /**
     * Obtiene el valor de la propiedad codiLocal.
     * 
     */
    public int getCodiLocal() {
        return codiLocal;
    }

    /**
     * Define el valor de la propiedad codiLocal.
     * 
     */
    public void setCodiLocal(int value) {
        this.codiLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad codiNivell.
     * 
     */
    public int getCodiNivell() {
        return codiNivell;
    }

    /**
     * Define el valor de la propiedad codiNivell.
     * 
     */
    public void setCodiNivell(int value) {
        this.codiNivell = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public int getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(int value) {
        this.valor = value;
    }

}
