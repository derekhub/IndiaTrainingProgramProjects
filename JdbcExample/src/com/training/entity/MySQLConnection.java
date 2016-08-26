package com.training.entity;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLConnection {

    public static Connection getMyOracleConnection() {
        Connection con = null;

        try {
            Properties props = new Properties();

            // TESTING NEW STUFF
            InputStream inStream = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("DbConnection.properties");

            // THIS WAS FROM BEFORE. TESTING NEW STUFF ABOVE
            // FileInputStream inStream = new FileInputStream(new
            // File("DbConnection.properties"));

            props.load(inStream);

            Class.forName(props.getProperty("db.driverClass"));

            con = DriverManager.getConnection(props.getProperty("db.driverURL"), props.getProperty("db.userName"),
                    props.getProperty("db.passWord"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void main(String[] args) {
        System.out.println(getMyOracleConnection());
    }

}
