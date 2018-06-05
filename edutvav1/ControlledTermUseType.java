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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlledTermUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledTermUseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tva:mpeg7:2008}InlineTermDefinitionType">
 *       &lt;attribute name="href" use="required" type="{urn:tva:mpeg7:2008}termReferenceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledTermUseType", namespace = "urn:tva:mpeg7:2008")
@XmlSeeAlso({
    co.com.edutva.edutvav1.PersonGroupType.NameTerm.class,
    co.com.edutva.edutvav1.MediaFormatType.VisualCoding.Format.class,
    co.com.edutva.edutvav1.OrganizationType.NameTerm.class,
    co.com.edutva.edutvav1.GenrePrioritiesType.Genre.class,
    co.com.edutva.edutvav1.ModalityPrioritiesType.Modality.class
})
public class ControlledTermUseType
    extends InlineTermDefinitionType
{

    @XmlAttribute(name = "href", required = true)
    protected String href;

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