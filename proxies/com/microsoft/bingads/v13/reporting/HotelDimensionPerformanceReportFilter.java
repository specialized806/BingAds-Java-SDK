
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HotelDimensionPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelDimensionPerformanceReportFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v13}AccountStatusReportFilter" minOccurs="0"/>
 *         <element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v13}AdGroupStatusReportFilter" minOccurs="0"/>
 *         <element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v13}CampaignStatusReportFilter" minOccurs="0"/>
 *         <element name="DeviceType" type="{https://bingads.microsoft.com/Reporting/v13}DeviceTypeReportFilter" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDimensionPerformanceReportFilter", propOrder = {
    "accountStatus",
    "adGroupStatus",
    "campaignStatus",
    "deviceType"
})
public class HotelDimensionPerformanceReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "DeviceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Collection<DeviceTypeReportFilter> deviceType;

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AccountStatusReportFilter> getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(Collection<AccountStatusReportFilter> value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the adGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdGroupStatusReportFilter> getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the value of the adGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupStatus(Collection<AdGroupStatusReportFilter> value) {
        this.adGroupStatus = value;
    }

    /**
     * Gets the value of the campaignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignStatusReportFilter> getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the value of the campaignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignStatus(Collection<CampaignStatusReportFilter> value) {
        this.campaignStatus = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeviceTypeReportFilter> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(Collection<DeviceTypeReportFilter> value) {
        this.deviceType = value;
    }

}
