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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for BasicContentDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicContentDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{urn:tva:mpeg7:2008}TitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShortTitle" type="{urn:tva:metadata:2012}ShortTitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Synopsis" type="{urn:tva:metadata:2012}SynopsisType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromotionalInformation" type="{urn:tva:mpeg7:2008}TextualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{urn:tva:metadata:2012}KeywordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Genre" type="{urn:tva:metadata:2012}GenreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentalGuidance" type="{urn:tva:metadata:2012}TVAParentalGuidanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:tva:mpeg7:2008}ExtendedLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CaptionLanguage" type="{urn:tva:metadata:2012}CaptionLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignLanguage" type="{urn:tva:metadata:2012}SignLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditsList" type="{urn:tva:metadata:2012}CreditsListType" minOccurs="0"/>
 *         &lt;element name="AwardsList" type="{urn:tva:metadata:2012}AwardsListType" minOccurs="0"/>
 *         &lt;element name="RelatedMaterial" type="{urn:tva:metadata:2012}RelatedMaterialType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductionDate" type="{urn:tva:metadata:2012}TVATimeType" minOccurs="0"/>
 *         &lt;element name="ProductionLocation" type="{urn:tva:mpeg7:2008}regionCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationCoordinates" type="{urn:tva:metadata:2012}CreationCoordinatesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepictedCoordinates" type="{urn:tva:metadata:2012}DepictedCoordinatesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReleaseInformation" type="{urn:tva:metadata:2012}ReleaseInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicContentDescriptionType", namespace = "urn:tva:metadata:2012", propOrder = {
    "title",
    "shortTitle",
    "synopsis",
    "promotionalInformation",
    "keyword",
    "genre",
    "parentalGuidance",
    "language",
    "captionLanguage",
    "signLanguage",
    "creditsList",
    "awardsList",
    "relatedMaterial",
    "productionDate",
    "productionLocation",
    "creationCoordinates",
    "depictedCoordinates",
    "releaseInformation",
    "duration"
})
@XmlSeeAlso({
    ExtendedContentDescriptionType.class
})
public class BasicContentDescriptionType {

