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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.dt.rts.ladmv.services.inquiries.coreelements.DealComments;
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
 *         &lt;element name="AuthHeader"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Inquiry"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BatchNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="PrivacyActCompliance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="Vehicle" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}VehicleType" minOccurs="0"/&gt;
 *                   &lt;element name="Owners" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}OwnersType" minOccurs="0"/&gt;
 *                   &lt;element name="Registration" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}RegistrationType" minOccurs="0"/&gt;
 *                   &lt;element name="Title" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}TitleType" minOccurs="0"/&gt;
 *                   &lt;element name="LienHolder" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}LienHolderType" minOccurs="0"/&gt;
 *                   &lt;element name="Sales" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}SalesType" minOccurs="0"/&gt;
 *                   &lt;element name="Comments" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}DealComments" minOccurs="0"/&gt;
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
    "authHeader",
    "inquiry"
})
@XmlRootElement(name = "VehicleInquiryResponse")
public class VehicleInquiryResponse {

    @XmlElement(name = "AuthHeader", required = true)
    protected VehicleInquiryResponse.AuthHeader authHeader;
    @XmlElement(name = "Inquiry", required = true)
    protected VehicleInquiryResponse.Inquiry inquiry;

    /**
     * Gets the value of the authHeader property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInquiryResponse.AuthHeader }
     *     
     */
    public VehicleInquiryResponse.AuthHeader getAuthHeader() {
        return authHeader;
    }

    /**
     * Sets the value of the authHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInquiryResponse.AuthHeader }
     *     
     */
    public void setAuthHeader(VehicleInquiryResponse.AuthHeader value) {
        this.authHeader = value;
    }

    /**
     * Gets the value of the inquiry property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInquiryResponse.Inquiry }
     *     
     */
    public VehicleInquiryResponse.Inquiry getInquiry() {
        return inquiry;
    }

    /**
     * Sets the value of the inquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInquiryResponse.Inquiry }
     *     
     */
    public void setInquiry(VehicleInquiryResponse.Inquiry value) {
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
     *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "officeCode",
        "operatorCode"
    })
    public static class AuthHeader {

        @XmlElement(name = "OfficeCode", required = true)
        protected String officeCode;
        @XmlElement(name = "OperatorCode", nillable = true)
        protected String operatorCode;

        /**
         * Gets the value of the officeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficeCode() {
            return officeCode;
        }

        /**
         * Sets the value of the officeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficeCode(String value) {
            this.officeCode = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorCode(String value) {
            this.operatorCode = value;
        }

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
     *         &lt;element name="BatchNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="PrivacyActCompliance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="Vehicle" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}VehicleType" minOccurs="0"/&gt;
     *         &lt;element name="Owners" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}OwnersType" minOccurs="0"/&gt;
     *         &lt;element name="Registration" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}RegistrationType" minOccurs="0"/&gt;
     *         &lt;element name="Title" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}TitleType" minOccurs="0"/&gt;
     *         &lt;element name="LienHolder" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}LienHolderType" minOccurs="0"/&gt;
     *         &lt;element name="Sales" type="{http://rts.dt.com/ladmv/services/inquiries/VehicleInquiry}SalesType" minOccurs="0"/&gt;
     *         &lt;element name="Comments" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}DealComments" minOccurs="0"/&gt;
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
        "batchNum",
        "sequenceNumber",
        "privacyActCompliance",
        "vehicle",
        "owners",
        "registration",
        "title",
        "lienHolder",
        "sales",
        "comments",
        "errors"
    })
    public static class Inquiry {

        @XmlElement(name = "BatchNum", nillable = true)
        protected Long batchNum;
        @XmlElement(name = "SequenceNumber", nillable = true)
        protected Long sequenceNumber;
        @XmlElement(name = "PrivacyActCompliance", nillable = true)
        protected Integer privacyActCompliance;
        @XmlElement(name = "Vehicle", nillable = true)
        protected VehicleType vehicle;
        @XmlElement(name = "Owners", nillable = true)
        protected OwnersType owners;
        @XmlElement(name = "Registration", nillable = true)
        protected RegistrationType registration;
        @XmlElement(name = "Title", nillable = true)
        protected TitleType title;
        @XmlElement(name = "LienHolder", nillable = true)
        protected LienHolderType lienHolder;
        @XmlElement(name = "Sales", nillable = true)
        protected SalesType sales;
        @XmlElement(name = "Comments")
        protected DealComments comments;
        @XmlElement(name = "Errors")
        protected ErrorsListType errors;

        /**
         * Gets the value of the batchNum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBatchNum() {
            return batchNum;
        }

        /**
         * Sets the value of the batchNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBatchNum(Long value) {
            this.batchNum = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSequenceNumber(Long value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the privacyActCompliance property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPrivacyActCompliance() {
            return privacyActCompliance;
        }

        /**
         * Sets the value of the privacyActCompliance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPrivacyActCompliance(Integer value) {
            this.privacyActCompliance = value;
        }

        /**
         * Gets the value of the vehicle property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleType }
         *     
         */
        public VehicleType getVehicle() {
            return vehicle;
        }

        /**
         * Sets the value of the vehicle property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleType }
         *     
         */
        public void setVehicle(VehicleType value) {
            this.vehicle = value;
        }

        /**
         * Gets the value of the owners property.
         * 
         * @return
         *     possible object is
         *     {@link OwnersType }
         *     
         */
        public OwnersType getOwners() {
            return owners;
        }

        /**
         * Sets the value of the owners property.
         * 
         * @param value
         *     allowed object is
         *     {@link OwnersType }
         *     
         */
        public void setOwners(OwnersType value) {
            this.owners = value;
        }

        /**
         * Gets the value of the registration property.
         * 
         * @return
         *     possible object is
         *     {@link RegistrationType }
         *     
         */
        public RegistrationType getRegistration() {
            return registration;
        }

        /**
         * Sets the value of the registration property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegistrationType }
         *     
         */
        public void setRegistration(RegistrationType value) {
            this.registration = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link TitleType }
         *     
         */
        public TitleType getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link TitleType }
         *     
         */
        public void setTitle(TitleType value) {
            this.title = value;
        }

        /**
         * Gets the value of the lienHolder property.
         * 
         * @return
         *     possible object is
         *     {@link LienHolderType }
         *     
         */
        public LienHolderType getLienHolder() {
            return lienHolder;
        }

        /**
         * Sets the value of the lienHolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link LienHolderType }
         *     
         */
        public void setLienHolder(LienHolderType value) {
            this.lienHolder = value;
        }

        /**
         * Gets the value of the sales property.
         * 
         * @return
         *     possible object is
         *     {@link SalesType }
         *     
         */
        public SalesType getSales() {
            return sales;
        }

        /**
         * Sets the value of the sales property.
         * 
         * @param value
         *     allowed object is
         *     {@link SalesType }
         *     
         */
        public void setSales(SalesType value) {
            this.sales = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link DealComments }
         *     
         */
        public DealComments getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link DealComments }
         *     
         */
        public void setComments(DealComments value) {
            this.comments = value;
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
