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
import com.dt.rts.ladmv.services.inquiries.coreelements.FlagListType;
import com.dt.rts.ladmv.services.inquiries.coreelements.Vehicle;


/**
 * <p>Java class for VehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}Vehicle"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNew"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="N"/&gt;
 *               &lt;enumeration value="U"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OdometerReading" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Flags" type="{http://rts.dt.com/ladmv/services/inquiries/CoreElements}FlagListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", propOrder = {
    "isNew",
    "odometerReading",
    "classCode",
    "flags"
})
public class VehicleType
    extends Vehicle
{

    @XmlElement(name = "IsNew", required = true)
    protected String isNew;
    @XmlElement(name = "OdometerReading", required = true)
    protected String odometerReading;
    @XmlElement(name = "ClassCode", nillable = true)
    protected String classCode;
    @XmlElement(name = "Flags", nillable = true)
    protected FlagListType flags;

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNew(String value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometerReading(String value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link FlagListType }
     *     
     */
    public FlagListType getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagListType }
     *     
     */
    public void setFlags(FlagListType value) {
        this.flags = value;
    }

}
