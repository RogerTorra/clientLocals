//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.05.24 a las 01:25:36 PM CEST 
//


package com.locals.controller.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para localAccessibilitatDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localAccessibilitatDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="local" type="{http://guioSWWeb/}local" minOccurs="0"/>
 *         &lt;element name="lAccessibilitat" type="{http://guioSWWeb/}accessibilitat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localAccessibilitatDTO", propOrder = {
    "local",
    "lAccessibilitat"
})
public class LocalAccessibilitatDTO {

    protected Local local;
    @XmlElement(nillable = true)
    protected List<Accessibilitat> lAccessibilitat;

    /**
     * Obtiene el valor de la propiedad local.
     * 
     * @return
     *     possible object is
     *     {@link Local }
     *     
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Define el valor de la propiedad local.
     * 
     * @param value
     *     allowed object is
     *     {@link Local }
     *     
     */
    public void setLocal(Local value) {
        this.local = value;
    }

    /**
     * Gets the value of the lAccessibilitat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lAccessibilitat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLAccessibilitat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accessibilitat }
     * 
     * 
     */
    public List<Accessibilitat> getLAccessibilitat() {
        if (lAccessibilitat == null) {
            lAccessibilitat = new ArrayList<Accessibilitat>();
        }
        return this.lAccessibilitat;
    }

}
