
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
 *         <element name="KeywordHistoricalPerformances" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordHistoricalPerformance" minOccurs="0"/>
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
    "keywordHistoricalPerformances"
})
@XmlRootElement(name = "GetHistoricalKeywordPerformanceResponse")
public class GetHistoricalKeywordPerformanceResponse {

    @XmlElement(name = "KeywordHistoricalPerformances", nillable = true)
    protected ArrayOfKeywordHistoricalPerformance keywordHistoricalPerformances;

    /**
     * Gets the value of the keywordHistoricalPerformances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordHistoricalPerformance }
     *     
     */
    public ArrayOfKeywordHistoricalPerformance getKeywordHistoricalPerformances() {
        return keywordHistoricalPerformances;
    }

    /**
     * Sets the value of the keywordHistoricalPerformances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordHistoricalPerformance }
     *     
     */
    public void setKeywordHistoricalPerformances(ArrayOfKeywordHistoricalPerformance value) {
        this.keywordHistoricalPerformances = value;
    }

}
