package com.training.entity;

import java.sql.SQLException;
import java.util.ArrayList;

import com.training.domains.TaxiUser;

public class testsql {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        MyDAO dao = new MyDAO();
        int key = 4;
        switch (key) {
        case 1:
            int rowAdded = dao.add(new TaxiUser("eric", "e.hotmail.com", "ericjin", 911, "Korea"));
            System.out.println("row added lel: " + rowAdded);

            break;

        case 2:
            int rowDeleted = dao.delete("eric");
            System.out.println("row deleted lel: " + rowDeleted);

            break;

        case 3:
            ArrayList<TaxiUser> findAll = dao.findAll();

            for (TaxiUser t : findAll) {
                System.out.println(t.getName() + " : " + t.getEmail());
            }

            break;

        case 4:
            System.out.println(dao.find("c@hotmail.com").getName());

            break;

        case 5:
            ValidateUser v = new ValidateUser();

            TaxiUser t = new TaxiUser("Derek", "d@hotmail.com", "pas5word", 905000123, "Hong Kong");

            System.out.println(v.validate(t));

            break;

        default:
            break;
        }

    }

}
