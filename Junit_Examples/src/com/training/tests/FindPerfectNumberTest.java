package com.training.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.training.yolo.FindPerfectNumber;

public class FindPerfectNumberTest {
    
    @Test
    public void testForPerfectNumber() {
        
        FindPerfectNumber hi = new FindPerfectNumber();
        
        boolean actual = hi.checkPerfectNumber(28);
        
        assertTrue(actual);
        
    }

    @Test
    public void testForNonPerfectNumber() {
        
        FindPerfectNumber hi = new FindPerfectNumber();
        
        boolean actual = hi.checkPerfectNumber(9999);
        
        assertFalse(actual);
        
    }

    
}
