/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * FBA Inventory Service MWS
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinventory;

import com.amazonaws.mws.fulfillmentinventory.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>FBAInventoryServiceMWSAsyncClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class FBAInventoryServiceMWSAsyncClient extends FBAInventoryServiceMWSClient implements FBAInventoryServiceMWSAsync {

    /**
     * <p>Constructor for FBAInventoryServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinventory.FBAInventoryServiceMWSConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInventoryServiceMWSConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for FBAInventoryServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinventory.FBAInventoryServiceMWSConfig} object.
     */
    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            FBAInventoryServiceMWSConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for FBAInventoryServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.fulfillmentinventory.FBAInventoryServiceMWSConfig} object.
     */
    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            FBAInventoryServiceMWSConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for FBAInventoryServiceMWSAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public FBAInventoryServiceMWSAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInventorySupplyResponse> listInventorySupplyAsync(
        ListInventorySupplyRequest request) {
        return connection.callAsync(
            new RequestType("ListInventorySupply", ListInventorySupplyResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListInventorySupplyByNextTokenResponse> listInventorySupplyByNextTokenAsync(
        ListInventorySupplyByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListInventorySupplyByNextToken", ListInventorySupplyByNextTokenResponse.class, servicePath),
            request);
    }


}
