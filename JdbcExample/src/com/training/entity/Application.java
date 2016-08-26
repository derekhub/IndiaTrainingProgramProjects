package com.training.entity;

import java.sql.SQLException;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        // System.out.println(MySQLConnection.getMyOracleConnection());

        MyDAO dao = new MyDAO();
        int key = 1;
        switch (key) {
        case 1:
            int rowAdded = dao.add(new Donor(99, "derek", "d.hotmail.com"));
            System.out.println("row added lel: " + rowAdded);

            break;

        case 2:
            int rowDeleted = dao.delete("derek");
            System.out.println("row deleted lel: " + rowDeleted);

            break;

        case 3:
            ArrayList<Donor> findAll = dao.findAll();

            for (Donor d : findAll) {
                System.out.println(d.getName() + " : " + d.getEmail());
            }

        case 4:
            System.out.println(dao.find("derek"));

            break;

        default:
            break;
        }

    }

}
