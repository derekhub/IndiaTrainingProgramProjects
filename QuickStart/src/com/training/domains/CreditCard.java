package com.training.domains;

public class CreditCard implements Comparable{
	
	private long cardNumber;
	private String cardHolderName;
	private double creditLimit;
	private double amountSpent;
	
	public CreditCard(){
		super();
	}
	
	public CreditCard(long cardNumber){
		this(cardNumber, "Guest", 7500, 7500);		
	}
	
	public CreditCard(long cardNumber, String cardHolderName, double creditLimit){
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
	}
	
	//Overloaded constructor
	public CreditCard(long cardNumber, String cardHolderName, double creditLimit, double amountSpent){
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		this.amountSpent = amountSpent;
	}
	
	
	public double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}
	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	public double calculateAmount(){
		double billAmount = 0.0;
		
		if (amountSpent < 5000){
			billAmount = amountSpent * .05;
		}else{
			billAmount = amountSpent * .07;
		}
				
		return billAmount;
	}
	
	@Override
	public String toString(){
		return this.cardNumber + "." + this.cardHolderName + "." + this.creditLimit;
	}

    @Override
    public int compareTo(Object o) {
//        if (this.cardNumber > o.cardnumber) return -1;
        return 0;
    }
	
	
}
