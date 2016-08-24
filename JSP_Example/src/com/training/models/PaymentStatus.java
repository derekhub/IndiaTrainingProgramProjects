package com.training.models;

import java.sql.Timestamp;
import java.util.Date;

public class PaymentStatus {

    private long transactionId;
    private Timestamp transactionDate;
    private String description;
    private double amount;

    public PaymentStatus() {
        super();
    }

    public PaymentStatus(long transactionId, Timestamp transactionDate, String description, double amount) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.description = description;
        this.amount = amount;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "" + transactionId + ": " + transactionDate + ": " + description + ": " + amount;
    }

}