    @XmlElement(name = "Title")
    protected List<TitleType> title;
    @XmlElement(name = "ShortTitle")
    protected List<ShortTitleType> shortTitle;
    @XmlElement(name = "Synopsis")
    protected List<SynopsisType> synopsis;
    @XmlElement(name = "PromotionalInformation")
    protected List<TextualType> promotionalInformation;
    @XmlElement(name = "Keyword")
    protected List<KeywordType> keyword;
    @XmlElement(name = "Genre")
    protected List<GenreType> genre;
    @XmlElement(name = "ParentalGuidance")
    protected List<TVAParentalGuidanceType> parentalGuidance;
    @XmlElement(name = "Language")
    protected List<ExtendedLanguageType> language;
    @XmlElement(name = "CaptionLanguage")
    protected List<CaptionLanguageType> captionLanguage;
    @XmlElement(name = "SignLanguage")
    protected List<SignLanguageType> signLanguage;
    @XmlElement(name = "CreditsList")
    protected CreditsListType creditsList;
    @XmlElement(name = "AwardsList")
    protected AwardsListType awardsList;
    @XmlElement(name = "RelatedMaterial")
    protected List<RelatedMaterialType> relatedMaterial;
    @XmlElement(name = "ProductionDate")
    protected TVATimeType productionDate;
    @XmlElement(name = "ProductionLocation")
    protected List<String> productionLocation;
    @XmlElement(name = "CreationCoordinates")
    protected List<CreationCoordinatesType> creationCoordinates;
    @XmlElement(name = "DepictedCoordinates")
    protected List<DepictedCoordinatesType> depictedCoordinates;
    @XmlElement(name = "ReleaseInformation")
    protected List<ReleaseInformationType> releaseInformation;
    @XmlElement(name = "Duration")
    protected Duration duration;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleType }
     * 
     * 
     */
    public List<TitleType> getTitle() {
        if (title == null) {
            title = new ArrayList<TitleType>();
        }
        return this.title;
    }

    /**
     * Gets the value of the shortTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortTitleType }
     * 
     * 
     */
    public List<ShortTitleType> getShortTitle() {
        if (shortTitle == null) {
            shortTitle = new ArrayList<ShortTitleType>();
        }
        return this.shortTitle;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synopsis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynopsis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynopsisType }
     * 
     * 
     */
    public List<SynopsisType> getSynopsis() {
        if (synopsis == null) {
            synopsis = new ArrayList<SynopsisType>();
        }
        return this.synopsis;
    }

    /**
     * Gets the value of the promotionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualType }
     * 
     * 
     */
    public List<TextualType> getPromotionalInformation() {
        if (promotionalInformation == null) {
            promotionalInformation = new ArrayList<TextualType>();
        }
        return this.promotionalInformation;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordType }
     * 
     * 
     */
    public List<KeywordType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<KeywordType>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the genre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenreType }
     * 
     * 
     */
    public List<GenreType> getGenre() {
        if (genre == null) {
            genre = new ArrayList<GenreType>();
        }
        return this.genre;
    }

    /**
     * Gets the value of the parentalGuidance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentalGuidance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentalGuidance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TVAParentalGuidanceType }
     * 
     * 
     */
    public List<TVAParentalGuidanceType> getParentalGuidance() {
        if (parentalGuidance == null) {
            parentalGuidance = new ArrayList<TVAParentalGuidanceType>();
        }
        return this.parentalGuidance;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedLanguageType }
     * 
     * 
     */
    public List<ExtendedLanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<ExtendedLanguageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the captionLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the captionLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaptionLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaptionLanguageType }
     * 
     * 
     */
    public List<CaptionLanguageType> getCaptionLanguage() {
        if (captionLanguage == null) {
            captionLanguage = new ArrayList<CaptionLanguageType>();
        }
        return this.captionLanguage;
    }

    /**
     * Gets the value of the signLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignLanguageType }
     * 
     * 
     */
    public List<SignLanguageType> getSignLanguage() {
        if (signLanguage == null) {
            signLanguage = new ArrayList<SignLanguageType>();
        }
        return this.signLanguage;
    }

    /**
     * Gets the value of the creditsList property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsListType }
     *     
     */
    public CreditsListType getCreditsList() {
        return creditsList;
    }

    /**
     * Sets the value of the creditsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsListType }
     *     
     */
    public void setCreditsList(CreditsListType value) {
        this.creditsList = value;
    }

    /**
     * Gets the value of the awardsList property.
     * 
     * @return
     *     possible object is
     *     {@link AwardsListType }
     *     
     */
    public AwardsListType getAwardsList() {
        return awardsList;
    }

    /**
     * Sets the value of the awardsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardsListType }
     *     
     */
    public void setAwardsList(AwardsListType value) {
        this.awardsList = value;
    }

    /**
     * Gets the value of the relatedMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedMaterialType }
     * 
     * 
     */
    public List<RelatedMaterialType> getRelatedMaterial() {
        if (relatedMaterial == null) {
            relatedMaterial = new ArrayList<RelatedMaterialType>();
        }
        return this.relatedMaterial;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link TVATimeType }
     *     
     */
    public TVATimeType getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVATimeType }
     *     
     */
    public void setProductionDate(TVATimeType value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the productionLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductionLocation() {
        if (productionLocation == null) {
            productionLocation = new ArrayList<String>();
        }
        return this.productionLocation;
    }

    /**
     * Gets the value of the creationCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creationCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreationCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationCoordinatesType }
     * 
     * 
     */
    public List<CreationCoordinatesType> getCreationCoordinates() {
        if (creationCoordinates == null) {
            creationCoordinates = new ArrayList<CreationCoordinatesType>();
        }
        return this.creationCoordinates;
    }

    /**
     * Gets the value of the depictedCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depictedCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepictedCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepictedCoordinatesType }
     * 
     * 
     */
    public List<DepictedCoordinatesType> getDepictedCoordinates() {
        if (depictedCoordinates == null) {
            depictedCoordinates = new ArrayList<DepictedCoordinatesType>();
        }
        return this.depictedCoordinates;
    }

    /**
     * Gets the value of the releaseInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseInformationType }
     * 
     * 
     */
    public List<ReleaseInformationType> getReleaseInformation() {
        if (releaseInformation == null) {
            releaseInformation = new ArrayList<ReleaseInformationType>();
        }
        return this.releaseInformation;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}