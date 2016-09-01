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
import com.training.entity.MyDAO;
import com.training.entity.MySQLConnection;

/**
 * Servlet implementation class SpecialOffersServlet
 */
public class SpecialOffersServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpecialOffersServlet() {
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

        ArrayList<Integer> alist = new ArrayList<Integer>();

        try {

            Statement pstmt = con.createStatement();
            ResultSet rs = pstmt
                    .executeQuery("select farepaid from trips where customerid = '" + tempUser.getEmail() + "'");

            while (rs.next()) {
                int os1 = rs.getInt("farepaid");
                alist.add(os1);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        request.setAttribute("ScheduledTrips", alist);

        int max = 0;
        for (int x : alist) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Max is: " + max);

        if (max >= 3000) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("MaxDiscount.jsp");
            dispatcher.forward(request, response);
        } else if (max >= 1000 && max <= 2999) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("MediumDiscount.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("NoDiscount.jsp");
            dispatcher.forward(request, response);
        }

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
