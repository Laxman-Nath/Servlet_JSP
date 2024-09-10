package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Doctor;
import com.models.Specialization;
import com.service.*;
import com.serviceimpl.*;
/**
 * Servlet implementation class Doctor
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SpecializationService specializationService=new SpecializationServiceImpl();
    
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Specialization> specializations=specializationService.getSpecializations();
		request.setAttribute("specializations",specializations);
		request.getRequestDispatcher("Doctor/adddoctor.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoctorService doctorService=new DoctorServiceImpl();
		Doctor d=new Doctor();
		d.setName(request.getParameter("name"));
		d.setAddress(request.getParameter("address"));
		d.setEmail(request.getParameter("email"));
		d.setGender(request.getParameter("gender"));
		d.setNote(request.getParameter("note"));
		d.setPhone(Long.parseLong(request.getParameter("phone")));
		d.setSpecialization(request.getParameter("specialization"));
		doctorService.addDoctor(d);
		request.setAttribute("success","Doctor is registered succesfully!");
		request.getRequestDispatcher("/Doctor/adddoctor.jsp").forward(request, response);
	}

}
 