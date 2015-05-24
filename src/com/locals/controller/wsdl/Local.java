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
 * <p>Clase Java para local complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="local">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiCarrer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiLocal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codiTipoLocal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomCarrer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observacions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verificat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "local", propOrder = {
    "codiCarrer",
    "codiLocal",
    "codiTipoLocal",
    "nomCarrer",
    "nomLocal",
    "nomVia",
    "numero",
    "observacions",
    "verificat"
})
public class Local {

    protected int codiCarrer;
    protected int codiLocal;
    protected int codiTipoLocal;
    protected String nomCarrer;
    protected String nomLocal;
    protected String nomVia;
    protected int numero;
    protected String observacions;
    protected boolean verificat;

    /**
     * Obtiene el valor de la propiedad codiCarrer.
     * 
     */
    public int getCodiCarrer() {
        return codiCarrer;
    }

    /**
     * Define el valor de la propiedad codiCarrer.
     * 
     */
    public void setCodiCarrer(int value) {
        this.codiCarrer = value;
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
     * Obtiene el valor de la propiedad codiTipoLocal.
     * 
     */
    public int getCodiTipoLocal() {
        return codiTipoLocal;
    }

    /**
     * Define el valor de la propiedad codiTipoLocal.
     * 
     */
    public void setCodiTipoLocal(int value) {
        this.codiTipoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCarrer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCarrer() {
        return nomCarrer;
    }

    /**
     * Define el valor de la propiedad nomCarrer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCarrer(String value) {
        this.nomCarrer = value;
    }

    /**
     * Obtiene el valor de la propiedad nomLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomLocal() {
        return nomLocal;
    }

    /**
     * Define el valor de la propiedad nomLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomLocal(String value) {
        this.nomLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad nomVia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomVia() {
        return nomVia;
    }

    /**
     * Define el valor de la propiedad nomVia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomVia(String value) {
        this.nomVia = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad observacions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacions() {
        return observacions;
    }

    /**
     * Define el valor de la propiedad observacions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacions(String value) {
        this.observacions = value;
    }

    /**
     * Obtiene el valor de la propiedad verificat.
     * 
     */
    public boolean isVerificat() {
        return verificat;
    }

    /**
     * Define el valor de la propiedad verificat.
     * 
     */
    public void setVerificat(boolean value) {
        this.verificat = value;
    }

}
