package com.service;

import java.util.List;

import com.models.Doctor;

public interface DoctorService {
  void addDoctor(Doctor d);
  List<Doctor> getAllDoctors();
  void deleteDoctor(int id);
  void updateDoctor(int id,Doctor d);
  Doctor getDoctorById(int id);
}
