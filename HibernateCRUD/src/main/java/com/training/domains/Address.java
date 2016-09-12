package com.training.domains;

public class Address {

    private String street;
    private String city;
    private String pinCode;

    public Address() {
        super();
    }

    public Address(String street, String city, String pinCode) {
        super();
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
    }

}
