package com.training.yolo;

import java.sql.Connection;

public class MyDaoImpl {
    
    Connection con;

    public MyDaoImpl(Connection con) {
        super();
        if (con == null) {
            
            throw new NullPointerException("Connection Object seems to be null");
            
        } else {
            this.con = con;
        }
    }

}
