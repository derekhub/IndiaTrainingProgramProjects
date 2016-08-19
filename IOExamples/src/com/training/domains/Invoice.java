package com.training.domains;

import java.io.Serializable;

public class Invoice implements Serializable{
    
    public Invoice(int i, String string, int j) {
        // TODO Auto-generated constructor stub
        this.invoiceNumber=i;
        this.customerName=string;
        this.amount=j;
        
    }
    private int invoiceNumber;
    private String customerName;
    transient private int amount;
    

}
