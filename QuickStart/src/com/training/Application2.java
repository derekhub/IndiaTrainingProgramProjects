package com.training;

import java.util.Scanner;

import com.training.domains.CreditCard;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard card = new CreditCard(101,"Ramesh", 50000);
		
		System.out.println(card);
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to check your Savings Account? [Y/N]");
		
		while(sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {
			System.out.println("Enter card number : ");
			int cardNum = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter card Name :");
			String cardName = sc.nextLine();
			
			System.out.println("Enter your balance :");
			double balance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter a nomiee name:");
			String nomieeName = sc.nextLine();
			
			SavingAccount demoBank = new SavingAccount(cardNum, cardName, balance, nomieeName);
			
			System.out.println("This is your bank information:" + demoBank);
			
			System.out.println("Would you like to withdraw or deposit? [W/D] or type quit to quit");
			
			if (sc.nextLine().equalsIgnoreCase("quit")){
				break;
			} else if (sc.nextLine().equalsIgnoreCase("w")){
				
				System.out.println("Please enter the amount you would like to withdraw: ");
				double amount = Double.parseDouble(sc.nextLine());
				
				System.out.println("Remaining balance: " + demoBank.withdraw(amount));
				
			} else if (sc.nextLine().equalsIgnoreCase("d")){
				
				System.out.println("Please enter the amount you would like to deposit: ");
				double amount = Double.parseDouble(sc.nextLine());
				
				System.out.println("New balance: " + demoBank.deposit(amount));
				
			}
			
			System.out.println("Do you want to try another card? [Y/N]");
			
		}
		
		System.out.println("Goodbye");

	}

}
