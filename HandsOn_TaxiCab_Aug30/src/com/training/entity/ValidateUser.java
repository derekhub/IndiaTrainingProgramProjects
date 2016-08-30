package com.training.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.training.domains.TaxiUser;

public class ValidateUser {

    private Connection con;

    public ValidateUser() {
        super();
        con = MySQLConnection.getMyOracleConnection();
    }

    public boolean validate(TaxiUser user) throws SQLException {

        MyDAO dao = new MyDAO();

        ArrayList<TaxiUser> taxiUsers = dao.findAll();

        for (TaxiUser t : taxiUsers) {
            if (t.getEmail().equals(user.getEmail()) && t.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }
}
