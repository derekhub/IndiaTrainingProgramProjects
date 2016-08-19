package com.training.tests;

import java.sql.Connection;

import org.junit.Test;

import com.training.yolo.MyDaoImpl;

public class MyDaoTest {

    @Test(expected=java.lang.NullPointerException.class)
    public void testConstructorThrowsException() {
        
        Connection con = null;
        
        MyDaoImpl dao = new MyDaoImpl(con);
        
        
    }
    
}
