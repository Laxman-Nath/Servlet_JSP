package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Doctor;
import com.service.*;
import com.serviceimpl.*;
@WebServlet("/ViewDoctorsServlet")
public class ViewDoctorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DoctorService doctorService=new DoctorServiceImpl();
   
    public ViewDoctorsServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("view doctors");
		List<Doctor> doctors=doctorService.getAllDoctors();
		request.setAttribute("doctors", doctors);
		request.getRequestDispatcher("Doctor/doctorslist.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
