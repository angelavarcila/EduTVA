//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.19 at 06:14:38 PM COT 
//


package co.com.edutva.edutvav1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPUBenchmarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPUBenchmarkType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tva:mpeg21:2012}DeviceBenchmarkBaseType">
 *       &lt;attribute name="name" use="required" type="{urn:tva:mpeg7:2008}termReferenceType" />
 *       &lt;attribute name="baseValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPUBenchmarkType")
public class CPUBenchmarkType
    extends DeviceBenchmarkBaseType
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "baseValue", required = true)
    protected float baseValue;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the baseValue property.
     * 
     */
    public float getBaseValue() {
        return baseValue;
    }

    /**
     * Sets the value of the baseValue property.
     * 
     */
    public void setBaseValue(float value) {
        this.baseValue = value;
    }

}