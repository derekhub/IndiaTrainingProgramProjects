package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayBookingInformationServlet
 */
public class DisplayBookingInformationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayBookingInformationServlet() {
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

        String strName = request.getParameter("name");
        int intTelephone = Integer.parseInt(request.getParameter("telephone"));
        String strBookingType = request.getParameter("type");
        String strPickupPlace = request.getParameter("pickupPlace");
        String strdropPlace = request.getParameter("dropPlace");

        System.out.println(strName);
        System.out.println(intTelephone);
        System.out.println(strBookingType);
        System.out.println(strPickupPlace);
        System.out.println(strdropPlace);

        request.setAttribute("strName", strName);
        request.setAttribute("intTelephone", intTelephone);
        request.setAttribute("strBookingType", strBookingType);
        request.setAttribute("strPickupPlace", strPickupPlace);
        request.setAttribute("strdropPlace", strdropPlace);

        RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayBookingInformation.jsp");
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
