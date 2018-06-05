//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.19 at 06:14:38 PM COT 
//


package co.com.edutva.edutvav1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicSetOfRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicSetOfRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlayRightFlag" type="{urn:tva:rmpi:2012}GrantedNotGrantedType"/>
 *         &lt;element name="AnalogueExportRight" type="{urn:tva:rmpi:2012}AnalogueExportRightType"/>
 *         &lt;element name="DigitalExportSDRight" type="{urn:tva:rmpi:2012}DigitalExportRightType"/>
 *         &lt;element name="DigitalExportHDRight" type="{urn:tva:rmpi:2012}DigitalExportRightType"/>
 *         &lt;element name="SecurityLevel" type="{urn:tva:rmpi:2012}SecurityLevelType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="BufferDuration" type="{urn:tva:rmpi:2012}BufferDurationType"/>
 *           &lt;element name="TimeWindow" type="{urn:tva:rmpi:2012}TimeWindowType"/>
 *         &lt;/choice>
 *         &lt;element name="GeographicalControl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSetOfRightsType", namespace = "urn:tva:rmpi:2012", propOrder = {
    "playRightFlag",
    "analogueExportRight",
    "digitalExportSDRight",
    "digitalExportHDRight",
    "securityLevel",
    "bufferDuration",
    "timeWindow",
    "geographicalControl"
})
@XmlSeeAlso({
    ReceivingDomainRightsType.class,
    AnyDomainRightsType.class
})
public abstract class BasicSetOfRightsType {

    @XmlElement(name = "PlayRightFlag", required = true)
    protected GrantedNotGrantedType playRightFlag;
    @XmlElement(name = "AnalogueExportRight", required = true)
    protected AnalogueExportRightType analogueExportRight;
    @XmlElement(name = "DigitalExportSDRight", required = true)
    protected DigitalExportRightType digitalExportSDRight;
    @XmlElement(name = "DigitalExportHDRight", required = true)
    protected DigitalExportRightType digitalExportHDRight;
    @XmlElement(name = "SecurityLevel", required = true)
    protected SecurityLevelType securityLevel;
    @XmlElement(name = "BufferDuration")
    protected BufferDurationType bufferDuration;
    @XmlElement(name = "TimeWindow")
    protected TimeWindowType timeWindow;
    @XmlElement(name = "GeographicalControl", required = true)
    protected String geographicalControl;

    /**
     * Gets the value of the playRightFlag property.
     * 
     * @return
     *     possible object is
     *     {@link GrantedNotGrantedType }
     *     
     */
    public GrantedNotGrantedType getPlayRightFlag() {
        return playRightFlag;
    }

    /**
     * Sets the value of the playRightFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantedNotGrantedType }
     *     
     */
    public void setPlayRightFlag(GrantedNotGrantedType value) {
        this.playRightFlag = value;
    }

    /**
     * Gets the value of the analogueExportRight property.
     * 
     * @return
     *     possible object is
     *     {@link AnalogueExportRightType }
     *     
     */
    public AnalogueExportRightType getAnalogueExportRight() {
        return analogueExportRight;
    }

    /**
     * Sets the value of the analogueExportRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalogueExportRightType }
     *     
     */
    public void setAnalogueExportRight(AnalogueExportRightType value) {
        this.analogueExportRight = value;
    }

    /**
     * Gets the value of the digitalExportSDRight property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalExportRightType }
     *     
     */
    public DigitalExportRightType getDigitalExportSDRight() {
        return digitalExportSDRight;
    }

    /**
     * Sets the value of the digitalExportSDRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalExportRightType }
     *     
     */
    public void setDigitalExportSDRight(DigitalExportRightType value) {
        this.digitalExportSDRight = value;
    }

    /**
     * Gets the value of the digitalExportHDRight property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalExportRightType }
     *     
     */
    public DigitalExportRightType getDigitalExportHDRight() {
        return digitalExportHDRight;
    }

    /**
     * Sets the value of the digitalExportHDRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalExportRightType }
     *     
     */
    public void setDigitalExportHDRight(DigitalExportRightType value) {
        this.digitalExportHDRight = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLevelType }
     *     
     */
    public SecurityLevelType getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLevelType }
     *     
     */
    public void setSecurityLevel(SecurityLevelType value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the bufferDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BufferDurationType }
     *     
     */
    public BufferDurationType getBufferDuration() {
        return bufferDuration;
    }

    /**
     * Sets the value of the bufferDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferDurationType }
     *     
     */
    public void setBufferDuration(BufferDurationType value) {
        this.bufferDuration = value;
    }

    /**
     * Gets the value of the timeWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TimeWindowType }
     *     
     */
    public TimeWindowType getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeWindowType }
     *     
     */
    public void setTimeWindow(TimeWindowType value) {
        this.timeWindow = value;
    }

    /**
     * Gets the value of the geographicalControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicalControl() {
        return geographicalControl;
    }

    /**
     * Sets the value of the geographicalControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicalControl(String value) {
        this.geographicalControl = value;
    }

}
