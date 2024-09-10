package com.servlets.admin;

import java.io.IOException;
import com.serviceimpl.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Admin;
import com.service.*;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      AdminService adminService=new AdminServiceImpl(); 
    
    public AdminServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		Admin a=new Admin();
		a.setName(name);
		a.setAddress(address);
		a.setPassword(password);
		adminService.addAdmin(a);
		request.setAttribute("success", "Admin is successfully registered");
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

}
