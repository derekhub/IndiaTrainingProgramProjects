package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
    private long customerId;
    private String customerName;

    public Customer() {
        super();
    }

    // need autowired annotation here as well as in LifeInsurance class so they
    // 'connect'
    @Autowired
    public Customer(@Value("2020") long customerId, @Value("Ramesh") String customerName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
