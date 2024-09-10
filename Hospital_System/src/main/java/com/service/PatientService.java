package com.service;

import java.util.List;

import com.models.Doctor;
import com.models.Patient;

public interface PatientService {
	 void addPatient(Patient p);
	  List<Patient> getAllPatients();
	  void deletePatient(int id);
	  void updatePatient(int id,Patient p);
	  Patient getPatientById(int id);
}
