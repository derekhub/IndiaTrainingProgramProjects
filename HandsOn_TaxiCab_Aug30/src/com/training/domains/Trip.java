package com.training.domains;

public class Trip {

    private int tripId;
    private String startLocation;
    private String endLocation;
    private String vehicleName;
    private String customerId;
    private String farePaid;
    private String status;

    public Trip() {
        super();
    }

    public Trip(int tripId, String startLocation, String endLocation, String vehicleName, String customerId,
            String farePaid, String status) {
        super();
        this.tripId = tripId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.vehicleName = vehicleName;
        this.customerId = customerId;
        this.farePaid = farePaid;
        this.status = status;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFarePaid() {
        return farePaid;
    }

    public void setFarePaid(String farePaid) {
        this.farePaid = farePaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
