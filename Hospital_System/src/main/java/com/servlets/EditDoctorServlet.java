package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Doctor;
import com.service.*;
import com.serviceimpl.*;
/**
 * Servlet implementation class EditDoctorServlet
 */
@WebServlet("/EditDoctorServlet")
public class EditDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DoctorService doctorService=new DoctorServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getParameter("id"));
		int id=Integer.parseInt(request.getParameter("id"));
		
		Doctor d=doctorService.getDoctorById(id);
//		System.out.println("Doctor name="+d.getName());
		request.setAttribute("doctor", d);
		request.getRequestDispatcher("Doctor/doctoreditform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor d=new Doctor();
		d.setName(request.getParameter("name"));
		d.setAddress(request.getParameter("address"));
		d.setEmail(request.getParameter("email"));
		d.setGender(request.getParameter("gender"));
		d.setNote(request.getParameter("note"));
		d.setPhone(Long.parseLong(request.getParameter("phone")));
		d.setSpecialization(request.getParameter("specialization"));
		doctorService.updateDoctor(Integer.parseInt(request.getParameter("id")), d);
		request.setAttribute("msg", "Successfully updated");
		request.getRequestDispatcher("Doctor/doctoreditform.jsp").forward(request, response);
	}

}
