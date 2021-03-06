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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlledTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledTermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:tva:metadata:2012}TermNameType" minOccurs="0"/>
 *         &lt;element name="Definition" type="{urn:tva:mpeg7:2008}TextualType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="href" use="required" type="{urn:tva:mpeg7:2008}termReferenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledTermType", namespace = "urn:tva:metadata:2012", propOrder = {
    "name",
    "definition"
})
@XmlSeeAlso({
    VersionedControlledTermType.class,
    HardwareManufacturerType.class,
    CPUType.class,
    GenreType.class
})
public class ControlledTermType {

    @XmlElement(name = "Name")
    protected TermNameType name;
    @XmlElement(name = "Definition")
    protected TextualType definition;
    @XmlAttribute(name = "href", required = true)
    protected String href;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TermNameType }
     *     
     */
    public TermNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermNameType }
     *     
     */
    public void setName(TermNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link TextualType }
     *     
     */
    public TextualType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualType }
     *     
     */
    public void setDefinition(TextualType value) {
        this.definition = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

}
