//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.inquiries.electroniclieninquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.coreelements.LienHolder;


/**
 * <p>Java class for LienType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LienHolder" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}LienHolder"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LienType", propOrder = {
    "lienHolder"
})
public class LienType {

    @XmlElement(name = "LienHolder", required = true)
    protected LienHolder lienHolder;

    /**
     * Gets the value of the lienHolder property.
     * 
     * @return
     *     possible object is
     *     {@link LienHolder }
     *     
     */
    public LienHolder getLienHolder() {
        return lienHolder;
    }

    /**
     * Sets the value of the lienHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienHolder }
     *     
     */
    public void setLienHolder(LienHolder value) {
        this.lienHolder = value;
    }

}
