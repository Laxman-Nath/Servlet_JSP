package com.serviceimpl;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.db.Db;
import com.models.Doctor;
import com.models.Patient;
import com.service.PatientService;

public class PatientServiceImpl implements PatientService {
	   Connection conn= Db.getConnection();
	@Override
	public void addPatient(Patient p) {
        String sql="Insert into patient(name,presentaddress,communicationaddress,dob,gender,phone,martialstatus,otherdetails,medicalhistory,other)"
        		+ "values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, p.getName());
			stm.setString(2, p.getPresentAddress());
			stm.setString(3, p.getCommunicationAddress());
			stm.setDate(4, p.getDOB());
			stm.setString(5, p.getGender());
			stm.setLong(6, p.getPhone());
			stm.setString(7, p.getMartialStatus());
			stm.setString(8, p.getOtherDetails());
			stm.setString(9, p.getMedicalHistory().toString());
		    stm.setString(10,p.getOther());
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> patients=new ArrayList<>();
		String query="Select * from patient";
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
			  Patient p=new Patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPresentAddress(rs.getString("presentaddress"));
				p.setCommunicationAddress(rs.getString("communicationaddress"));
				p.setGender(rs.getString("gender"));
				p.setDOB(rs.getDate("dob"));
				p.setPhone(rs.getLong("phone"));
				p.setMartialStatus(rs.getString("martialstatus"));
				p.setOtherDetails(rs.getString("otherdetails"));
				p.setMedicalHistory(Arrays.asList(rs.getString("medicalhistory").split(",")));
				patients.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patients;
	}

	@Override
	public void deletePatient(int id) {
		String sql="Delete from patient where id="+id;
		try {
			Statement stm=conn.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatePatient(int id, Patient p) {
		String sql="Update patient set name=?,presentaddress=?,communicationaddress=?,dob=?,gender=?,phone=?"
				+ ",martialstatus=?,otherdetails=?,medicalhistory=?,other=? where id="+id;
        		
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, p.getName());
			stm.setString(2, p.getPresentAddress());
			stm.setString(3, p.getCommunicationAddress());
			stm.setDate(4, p.getDOB());
			stm.setString(5, p.getGender());
			stm.setLong(6, p.getPhone());
			stm.setString(7, p.getMartialStatus());
			stm.setString(8, p.getOtherDetails());
			stm.setString(9, p.getMedicalHistory().toString());
			stm.setString(10,p.getOther());
//			stm.setInt(11, id);
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Patient getPatientById(int id) {
		String sql="Select * from patient where id="+id;
		Patient p=null;
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				p=new Patient();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPresentAddress(rs.getString("presentaddress"));
				p.setCommunicationAddress(rs.getString("communicationaddress"));
				p.setGender(rs.getString("gender"));
				p.setDOB(rs.getDate("dob"));
				p.setPhone(rs.getLong("phone"));
				p.setMartialStatus(rs.getString("martialstatus"));
				p.setOtherDetails(rs.getString("otherdetails"));
				p.setMedicalHistory(Arrays.asList(rs.getString("medicalhistory").split(",")));
				p.setOther(rs.getString("other"));
			    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
