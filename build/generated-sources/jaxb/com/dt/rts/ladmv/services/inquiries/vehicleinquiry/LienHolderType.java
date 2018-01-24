//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.inquiries.vehicleinquiry;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.coreelements.Party;


/**
 * <p>Java class for LienHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienHolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}Party"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LienDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LienAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="2"/&gt;
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
@XmlType(name = "LienHolderType", propOrder = {
    "lienDate",
    "lienAmount"
})
public class LienHolderType
    extends Party
{

    @XmlElement(name = "LienDate", required = true)
    protected String lienDate;
    @XmlElement(name = "LienAmount", nillable = true)
    protected BigDecimal lienAmount;

    /**
     * Gets the value of the lienDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienDate() {
        return lienDate;
    }

    /**
     * Sets the value of the lienDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienDate(String value) {
        this.lienDate = value;
    }

    /**
     * Gets the value of the lienAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLienAmount() {
        return lienAmount;
    }

    /**
     * Sets the value of the lienAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLienAmount(BigDecimal value) {
        this.lienAmount = value;
    }

}
