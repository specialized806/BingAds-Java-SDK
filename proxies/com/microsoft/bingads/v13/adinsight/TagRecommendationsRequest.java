
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecommendationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecommendationsInfo" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfRecommendationInfo" minOccurs="0"/>
 *         <element name="Lable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recommendationType",
    "recommendationsInfo",
    "lable"
})
@XmlRootElement(name = "TagRecommendationsRequest")
public class TagRecommendationsRequest {

    @XmlElement(name = "RecommendationType", nillable = true)
    protected String recommendationType;
    @XmlElement(name = "RecommendationsInfo", nillable = true)
    protected ArrayOfRecommendationInfo recommendationsInfo;
    @XmlElement(name = "Lable", nillable = true)
    protected String lable;

    /**
     * Gets the value of the recommendationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationType() {
        return recommendationType;
    }

    /**
     * Sets the value of the recommendationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationType(String value) {
        this.recommendationType = value;
    }

    /**
     * Gets the value of the recommendationsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecommendationInfo }
     *     
     */
    public ArrayOfRecommendationInfo getRecommendationsInfo() {
        return recommendationsInfo;
    }

    /**
     * Sets the value of the recommendationsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecommendationInfo }
     *     
     */
    public void setRecommendationsInfo(ArrayOfRecommendationInfo value) {
        this.recommendationsInfo = value;
    }

    /**
     * Gets the value of the lable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLable() {
        return lable;
    }

    /**
     * Sets the value of the lable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLable(String value) {
        this.lable = value;
    }

}
