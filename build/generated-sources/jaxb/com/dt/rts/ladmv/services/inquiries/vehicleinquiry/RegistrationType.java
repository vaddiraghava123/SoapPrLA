//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.inquiries.vehicleinquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.coreelements.Registration;


/**
 * <p>Java class for RegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}Registration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrevPlateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrevPlateExpDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationType", propOrder = {
    "prevPlateNum",
    "prevPlateExpDate"
})
public class RegistrationType
    extends Registration
{

    @XmlElement(name = "PrevPlateNum", nillable = true)
    protected String prevPlateNum;
    @XmlElement(name = "PrevPlateExpDate", nillable = true)
    protected String prevPlateExpDate;

    /**
     * Gets the value of the prevPlateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPlateNum() {
        return prevPlateNum;
    }

    /**
     * Sets the value of the prevPlateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPlateNum(String value) {
        this.prevPlateNum = value;
    }

    /**
     * Gets the value of the prevPlateExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPlateExpDate() {
        return prevPlateExpDate;
    }

    /**
     * Sets the value of the prevPlateExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPlateExpDate(String value) {
        this.prevPlateExpDate = value;
    }

}
