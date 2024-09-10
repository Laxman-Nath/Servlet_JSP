package com.servlets.specialization;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Specialization;
import com.service.SpecializationService;
import com.serviceimpl.SpecializationServiceImpl;

/**
 * Servlet implementation class EditSpecializationServlet
 */
@WebServlet("/EditSpecializationServlet")
public class EditSpecializationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SpecializationService specializationService = new SpecializationServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditSpecializationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("Id="+request.getParameter("id"));
         Specialization specialization=this.specializationService.getSpecializationById(Integer.parseInt(request.getParameter("id")));
         request.setAttribute("s", specialization);
         request.getRequestDispatcher("/Specialization/specializationeditform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String note = request.getParameter("note");
		int id=Integer.parseInt(request.getParameter("id"));
		Specialization s = new Specialization();
		s.setCode(code);
		s.setName(name);
		s.setNote(note);
		this.specializationService.updateSpecailization(id, s);
		request.setAttribute("success","Specialization is updated successfully!");
		request.getRequestDispatcher("/Specialization/specializationeditform.jsp").forward(request, response);
	}

}
