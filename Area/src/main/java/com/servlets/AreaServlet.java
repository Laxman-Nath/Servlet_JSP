package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AreaServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int length=Integer.parseInt(request.getParameter("length"));
		int breadth=Integer.parseInt(request.getParameter("breadth"));
		int area=length*breadth;
		request.setAttribute("Area",area);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
		
		
	}

}
