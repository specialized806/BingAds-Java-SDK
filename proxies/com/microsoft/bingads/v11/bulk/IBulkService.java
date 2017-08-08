
package com.microsoft.bingads.v11.bulk;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IBulkService", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBulkService {


    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.bulk.DownloadCampaignsByAccountIdsResponse>
     */
    @WebMethod(operationName = "DownloadCampaignsByAccountIds", action = "DownloadCampaignsByAccountIds")
    public Response<DownloadCampaignsByAccountIdsResponse> downloadCampaignsByAccountIdsAsync(
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByAccountIdsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DownloadCampaignsByAccountIds", action = "DownloadCampaignsByAccountIds")
    public Future<?> downloadCampaignsByAccountIdsAsync(
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByAccountIdsRequest parameters,
        @WebParam(name = "DownloadCampaignsByAccountIdsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DownloadCampaignsByAccountIdsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.bulk.DownloadCampaignsByAccountIdsResponse
     * @throws ApiFaultDetail_Exception
     * @throws AdApiFaultDetail_Exception
     */
    @WebMethod(operationName = "DownloadCampaignsByAccountIds", action = "DownloadCampaignsByAccountIds")
    @WebResult(name = "DownloadCampaignsByAccountIdsResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
    public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByAccountIdsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.bulk.DownloadCampaignsByCampaignIdsResponse>
     */
    @WebMethod(operationName = "DownloadCampaignsByCampaignIds", action = "DownloadCampaignsByCampaignIds")
    public Response<DownloadCampaignsByCampaignIdsResponse> downloadCampaignsByCampaignIdsAsync(
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByCampaignIdsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DownloadCampaignsByCampaignIds", action = "DownloadCampaignsByCampaignIds")
    public Future<?> downloadCampaignsByCampaignIdsAsync(
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByCampaignIdsRequest parameters,
        @WebParam(name = "DownloadCampaignsByCampaignIdsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DownloadCampaignsByCampaignIdsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.bulk.DownloadCampaignsByCampaignIdsResponse
     * @throws ApiFaultDetail_Exception
     * @throws AdApiFaultDetail_Exception
     */
    @WebMethod(operationName = "DownloadCampaignsByCampaignIds", action = "DownloadCampaignsByCampaignIds")
    @WebResult(name = "DownloadCampaignsByCampaignIdsResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
    public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        DownloadCampaignsByCampaignIdsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusResponse>
     */
    @WebMethod(operationName = "GetBulkDownloadStatus", action = "GetBulkDownloadStatus")
    public Response<GetBulkDownloadStatusResponse> getBulkDownloadStatusAsync(
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkDownloadStatusRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBulkDownloadStatus", action = "GetBulkDownloadStatus")
    public Future<?> getBulkDownloadStatusAsync(
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkDownloadStatusRequest parameters,
        @WebParam(name = "GetBulkDownloadStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkDownloadStatusResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusResponse
     * @throws ApiFaultDetail_Exception
     * @throws AdApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkDownloadStatus", action = "GetBulkDownloadStatus")
    @WebResult(name = "GetBulkDownloadStatusResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
    public GetBulkDownloadStatusResponse getBulkDownloadStatus(
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkDownloadStatusRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.bulk.GetBulkUploadUrlResponse>
     */
    @WebMethod(operationName = "GetBulkUploadUrl", action = "GetBulkUploadUrl")
    public Response<GetBulkUploadUrlResponse> getBulkUploadUrlAsync(
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadUrlRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBulkUploadUrl", action = "GetBulkUploadUrl")
    public Future<?> getBulkUploadUrlAsync(
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadUrlRequest parameters,
        @WebParam(name = "GetBulkUploadUrlResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkUploadUrlResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.bulk.GetBulkUploadUrlResponse
     * @throws ApiFaultDetail_Exception
     * @throws AdApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkUploadUrl", action = "GetBulkUploadUrl")
    @WebResult(name = "GetBulkUploadUrlResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
    public GetBulkUploadUrlResponse getBulkUploadUrl(
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadUrlRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.bulk.GetBulkUploadStatusResponse>
     */
    @WebMethod(operationName = "GetBulkUploadStatus", action = "GetBulkUploadStatus")
    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadStatusRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBulkUploadStatus", action = "GetBulkUploadStatus")
    public Future<?> getBulkUploadStatusAsync(
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadStatusRequest parameters,
        @WebParam(name = "GetBulkUploadStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkUploadStatusResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.bulk.GetBulkUploadStatusResponse
     * @throws ApiFaultDetail_Exception
     * @throws AdApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkUploadStatus", action = "GetBulkUploadStatus")
    @WebResult(name = "GetBulkUploadStatusResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
    public GetBulkUploadStatusResponse getBulkUploadStatus(
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11", partName = "parameters")
        GetBulkUploadStatusRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

}
