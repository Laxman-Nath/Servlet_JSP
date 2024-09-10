package com.servlets.specialization;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.SpecializationService;
import com.serviceimpl.SpecializationServiceImpl;


@WebServlet("/DeleteSpecializationServlet")
public class DeleteSpecializationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SpecializationService specializationService = new SpecializationServiceImpl();

	
	public DeleteSpecializationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.specializationService.deleteSpecialization(Integer.parseInt(request.getParameter("id")));
     request.setAttribute("msg","Deleted successfully");
     request.getRequestDispatcher("Specialization/SpecializationsList.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
