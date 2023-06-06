
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformanceInsightsMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TemplateId" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageTemplateId" minOccurs="0"/>
 *         <element name="Parameters" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfPerformanceInsightsMessageParameter" minOccurs="0"/>
 *         <element name="IndentationLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceInsightsMessage", propOrder = {
    "templateId",
    "parameters",
    "indentationLevel"
})
public class PerformanceInsightsMessage {

    @XmlElement(name = "TemplateId")
    @XmlSchemaType(name = "string")
    protected PerformanceInsightsMessageTemplateId templateId;
    @XmlElement(name = "Parameters", nillable = true)
    protected ArrayOfPerformanceInsightsMessageParameter parameters;
    @XmlElement(name = "IndentationLevel")
    protected Integer indentationLevel;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceInsightsMessageTemplateId }
     *     
     */
    public PerformanceInsightsMessageTemplateId getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceInsightsMessageTemplateId }
     *     
     */
    public void setTemplateId(PerformanceInsightsMessageTemplateId value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerformanceInsightsMessageParameter }
     *     
     */
    public ArrayOfPerformanceInsightsMessageParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerformanceInsightsMessageParameter }
     *     
     */
    public void setParameters(ArrayOfPerformanceInsightsMessageParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the indentationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndentationLevel() {
        return indentationLevel;
    }

    /**
     * Sets the value of the indentationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndentationLevel(Integer value) {
        this.indentationLevel = value;
    }

}
