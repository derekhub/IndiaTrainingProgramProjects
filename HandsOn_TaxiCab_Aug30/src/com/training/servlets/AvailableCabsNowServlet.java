package com.training.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.Trip;
import com.training.entity.MyDAO;
import com.training.entity.MySQLConnection;

/**
 * Servlet implementation class AvailableCabsNowServlet
 */
public class AvailableCabsNowServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvailableCabsNowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        // HttpSession session = request.getSession();
        // TaxiUser tempUser = (TaxiUser) session.getAttribute("TaxiUser");

        MyDAO dao = new MyDAO();
        Connection con = MySQLConnection.getMyOracleConnection();

        ArrayList<Trip> alist = new ArrayList<Trip>();

        try {

            Statement pstmt = con.createStatement();
            ResultSet rs = pstmt.executeQuery("select * from taxidrivers where available = 'yes'");

            while (rs.next()) {

                String os1 = rs.getString("cardnumber");
                String os2 = rs.getString("cabtype");
                String os3 = rs.getString("drivername");
                String os4 = rs.getString("currentlocation");

                // STOPPED HERE

                // Trip t = new Trip(os1, os2, os3, os4);
                // alist.add(t);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        request.setAttribute("ScheduledTrips", alist);

        RequestDispatcher dispatcher = request.getRequestDispatcher("ScheduledTrips.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
