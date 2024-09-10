package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Db;
import com.models.Doctor;
import com.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    Connection conn= Db.getConnection();
	@Override
	public void addDoctor(Doctor d) {
		String sql="Insert into Doctor(name,address,email,note,gender,phone,specialization) values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, d.getName());
			stm.setString(2, d.getAddress());
			stm.setString(3, d.getEmail());
			stm.setString(4, d.getNote());
			stm.setString(5, d.getGender());
			stm.setLong(6, d.getPhone());
			stm.setString(7, d.getSpecialization());
			
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors=new ArrayList<>();
		String query="Select * from doctor";
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				Doctor d=new Doctor();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setAddress(rs.getString("address"));
				d.setEmail(rs.getString("email"));
				d.setGender(rs.getString("gender"));
				d.setNote(rs.getString("note"));
				d.setPhone(rs.getLong("phone"));
				d.setSpecialization(rs.getString("specialization"));
				doctors.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doctors;
	}
	@Override
	public void deleteDoctor(int id) {
		String sql="Delete from doctor where id="+id;
		try {
			Statement stm=conn.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void updateDoctor(int id,Doctor d) {
		 
		String sql="Update doctor set name=?,address=?,specialization=?,email=?,note=?,phone=?,gender=? where id=?";
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, d.getName());
			stm.setString(2, d.getAddress());
			stm.setString(3, d.getSpecialization());
			stm.setString(4, d.getEmail());
			stm.setString(5, d.getNote());
			stm.setLong(6, d.getPhone());
			stm.setString(7, d.getGender());
			stm.setInt(8, id);
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Doctor getDoctorById(int id) {
		String sql="Select * from doctor where id="+id;
		Doctor d=null;
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				d=new Doctor();
			
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setAddress(rs.getString("address"));
				d.setEmail(rs.getString("email"));
				d.setGender(rs.getString("gender"));
				d.setNote(rs.getString("note"));
				d.setPhone(rs.getLong("phone"));
				d.setSpecialization(rs.getString("specialization"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	

}
