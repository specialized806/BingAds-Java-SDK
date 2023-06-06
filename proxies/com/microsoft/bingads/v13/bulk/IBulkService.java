
package com.microsoft.bingads.v13.bulk;

import java.util.concurrent.Future;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "IBulkService", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBulkService {


    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsResponse>
     */
    @WebMethod(operationName = "DownloadCampaignsByAccountIds", action = "DownloadCampaignsByAccountIds")
    public Response<DownloadCampaignsByAccountIdsResponse> downloadCampaignsByAccountIdsAsync(
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
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
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        DownloadCampaignsByAccountIdsRequest parameters,
        @WebParam(name = "DownloadCampaignsByAccountIdsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DownloadCampaignsByAccountIdsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "DownloadCampaignsByAccountIds", action = "DownloadCampaignsByAccountIds")
    @WebResult(name = "DownloadCampaignsByAccountIdsResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(
        @WebParam(name = "DownloadCampaignsByAccountIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        DownloadCampaignsByAccountIdsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.DownloadCampaignsByCampaignIdsResponse>
     */
    @WebMethod(operationName = "DownloadCampaignsByCampaignIds", action = "DownloadCampaignsByCampaignIds")
    public Response<DownloadCampaignsByCampaignIdsResponse> downloadCampaignsByCampaignIdsAsync(
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
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
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        DownloadCampaignsByCampaignIdsRequest parameters,
        @WebParam(name = "DownloadCampaignsByCampaignIdsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DownloadCampaignsByCampaignIdsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.DownloadCampaignsByCampaignIdsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "DownloadCampaignsByCampaignIds", action = "DownloadCampaignsByCampaignIds")
    @WebResult(name = "DownloadCampaignsByCampaignIdsResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(
        @WebParam(name = "DownloadCampaignsByCampaignIdsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        DownloadCampaignsByCampaignIdsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusResponse>
     */
    @WebMethod(operationName = "GetBulkDownloadStatus", action = "GetBulkDownloadStatus")
    public Response<GetBulkDownloadStatusResponse> getBulkDownloadStatusAsync(
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
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
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkDownloadStatusRequest parameters,
        @WebParam(name = "GetBulkDownloadStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkDownloadStatusResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkDownloadStatus", action = "GetBulkDownloadStatus")
    @WebResult(name = "GetBulkDownloadStatusResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public GetBulkDownloadStatusResponse getBulkDownloadStatus(
        @WebParam(name = "GetBulkDownloadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkDownloadStatusRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.GetBulkUploadUrlResponse>
     */
    @WebMethod(operationName = "GetBulkUploadUrl", action = "GetBulkUploadUrl")
    public Response<GetBulkUploadUrlResponse> getBulkUploadUrlAsync(
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
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
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkUploadUrlRequest parameters,
        @WebParam(name = "GetBulkUploadUrlResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkUploadUrlResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.GetBulkUploadUrlResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkUploadUrl", action = "GetBulkUploadUrl")
    @WebResult(name = "GetBulkUploadUrlResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public GetBulkUploadUrlResponse getBulkUploadUrl(
        @WebParam(name = "GetBulkUploadUrlRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkUploadUrlRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse>
     */
    @WebMethod(operationName = "GetBulkUploadStatus", action = "GetBulkUploadStatus")
    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
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
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkUploadStatusRequest parameters,
        @WebParam(name = "GetBulkUploadStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBulkUploadStatusResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "GetBulkUploadStatus", action = "GetBulkUploadStatus")
    @WebResult(name = "GetBulkUploadStatusResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public GetBulkUploadStatusResponse getBulkUploadStatus(
        @WebParam(name = "GetBulkUploadStatusRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        GetBulkUploadStatusRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.bulk.UploadEntityRecordsResponse>
     */
    @WebMethod(operationName = "UploadEntityRecords", action = "UploadEntityRecords")
    public Response<UploadEntityRecordsResponse> uploadEntityRecordsAsync(
        @WebParam(name = "UploadEntityRecordsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        UploadEntityRecordsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "UploadEntityRecords", action = "UploadEntityRecords")
    public Future<?> uploadEntityRecordsAsync(
        @WebParam(name = "UploadEntityRecordsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        UploadEntityRecordsRequest parameters,
        @WebParam(name = "UploadEntityRecordsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UploadEntityRecordsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.bulk.UploadEntityRecordsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFaultDetail_Exception
     */
    @WebMethod(operationName = "UploadEntityRecords", action = "UploadEntityRecords")
    @WebResult(name = "UploadEntityRecordsResponse", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
    public UploadEntityRecordsResponse uploadEntityRecords(
        @WebParam(name = "UploadEntityRecordsRequest", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", partName = "parameters")
        UploadEntityRecordsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception
    ;

}
