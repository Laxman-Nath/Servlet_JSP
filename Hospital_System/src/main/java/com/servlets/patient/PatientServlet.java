package com.servlets.patient;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Patient;
import com.service.PatientService;
import com.serviceimpl.PatientServiceImpl;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Patient/addpatient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  Patient p=new Patient();
	  PatientService patientService=new PatientServiceImpl();
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
//	  System.out.println(request.getParameter("other"));
	  System.out.println(p.getOther());
	  patientService.addPatient(p);
	  request.setAttribute("success","Patient is registered succesfully!");
	request.getRequestDispatcher("/Patient/addpatient.jsp").forward(request, response);
	  

	}

}
