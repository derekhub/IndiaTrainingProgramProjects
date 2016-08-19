package com.training.domains;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){
		
		CreditCard card1 = new CreditCard(100200, "Ramesh", 75000, 12000);
		
		double minAmountDue = card1.calculateAmount();
		
		System.out.println("Total Purchase := " + card1.getAmountSpent());
		System.out.println("Minimum Amount Due := " + minAmountDue);
		
		CreditCard card2 = new CreditCard(2000);
		
		double minAmountDue2 = card2.calculateAmount();
		System.out.println("Card Number := " + card2.getCardNumber());
		System.out.println("Card Holder Name := " + card2.getCardHolderName());
		System.out.println("Amount Spent := " + card2.getAmountSpent());
		System.out.println("Minimum Amount Due := " + minAmountDue2);
		
		
		/**
		 * Using Scanner Class Take Input while useing while loop to terminate the
		 * input for amount spend less than 5000 min amount due 5%
		 * for amount more than 5000 min due 7%
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to check your min amount due? [Y/N]");
		
		while(sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {
			System.out.println("Enter card number : ");
			long cardNum = Long.parseLong(sc.nextLine());
			
			System.out.println("Enter card Name :");
			String cardName = sc.nextLine();
			
			System.out.println("Enter amount Spent :");
			double amountSpent = Double.parseDouble(sc.nextLine());
			
			CreditCard demoCard = new CreditCard(cardNum, cardName, 7500, amountSpent);
			
			System.out.println("This is the minimum amount due := " + demoCard.calculateAmount());
			
			System.out.println("Do you want to try another card? [Y/N]");
			
		}
		
		System.out.println("Goodbye");
		
		
		
		
		
	}
	

}
