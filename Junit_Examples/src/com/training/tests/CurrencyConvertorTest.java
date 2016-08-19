
package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.training.yolo.CurrencyConvertor;
import com.training.yolo.PrintMaximum;



public class CurrencyConvertorTest {
    
    CurrencyConvertor conv = new CurrencyConvertor();
    
    @Before
    public void init(){
        conv = new CurrencyConvertor();
    }

    @Test
    public void testUsdToINR() {
        CurrencyConvertor conv = new CurrencyConvertor();
        
        double actual = conv.usdToIRN(100);
        
        assertEquals(6000.00, actual, 0);
        
    }
    @Test
    public void testForNegativeValue() {
        
        CurrencyConvertor conv = new CurrencyConvertor();
        
        double actual = conv.usdToIRN(-100);
        
        assertEquals(6000.00, actual, 0);
        
    }
    
    @Test
    public void testForFunctionWithNegative(){
        
        PrintMaximum pObj = new PrintMaximum();
        
        int[] args = {-1, -2, -3, -4};  
        
        int actual = pObj.findMaximum(args);
        
        assertEquals(0, actual);
        
        
    }
    
    
    

}
