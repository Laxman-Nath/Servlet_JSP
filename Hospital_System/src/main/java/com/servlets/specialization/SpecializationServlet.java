package com.servlets.specialization;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Specialization;
import com.service.*;
import com.serviceimpl.AppointmentServiceImpl;
import com.serviceimpl.SpecializationServiceImpl;

/**
 * Servlet implementation class SpecializationServlet
 */
@WebServlet("/SpecializationServlet")
public class SpecializationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SpecializationService specializationService = new SpecializationServiceImpl();

	public SpecializationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Specialization/addspecialization.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String note = request.getParameter("note");
		Specialization s = new Specialization();
		s.setCode(code);
		s.setName(name);
		s.setNote(note);
		specializationService.addSpecialization(s);
		request.setAttribute("success", "Specialization is successfully created!");
		request.getRequestDispatcher("Specialization/addspecialization.jsp").forward(request, response);

	}

}
