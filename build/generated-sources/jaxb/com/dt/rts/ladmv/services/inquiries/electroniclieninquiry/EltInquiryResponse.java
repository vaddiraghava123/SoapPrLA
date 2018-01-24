//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 03:19:10 AM EST 
//


package com.dt.rts.ladmv.services.inquiries.electroniclieninquiry;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.coreelements.ErrorsListType;


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
 *         &lt;element name="Inquiry"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InquiryHeader" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}InquiryHeaderType" minOccurs="0"/&gt;
 *                   &lt;element name="EltType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Liens" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}LienType" minOccurs="0"/&gt;
 *                   &lt;element name="PublicTagAgents" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}PTAs" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="Errors" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}ErrorsListType" minOccurs="0"/&gt;
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
    "inquiry"
})
@XmlRootElement(name = "EltInquiryResponse")
public class EltInquiryResponse {

    @XmlElement(name = "Inquiry", required = true)
    protected EltInquiryResponse.Inquiry inquiry;

    /**
     * Gets the value of the inquiry property.
     * 
     * @return
     *     possible object is
     *     {@link EltInquiryResponse.Inquiry }
     *     
     */
    public EltInquiryResponse.Inquiry getInquiry() {
        return inquiry;
    }

    /**
     * Sets the value of the inquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EltInquiryResponse.Inquiry }
     *     
     */
    public void setInquiry(EltInquiryResponse.Inquiry value) {
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
     *         &lt;element name="InquiryHeader" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}InquiryHeaderType" minOccurs="0"/&gt;
     *         &lt;element name="EltType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Liens" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}LienType" minOccurs="0"/&gt;
     *         &lt;element name="PublicTagAgents" type="{http://rts.dt.com/ladmv/services/inquiries/ElectronicLienInquiry}PTAs" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="Errors" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}ErrorsListType" minOccurs="0"/&gt;
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
        "eltType",
        "liens",
        "publicTagAgents",
        "errors"
    })
    public static class Inquiry {

        @XmlElement(name = "InquiryHeader", nillable = true)
        protected InquiryHeaderType inquiryHeader;
        @XmlElement(name = "EltType", nillable = true)
        protected String eltType;
        @XmlElement(name = "Liens", nillable = true)
        protected LienType liens;
        @XmlElement(name = "PublicTagAgents", nillable = true)
        protected List<PTAs> publicTagAgents;
        @XmlElement(name = "Errors")
        protected ErrorsListType errors;

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

        /**
         * Gets the value of the liens property.
         * 
         * @return
         *     possible object is
         *     {@link LienType }
         *     
         */
        public LienType getLiens() {
            return liens;
        }

        /**
         * Sets the value of the liens property.
         * 
         * @param value
         *     allowed object is
         *     {@link LienType }
         *     
         */
        public void setLiens(LienType value) {
            this.liens = value;
        }

        /**
         * Gets the value of the publicTagAgents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicTagAgents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublicTagAgents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTAs }
         * 
         * 
         */
        public List<PTAs> getPublicTagAgents() {
            if (publicTagAgents == null) {
                publicTagAgents = new ArrayList<PTAs>();
            }
            return this.publicTagAgents;
        }

        /**
         * Gets the value of the errors property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorsListType }
         *     
         */
        public ErrorsListType getErrors() {
            return errors;
        }

        /**
         * Sets the value of the errors property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorsListType }
         *     
         */
        public void setErrors(ErrorsListType value) {
            this.errors = value;
        }

    }

}
