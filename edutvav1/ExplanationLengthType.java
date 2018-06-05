//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.19 at 06:14:38 PM COT 
//


package co.com.edutva.edutvav1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExplanationLengthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExplanationLengthType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="long"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExplanationLengthType", namespace = "urn:tva:metadata:2012")
@XmlEnum
public enum ExplanationLengthType {

    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("long")
    LONG("long");
    private final String value;

    ExplanationLengthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExplanationLengthType fromValue(String v) {
        for (ExplanationLengthType c: ExplanationLengthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
