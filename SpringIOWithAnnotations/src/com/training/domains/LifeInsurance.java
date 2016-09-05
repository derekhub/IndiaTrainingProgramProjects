package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("insuranceBean")
public class LifeInsurance {

    // need autowiredn annotation here as well as in customer class so they
    // 'connect'
    @Autowired
    @Qualifier("cust1")
    private Customer cust;

    @Value("10293934")
    private long policyNumber;
    @Value("500000")
    private double policyAmount;

    public long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double findFirstPremium() {
        double firstPremium = 0.0;
        double premium = (policyAmount * .01);

        if (premium > 1500.00) {
            firstPremium = premium - 500;
        } else {
            firstPremium = premium;
        }
        return firstPremium;
    }

    @PostConstruct
    public void init() {
        System.out.println("Resources Created");

    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Resources Closed");
    }

}
