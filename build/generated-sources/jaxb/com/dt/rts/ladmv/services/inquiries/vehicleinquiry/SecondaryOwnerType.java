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
import com.dt.rts.ladmv.services.inquiries.coreelements.Party;


/**
 * <p>Java class for SecondaryOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryOwnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}Party"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OwnerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryOwnerType", propOrder = {
    "ownerType",
    "ownerStatus",
    "customerNum"
})
public class SecondaryOwnerType
    extends Party
{

    @XmlElement(name = "OwnerType", nillable = true)
    protected Integer ownerType;
    @XmlElement(name = "OwnerStatus", nillable = true)
    protected String ownerStatus;
    @XmlElement(name = "CustomerNum", nillable = true)
    protected String customerNum;

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerType(Integer value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the ownerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerStatus() {
        return ownerStatus;
    }

    /**
     * Sets the value of the ownerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerStatus(String value) {
        this.ownerStatus = value;
    }

    /**
     * Gets the value of the customerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNum() {
        return customerNum;
    }

    /**
     * Sets the value of the customerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNum(String value) {
        this.customerNum = value;
    }

}
