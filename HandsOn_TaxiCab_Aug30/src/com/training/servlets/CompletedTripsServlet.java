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
import javax.servlet.http.HttpSession;

import com.training.domains.TaxiUser;
import com.training.domains.Trip;
import com.training.entity.MyDAO;
import com.training.entity.MySQLConnection;

/**
 * Servlet implementation class CompletedTripsServlet
 */
public class CompletedTripsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompletedTripsServlet() {
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

        HttpSession session = request.getSession();
        TaxiUser tempUser = (TaxiUser) session.getAttribute("TaxiUser");

        MyDAO dao = new MyDAO();
        Connection con = MySQLConnection.getMyOracleConnection();

        ArrayList<Trip> alist = new ArrayList<Trip>();

        try {

            Statement pstmt = con.createStatement();
            ResultSet rs = pstmt.executeQuery(
                    "select * from trips where status = 'completed' and customerid = '" + tempUser.getEmail() + "'");

            while (rs.next()) {

                int os1 = rs.getInt("tripid");
                String os2 = rs.getString("startlocation");
                String os3 = rs.getString("endlocation");
                String os4 = rs.getString("vehiclename");
                String os5 = rs.getString("customerid");
                String os6 = rs.getString("farepaid");
                String os7 = rs.getString("status");

                Trip t = new Trip(os1, os2, os3, os4, os5, os6, os7);
                alist.add(t);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        request.setAttribute("CompletedTrips", alist);

        RequestDispatcher dispatcher = request.getRequestDispatcher("CompletedTrips.jsp");
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
