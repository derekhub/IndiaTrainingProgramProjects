package com.training.yolo;

public class BankAccount {
    
    int accountNumber;
    String accountHolderName;
    double balance = 0;
    
    public BankAccount (int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void printPassBook(){
        
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
        
    }
    
    public Double deposit(double amountDeposited){
              
        if (amountDeposited < 0){
            return 0.0;
            
        } else {
            this.balance += amountDeposited;
            return this.balance;
        }
        
    }
    
    public double withdraw(double amountWithdrawn) throws InsufficientBalanceException{
        if (amountWithdrawn > this.balance){
            throw new InsufficientBalanceException();
            
        } else {
            this.balance -= amountWithdrawn;
            return this.balance;
        }
               
    }
    
    public class InsufficientBalanceException extends Exception {
        // special exception code goes here
    }

}
