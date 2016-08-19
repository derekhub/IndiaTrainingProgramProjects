package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.yolo.BankAccount;
import com.training.yolo.BankAccount.InsufficientBalanceException;

public class BankAccountTest {
    

    @Test
    public void testDeposit() {
        
        BankAccount ba = new BankAccount(12345678, "Derek Choi", 0);

        double actual = ba.deposit(100);
        assertEquals(100, actual, 0);

    }
    
    @Test
    public void testWithdraw1() throws InsufficientBalanceException {
        
        BankAccount ba = new BankAccount(12345678, "Derek Choi", 7000);
        
        double actual = ba.withdraw(700);
        assertEquals(6300, actual, 0);
        
    }
    
    @Test
    public void testWithdraw2() throws InsufficientBalanceException {
        
        BankAccount ba = new BankAccount(12345678, "Derek Choi", 7000);
        
        double actual = ba.withdraw(700);
        assertEquals(6300, actual, 0);
        
    }
    
    @Test(expected=InsufficientBalanceException.class)
    public void testThrowsException() throws InsufficientBalanceException {
        
        BankAccount ba = new BankAccount(12345678, "Derek Choi", 7000);
        
        ba.withdraw(900);
        
    }
    
    
//    @Test
//    public void testInstanceOfDeposit() {
//
//        BankAccount ba = new BankAccount(12345678, "Derek Choi", 0);
//        
//        assertThat(double, );
//    }

}
