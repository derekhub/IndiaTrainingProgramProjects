package com.training.entity;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

    private long customerNumber;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Customer() {
        super();
    }

    public Customer(long customerNumber, String customerName, String email, long phoneNumber) {
        super();
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", email=" + email
                + ", phoneNumber=" + phoneNumber + "]";
    }

}
