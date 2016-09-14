package com.training.domains;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String cityName;
    private long pinCode;

    public Address() {
        super();
    }

    public Address(String addressLine1, String addressLine2, String cityName, long pinCode) {
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.cityName = cityName;
        this.pinCode = pinCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", cityName=" + cityName
                + ", pinCode=" + pinCode + "]";
    }

}
