package com.servlets.appointment;

import java.io.IOException;
import java.sql.Date;

import com.service.*;
import com.serviceimpl.*;
import java.util.List;

import com.serviceimpl.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Appointment;
import com.models.Doctor;
import com.service.*;
/**
 * Servlet implementation class AppointmentServlet
 */
@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private DoctorService doctorService=new DoctorServiceImpl();  
    
    public AppointmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Doctor> doctors=doctorService.getAllDoctors();
		request.setAttribute("doctors", doctors);
		request.getRequestDispatcher("/Appointment/addappointment.jsp").forward(request, response);;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AppointmentService appointmentService =new AppointmentServiceImpl();
        Appointment a=new Appointment();
        a.setDoctor(request.getParameter("doctor"));
		a.setDetails(request.getParameter("details"));
		a.setSlots(Integer.parseInt(request.getParameter("slots")));
		a.setFee(Double.parseDouble(request.getParameter("fee")));
		a.setDate(Date.valueOf(request.getParameter("date")));
		appointmentService.addAppointment(a);
		request.setAttribute("success","Appointment is registered succesfully!");
		request.getRequestDispatcher("/Appointment/addappointment.jsp").forward(request, response);
	}

}
