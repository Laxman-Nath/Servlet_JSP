package com.models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Patient {
private int id;
private String name;
private Date DOB;
private String communicationAddress;
private String gender;
private String presentAddress;
private String martialStatus;
private long phone;
private String otherDetails;
private List<String> medicalHistory;
private String other;

public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public String getCommunicationAddress() {
	return communicationAddress;
}
public void setCommunicationAddress(String communicationAddress) {
	this.communicationAddress = communicationAddress;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPresentAddress() {
	return presentAddress;
}
public void setPresentAddress(String presentAddress) {
	this.presentAddress = presentAddress;
}
public String getMartialStatus() {
	return martialStatus;
}
public void setMartialStatus(String martialStatus) {
	this.martialStatus = martialStatus;
}

public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public List<String> getMedicalHistory() {
	return medicalHistory;
}
public void setMedicalHistory(List<String> medicalHistory) {
	this.medicalHistory = medicalHistory;
}
public String getOtherDetails() {
	return otherDetails;
}
public void setOtherDetails(String otherDetails) {
	this.otherDetails = otherDetails;
}


}
