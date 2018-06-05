//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.19 at 06:14:38 PM COT 
//


package co.com.edutva.edutvav1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrowsingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowsingPreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tva:mpeg7:2008}DSType">
 *       &lt;sequence>
 *         &lt;element name="SummaryPreferences" type="{urn:tva:mpeg7:2008}SummaryPreferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreferenceCondition" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:tva:mpeg7:2008}PreferenceConditionType">
 *                 &lt;sequence>
 *                   &lt;element name="Genre" type="{urn:tva:mpeg7:2008}TermUseType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="protected" type="{urn:tva:mpeg7:2008}userChoiceType" default="true" />
 *       &lt;attribute name="preferenceValue" type="{urn:tva:mpeg7:2008}preferenceValueType" default="10" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowsingPreferencesType", namespace = "urn:tva:mpeg7:2008", propOrder = {
    "summaryPreferences",
    "preferenceCondition"
})
public class BrowsingPreferencesType
    extends DSType
{

    @XmlElement(name = "SummaryPreferences")
    protected List<SummaryPreferencesType> summaryPreferences;
    @XmlElement(name = "PreferenceCondition")
    protected List<BrowsingPreferencesType.PreferenceCondition> preferenceCondition;
    @XmlAttribute(name = "protected")
    protected UserChoiceType _protected;
    @XmlAttribute(name = "preferenceValue")
    protected Integer preferenceValue;

    /**
     * Gets the value of the summaryPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryPreferencesType }
     * 
     * 
     */
    public List<SummaryPreferencesType> getSummaryPreferences() {
        if (summaryPreferences == null) {
            summaryPreferences = new ArrayList<SummaryPreferencesType>();
        }
        return this.summaryPreferences;
    }

    /**
     * Gets the value of the preferenceCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowsingPreferencesType.PreferenceCondition }
     * 
     * 
     */
    public List<BrowsingPreferencesType.PreferenceCondition> getPreferenceCondition() {
        if (preferenceCondition == null) {
            preferenceCondition = new ArrayList<BrowsingPreferencesType.PreferenceCondition>();
        }
        return this.preferenceCondition;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link UserChoiceType }
     *     
     */
    public UserChoiceType getProtected() {
        if (_protected == null) {
            return UserChoiceType.TRUE;
        } else {
            return _protected;
        }
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserChoiceType }
     *     
     */
    public void setProtected(UserChoiceType value) {
        this._protected = value;
    }

    /**
     * Gets the value of the preferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPreferenceValue() {
        if (preferenceValue == null) {
            return  10;
        } else {
            return preferenceValue;
        }
    }

    /**
     * Sets the value of the preferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreferenceValue(Integer value) {
        this.preferenceValue = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:tva:mpeg7:2008}PreferenceConditionType">
     *       &lt;sequence>
     *         &lt;element name="Genre" type="{urn:tva:mpeg7:2008}TermUseType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "genre"
    })
    public static class PreferenceCondition
        extends PreferenceConditionType
    {

        @XmlElement(name = "Genre", namespace = "urn:tva:mpeg7:2008")
        protected TermUseType genre;

        /**
         * Gets the value of the genre property.
         * 
         * @return
         *     possible object is
         *     {@link TermUseType }
         *     
         */
        public TermUseType getGenre() {
            return genre;
        }

        /**
         * Sets the value of the genre property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermUseType }
         *     
         */
        public void setGenre(TermUseType value) {
            this.genre = value;
        }

    }

}
