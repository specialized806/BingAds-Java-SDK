
package com.microsoft.bingads.v11.customerbilling;

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
@WebService(name = "ICustomerBillingService", targetNamespace = "https://bingads.microsoft.com/Billing/v11")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICustomerBillingService {


    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse>
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    public Response<GetBillingDocumentsInfoResponse> getBillingDocumentsInfoAsync(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    public Future<?> getBillingDocumentsInfoAsync(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters,
        @WebParam(name = "GetBillingDocumentsInfoResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBillingDocumentsInfoResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsInfoResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     * @throws ApiBatchFault_Exception
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    @WebResult(name = "GetBillingDocumentsInfoResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetBillingDocumentsInfoResponse getBillingDocumentsInfo(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse>
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    public Response<GetBillingDocumentsResponse> getBillingDocumentsAsync(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    public Future<?> getBillingDocumentsAsync(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsRequest parameters,
        @WebParam(name = "GetBillingDocumentsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBillingDocumentsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetBillingDocumentsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     * @throws ApiBatchFault_Exception
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    @WebResult(name = "GetBillingDocumentsResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetBillingDocumentsResponse getBillingDocuments(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetBillingDocumentsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse>
     */
    @WebMethod(operationName = "GetDisplayInvoices", action = "GetDisplayInvoices")
    public Response<GetDisplayInvoicesResponse> getDisplayInvoicesAsync(
        @WebParam(name = "GetDisplayInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetDisplayInvoicesRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetDisplayInvoices", action = "GetDisplayInvoices")
    public Future<?> getDisplayInvoicesAsync(
        @WebParam(name = "GetDisplayInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetDisplayInvoicesRequest parameters,
        @WebParam(name = "GetDisplayInvoicesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetDisplayInvoicesResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetDisplayInvoicesResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     * @throws ApiBatchFault_Exception
     */
    @WebMethod(operationName = "GetDisplayInvoices", action = "GetDisplayInvoices")
    @WebResult(name = "GetDisplayInvoicesResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetDisplayInvoicesResponse getDisplayInvoices(
        @WebParam(name = "GetDisplayInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetDisplayInvoicesRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse>
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    public Response<AddInsertionOrderResponse> addInsertionOrderAsync(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        AddInsertionOrderRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    public Future<?> addInsertionOrderAsync(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        AddInsertionOrderRequest parameters,
        @WebParam(name = "AddInsertionOrderResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddInsertionOrderResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.AddInsertionOrderResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    @WebResult(name = "AddInsertionOrderResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public AddInsertionOrderResponse addInsertionOrder(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        AddInsertionOrderRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse>
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    public Response<UpdateInsertionOrderResponse> updateInsertionOrderAsync(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        UpdateInsertionOrderRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    public Future<?> updateInsertionOrderAsync(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        UpdateInsertionOrderRequest parameters,
        @WebParam(name = "UpdateInsertionOrderResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UpdateInsertionOrderResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.UpdateInsertionOrderResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    @WebResult(name = "UpdateInsertionOrderResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public UpdateInsertionOrderResponse updateInsertionOrder(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        UpdateInsertionOrderRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse>
     */
    @WebMethod(operationName = "GetInsertionOrdersByAccount", action = "GetInsertionOrdersByAccount")
    public Response<GetInsertionOrdersByAccountResponse> getInsertionOrdersByAccountAsync(
        @WebParam(name = "GetInsertionOrdersByAccountRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetInsertionOrdersByAccountRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetInsertionOrdersByAccount", action = "GetInsertionOrdersByAccount")
    public Future<?> getInsertionOrdersByAccountAsync(
        @WebParam(name = "GetInsertionOrdersByAccountRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetInsertionOrdersByAccountRequest parameters,
        @WebParam(name = "GetInsertionOrdersByAccountResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetInsertionOrdersByAccountResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetInsertionOrdersByAccountResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "GetInsertionOrdersByAccount", action = "GetInsertionOrdersByAccount")
    @WebResult(name = "GetInsertionOrdersByAccountResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetInsertionOrdersByAccountResponse getInsertionOrdersByAccount(
        @WebParam(name = "GetInsertionOrdersByAccountRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetInsertionOrdersByAccountRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse>
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    public Response<SearchInsertionOrdersResponse> searchInsertionOrdersAsync(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        SearchInsertionOrdersRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    public Future<?> searchInsertionOrdersAsync(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        SearchInsertionOrdersRequest parameters,
        @WebParam(name = "SearchInsertionOrdersResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SearchInsertionOrdersResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.SearchInsertionOrdersResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    @WebResult(name = "SearchInsertionOrdersResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public SearchInsertionOrdersResponse searchInsertionOrders(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        SearchInsertionOrdersRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse>
     */
    @WebMethod(operationName = "GetKOHIOInvoices", action = "GetKOHIOInvoices")
    public Response<GetKOHIOInvoicesResponse> getKOHIOInvoicesAsync(
        @WebParam(name = "GetKOHIOInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetKOHIOInvoicesRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetKOHIOInvoices", action = "GetKOHIOInvoices")
    public Future<?> getKOHIOInvoicesAsync(
        @WebParam(name = "GetKOHIOInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetKOHIOInvoicesRequest parameters,
        @WebParam(name = "GetKOHIOInvoicesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetKOHIOInvoicesResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetKOHIOInvoicesResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     * @throws ApiBatchFault_Exception
     */
    @WebMethod(operationName = "GetKOHIOInvoices", action = "GetKOHIOInvoices")
    @WebResult(name = "GetKOHIOInvoicesResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetKOHIOInvoicesResponse getKOHIOInvoices(
        @WebParam(name = "GetKOHIOInvoicesRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetKOHIOInvoicesRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse>
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    public Response<GetAccountMonthlySpendResponse> getAccountMonthlySpendAsync(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetAccountMonthlySpendRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    public Future<?> getAccountMonthlySpendAsync(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetAccountMonthlySpendRequest parameters,
        @WebParam(name = "GetAccountMonthlySpendResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetAccountMonthlySpendResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v11.customerbilling.GetAccountMonthlySpendResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    @WebResult(name = "GetAccountMonthlySpendResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
    public GetAccountMonthlySpendResponse getAccountMonthlySpend(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v11", partName = "parameters")
        GetAccountMonthlySpendRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

}
