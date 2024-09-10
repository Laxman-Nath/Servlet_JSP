package com.servlets.specialization;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.Specialization;
import com.service.*;

import com.serviceimpl.*;
@WebServlet("/ViewSpecializationsServlet")
public class ViewSpecializationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private SpecializationService specializationService=new SpecializationServiceImpl();  
    
    public ViewSpecializationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Specialization> specializations=this.specializationService.getSpecializations();
		request.setAttribute("specializations", specializations);
		request.getRequestDispatcher("Specialization/SpecializationsList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
