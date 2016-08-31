package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.domains.TaxiUser;
import com.training.entity.MyDAO;

/**
 * Servlet implementation class BookLaterServlet
 */
public class BookLaterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookLaterServlet() {
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

        TaxiUser currentUser = dao.find(tempUser.getEmail());

        System.out.println(currentUser.getName());

        request.setAttribute("currentUserName", currentUser.getName());
        request.setAttribute("currentTelephone", currentUser.getTelephone());

        RequestDispatcher dispatcher = request.getRequestDispatcher("BookLater.jsp");
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
