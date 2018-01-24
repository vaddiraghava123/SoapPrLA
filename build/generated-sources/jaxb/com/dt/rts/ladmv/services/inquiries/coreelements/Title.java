//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.inquiries.coreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.vehicleinquiry.TitleType;


/**
 * <p>Java class for Title complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Title"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentTitleNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrevTitleNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrevTitleTransTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrevTitleTransDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrevTitleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Title", propOrder = {
    "currentTitleNum",
    "prevTitleNum",
    "prevTitleTransTypeCode",
    "prevTitleTransDate",
    "prevTitleState"
})
@XmlSeeAlso({
    TitleType.class
})
public class Title {

    @XmlElement(name = "CurrentTitleNum", required = true)
    protected String currentTitleNum;
    @XmlElement(name = "PrevTitleNum", nillable = true)
    protected String prevTitleNum;
    @XmlElement(name = "PrevTitleTransTypeCode", nillable = true)
    protected String prevTitleTransTypeCode;
    @XmlElement(name = "PrevTitleTransDate")
    protected String prevTitleTransDate;
    @XmlElement(name = "PrevTitleState", nillable = true)
    protected String prevTitleState;

    /**
     * Gets the value of the currentTitleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTitleNum() {
        return currentTitleNum;
    }

    /**
     * Sets the value of the currentTitleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTitleNum(String value) {
        this.currentTitleNum = value;
    }

    /**
     * Gets the value of the prevTitleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevTitleNum() {
        return prevTitleNum;
    }

    /**
     * Sets the value of the prevTitleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevTitleNum(String value) {
        this.prevTitleNum = value;
    }

    /**
     * Gets the value of the prevTitleTransTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevTitleTransTypeCode() {
        return prevTitleTransTypeCode;
    }

    /**
     * Sets the value of the prevTitleTransTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevTitleTransTypeCode(String value) {
        this.prevTitleTransTypeCode = value;
    }

    /**
     * Gets the value of the prevTitleTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevTitleTransDate() {
        return prevTitleTransDate;
    }

    /**
     * Sets the value of the prevTitleTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevTitleTransDate(String value) {
        this.prevTitleTransDate = value;
    }

    /**
     * Gets the value of the prevTitleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevTitleState() {
        return prevTitleState;
    }

    /**
     * Sets the value of the prevTitleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevTitleState(String value) {
        this.prevTitleState = value;
    }

}
