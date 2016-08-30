package com.training.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.training.domains.TaxiUser;

public class MyDAO {

    private Connection con;

    public MyDAO() {
        super();
        con = MySQLConnection.getMyOracleConnection();
    }

    public int add(TaxiUser object) {

        int rowAdded = 0;

        try {
            String sql = "insert into taxiuser values(?,?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, object.getName());
            pstmt.setString(2, object.getEmail());
            pstmt.setString(3, object.getPassword());
            pstmt.setInt(4, object.getTelephone());
            pstmt.setString(5, object.getCity());

            rowAdded = pstmt.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
        }

        return rowAdded;
    }

    public int update(String name) {
        // TODO Auto-generated method stub
        return 0;
    }

    public TaxiUser find(String email) {

        TaxiUser t = new TaxiUser();
        PreparedStatement pstmt;
        ResultSet rs = null;
        try {
            String sql = "select * from taxiuser where email=?";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);

            rs = pstmt.executeQuery();

            if (rs.next() == true) {

                String os1 = rs.getString("name");
                String os2 = rs.getString("email");
                String os3 = rs.getString("password");
                int os4 = rs.getInt("telephone");
                String os5 = rs.getString("city");

                t = new TaxiUser(os1, os2, os3, os4, os5);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // try {
        // System.out.println(rs.next());
        // } catch (SQLException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        return t;
    }

    public int delete(String name) {

        int rowDeleted = 0;

        try {
            String sql = "DELETE FROM taxiuser WHERE name = '" + name + "'";

            System.out.println(sql);

            PreparedStatement pstmt = con.prepareStatement(sql);

            rowDeleted = pstmt.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
        }

        return rowDeleted;
    }

    public ArrayList<TaxiUser> findAll() throws SQLException {
        // TODO Auto-generated method stub

        ArrayList<TaxiUser> alist = new ArrayList<TaxiUser>();

        Statement pstmt = con.createStatement();

        ResultSet rs = pstmt.executeQuery("select * from taxiuser");

        while (rs.next()) {

            String os1 = rs.getString("name");
            String os2 = rs.getString("email");
            String os3 = rs.getString("password");
            int os4 = rs.getInt("telephone");
            String os5 = rs.getString("city");

            TaxiUser t = new TaxiUser(os1, os2, os3, os4, os5);
            alist.add(t);
        }

        return alist;
    }

}
