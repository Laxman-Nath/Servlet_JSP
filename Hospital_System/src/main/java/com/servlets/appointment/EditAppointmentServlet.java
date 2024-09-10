package com.servlets.appointment;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Appointment;
import com.models.Doctor;
import com.service.*;
import com.serviceimpl.*;
/**
 * Servlet implementation class EditAppointmentServlet
 */
@WebServlet("/EditAppointmentServlet")
public class EditAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       AppointmentService appointmentService=new AppointmentServiceImpl();
       private DoctorService doctorService=new DoctorServiceImpl();  
    
    public EditAppointmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Appointment a=appointmentService.getAppointmentById(Integer.parseInt(request.getParameter("id")));
		System.out.println(a.getDoctor());
		List<Doctor> doctors=doctorService.getAllDoctors();
		request.setAttribute("doctors", doctors);
		request.setAttribute("a",a);
		request.getRequestDispatcher("/Appointment/appointmenteditform.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		Appointment a=new Appointment();
	        a.setDoctor(request.getParameter("doctor"));
			a.setDetails(request.getParameter("details"));
			a.setSlots(Integer.parseInt(request.getParameter("slots")));
			a.setFee(Double.parseDouble(request.getParameter("fee")));
			a.setDate(Date.valueOf(request.getParameter("date")));
			appointmentService.updateAppointment(Integer.parseInt(request.getParameter("id")), a);
			request.setAttribute("msg", "Successfully updated");
			request.getRequestDispatcher("Appointment/appointmenteditform.jsp").forward(request, response);
	}

}
