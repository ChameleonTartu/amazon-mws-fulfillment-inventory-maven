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
 * Response Metadata
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonaws.mws.fulfillmentinventory.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import javax.xml.bind.annotation.*;

/**
 * ResponseMetadata complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ResponseMetadata"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ResponseMetadata", propOrder={
    "requestId"
})
@XmlRootElement(name = "ResponseMetadata")
public class ResponseMetadata extends AbstractMwsObject {

    @XmlElement(name="RequestId")
    private String requestId;

    /**
     * Get the value of RequestId.
     *
     * @return The value of RequestId.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Set the value of RequestId.
     *
     * @param requestId
     *            The new value to set.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Check to see if RequestId is set.
     *
     * @return true if RequestId is set.
     */
    public boolean isSetRequestId() {
        return requestId != null;
    }

    /**
     * Set the value of RequestId, return this.
     *
     * @param requestId
     *             The new value to set.
     * @return This instance.
     */
    public ResponseMetadata withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        requestId = r.read("RequestId", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("RequestId", requestId);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "ResponseMetadata",this);
    }

    /**
     * Value constructor.
     *
     * @param requestId a {@link java.lang.String} object.
     */
    public ResponseMetadata(String requestId) {
        this.requestId = requestId;
    }    
    

    /**
     * Default constructor.
     */
    public ResponseMetadata() {
        super();
    }

}
