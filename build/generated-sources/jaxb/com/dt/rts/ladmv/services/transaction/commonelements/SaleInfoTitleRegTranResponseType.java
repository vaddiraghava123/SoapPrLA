//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.transaction.commonelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleInfoTitleRegTranResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleInfoTitleRegTranResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rts.dt.com/ladmv/services/transaction/CommonElements}SaleInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialFeesCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectvDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleInfoTitleRegTranResponseType", propOrder = {
    "specialFeesCode",
    "taxDate",
    "effectvDate",
    "paymentMode"
})
public class SaleInfoTitleRegTranResponseType
    extends SaleInfoType
{

    @XmlElement(name = "SpecialFeesCode", required = true)
    protected String specialFeesCode;
    @XmlElement(name = "TaxDate", required = true)
    protected String taxDate;
    @XmlElement(name = "EffectvDate", required = true)
    protected String effectvDate;
    @XmlElement(name = "PaymentMode", required = true)
    protected String paymentMode;

    /**
     * Gets the value of the specialFeesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeesCode() {
        return specialFeesCode;
    }

    /**
     * Sets the value of the specialFeesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeesCode(String value) {
        this.specialFeesCode = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDate(String value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the effectvDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectvDate() {
        return effectvDate;
    }

    /**
     * Sets the value of the effectvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectvDate(String value) {
        this.effectvDate = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

}
