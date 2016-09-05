package com.training.domains;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Invoice {

    private long invoiceNumber;
    private Customer cust;
    private double amount;
    private List<Item> itemList;

    public Invoice() {
        super();
    }

    public Invoice(long invoiceNumber, Customer cust, double amount, List<Item> itemList) {
        super();
        this.invoiceNumber = invoiceNumber;
        this.cust = cust;
        this.amount = amount;
        this.itemList = itemList;
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @PostConstruct
    public void init() {
        System.out.println("Resources Created");

    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Resources Closed");
    }

    @Override
    public String toString() {
        return "Invoice [invoiceNumber=" + invoiceNumber + ", cust=" + cust + ", amount=" + amount + ", itemList="
                + itemList + "]";
    }

}
