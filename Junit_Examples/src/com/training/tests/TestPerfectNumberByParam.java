package com.training.tests;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.yolo.FindPerfectNumber;

@RunWith(Parameterized.class)
public class TestPerfectNumberByParam {
    
    private int numbers;
    
    public TestPerfectNumberByParam(int numbers){
        super();
        this.numbers = numbers;
        
    }
    
    @Test
    public void testPerfectByParam(){
        
        FindPerfectNumber obj = new FindPerfectNumber();
        
        boolean actual = obj.checkPerfectNumber(numbers);
        assertTrue(numbers+"is not Perfect Number", actual);
    }
        
    @Parameters
    public static Collection<Object> data() {
        Object[] data = new Object[] {6, 28, 33, 44, 496};
        return Arrays.asList(data);
    }
    
}
