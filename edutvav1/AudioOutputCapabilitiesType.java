//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.19 at 06:14:38 PM COT 
//


package co.com.edutva.edutvav1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioOutputCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioOutputCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tva:mpeg21:2012}AudioOutputCapabilityBaseType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{urn:tva:mpeg21:2012}AudioModeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lowFrequency" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="highFrequency" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="signalNoiseRatio" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="power" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="numChannels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioOutputCapabilitiesType", propOrder = {
    "mode"
})
public class AudioOutputCapabilitiesType
    extends AudioOutputCapabilityBaseType
{

    @XmlElement(name = "Mode")
    protected List<AudioModeType> mode;
    @XmlAttribute(name = "lowFrequency")
    protected Float lowFrequency;
    @XmlAttribute(name = "highFrequency")
    protected Float highFrequency;
    @XmlAttribute(name = "signalNoiseRatio")
    protected Float signalNoiseRatio;
    @XmlAttribute(name = "power")
    protected Float power;
    @XmlAttribute(name = "numChannels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numChannels;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioModeType }
     * 
     * 
     */
    public List<AudioModeType> getMode() {
        if (mode == null) {
            mode = new ArrayList<AudioModeType>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the lowFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLowFrequency() {
        return lowFrequency;
    }

    /**
     * Sets the value of the lowFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLowFrequency(Float value) {
        this.lowFrequency = value;
    }

    /**
     * Gets the value of the highFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHighFrequency() {
        return highFrequency;
    }

    /**
     * Sets the value of the highFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHighFrequency(Float value) {
        this.highFrequency = value;
    }

    /**
     * Gets the value of the signalNoiseRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSignalNoiseRatio() {
        return signalNoiseRatio;
    }

    /**
     * Sets the value of the signalNoiseRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSignalNoiseRatio(Float value) {
        this.signalNoiseRatio = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPower(Float value) {
        this.power = value;
    }

    /**
     * Gets the value of the numChannels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumChannels() {
        return numChannels;
    }

    /**
     * Sets the value of the numChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumChannels(BigInteger value) {
        this.numChannels = value;
    }

}
