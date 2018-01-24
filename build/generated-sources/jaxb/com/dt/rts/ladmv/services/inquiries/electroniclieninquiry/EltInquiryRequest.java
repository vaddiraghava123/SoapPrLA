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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InquiryHeader" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}InquiryHeaderType"/&gt;
 *         &lt;element name="Inquiry"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EltType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inquiryHeader",
    "inquiry"
})
@XmlRootElement(name = "EltInquiryRequest")
public class EltInquiryRequest {

    @XmlElement(name = "InquiryHeader", required = true)
    protected InquiryHeaderType inquiryHeader;
    @XmlElement(name = "Inquiry", required = true)
    protected EltInquiryRequest.Inquiry inquiry;

    /**
     * Gets the value of the inquiryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryHeaderType }
     *     
     */
    public InquiryHeaderType getInquiryHeader() {
        return inquiryHeader;
    }

    /**
     * Sets the value of the inquiryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryHeaderType }
     *     
     */
    public void setInquiryHeader(InquiryHeaderType value) {
        this.inquiryHeader = value;
    }

    /**
     * Gets the value of the inquiry property.
     * 
     * @return
     *     possible object is
     *     {@link EltInquiryRequest.Inquiry }
     *     
     */
    public EltInquiryRequest.Inquiry getInquiry() {
        return inquiry;
    }

    /**
     * Sets the value of the inquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EltInquiryRequest.Inquiry }
     *     
     */
    public void setInquiry(EltInquiryRequest.Inquiry value) {
        this.inquiry = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EltType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inquiryType",
        "eltType"
    })
    public static class Inquiry {

        @XmlElement(name = "InquiryType", nillable = true)
        protected String inquiryType;
        @XmlElement(name = "EltType", nillable = true)
        protected String eltType;

        /**
         * Gets the value of the inquiryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInquiryType() {
            return inquiryType;
        }

        /**
         * Sets the value of the inquiryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInquiryType(String value) {
            this.inquiryType = value;
        }

        /**
         * Gets the value of the eltType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEltType() {
            return eltType;
        }

        /**
         * Sets the value of the eltType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEltType(String value) {
            this.eltType = value;
        }

    }

}
