package com.servlets.patient;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import com.serviceimpl.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Doctor;
import com.models.Patient;
import com.service.PatientService;

/**
 * Servlet implementation class EditPatientServlet
 */
@WebServlet("/EditPatientServlet")
public class EditPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PatientService patientService = new PatientServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditPatientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		Patient p = patientService.getPatientById(id);
//		System.out.println("Patient name="+p.getOther());
//		if(p.getOther()!=null && !p.getOther().isEmpty()){
//			request.setAttribute(, response)
//		}
//		System.out.println(p.getMedicalHistory());
		request.setAttribute("p", p);
		request.getRequestDispatcher("Patient/patienteditform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Patient p = new Patient();
		int id=Integer.parseInt(request.getParameter("id"));
		p.setName(request.getParameter("name"));
		p.setPhone(Long.parseLong(request.getParameter("phone")));
		p.setDOB(Date.valueOf(request.getParameter("dob")));
		p.setCommunicationAddress(request.getParameter("caddress"));
		p.setPresentAddress(request.getParameter("paddress"));
		p.setGender(request.getParameter("gender"));
		p.setMartialStatus(request.getParameter("mstatus"));
		p.setMedicalHistory(Arrays.asList(request.getParameterValues("phistory")));
		p.setOtherDetails(request.getParameter("odetails"));
		p.setOther(request.getParameter("other"));
		patientService.updatePatient(id, p);
		request.setAttribute("msg", "Successfully updated");
		request.getRequestDispatcher("Patient/patienteditform.jsp").forward(request, response);
	}

}
