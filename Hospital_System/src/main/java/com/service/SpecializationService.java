package com.service;

import java.util.List;

import com.models.Appointment;
import com.models.Specialization;

public interface SpecializationService {
	void addSpecialization(Specialization s);

	List<Specialization> getSpecializations();

	void deleteSpecialization(int id);

	void updateSpecailization(int id, Specialization s);

	Specialization getSpecializationById(int id);
}
