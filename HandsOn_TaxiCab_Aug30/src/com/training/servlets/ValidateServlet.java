package com.training.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.TaxiUser;
import com.training.entity.MyDAO;
import com.training.entity.ValidateUser;

/**
 * Servlet implementation class ReadParametersServlet
 */
public class ValidateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
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

        String strPassword = request.getParameter("password");
        String strEmail = request.getParameter("email");

        MyDAO dao = new MyDAO();

        TaxiUser user = dao.find(strEmail);

        ValidateUser v = new ValidateUser();
        boolean validation = false;
        try {
            validation = v.validate(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (validation == true) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("ReadLoginValues.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
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
