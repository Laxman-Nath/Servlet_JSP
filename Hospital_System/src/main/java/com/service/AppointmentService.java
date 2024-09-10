package com.service;

import java.util.List;

import com.models.Appointment;


public interface AppointmentService {
	void addAppointment(Appointment a);
	  List<Appointment> getAllAppointments();
	  void deleteAppointment(int id);
	  void updateAppointment(int id,Appointment a);
	  Appointment getAppointmentById(int id);
}
