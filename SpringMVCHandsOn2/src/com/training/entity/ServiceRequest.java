package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class ServiceRequest {

    private int requestId;
    private String requestType;
    private String description;
    private int customerId;

    public ServiceRequest() {
        super();
    }

    public ServiceRequest(int requestId, String requestType, String description, int customerId) {
        super();
        this.requestId = requestId;
        this.requestType = requestType;
        this.description = description;
        this.customerId = customerId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "ServiceRequest [requestId=" + requestId + ", requestType=" + requestType + ", description="
                + description + ", customerId=" + customerId + "]";
    }

}
