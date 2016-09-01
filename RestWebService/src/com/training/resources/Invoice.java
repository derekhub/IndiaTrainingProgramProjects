package com.training.resources;

import java.io.Serializable;

public class Invoice implements Serializable {

    private int invoiceNumber;
    private String customerName;
    transient private int amount;

    public Invoice(int i, String string, int j) {
        // TODO Auto-generated constructor stub
        this.invoiceNumber = i;
        this.customerName = string;
        this.amount = j;

    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
