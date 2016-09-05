package com.training.entity;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

    private long customerNumber;
    private String customerName;
    private String email;
    private long phoneNUmber;

    public Customer() {
        super();
    }

    public Customer(long customerNumber, String customerName, String email, long phoneNUmber) {
        super();
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
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

    public long getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(long phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", email=" + email
                + ", phoneNUmber=" + phoneNUmber + "]";
    }

}
