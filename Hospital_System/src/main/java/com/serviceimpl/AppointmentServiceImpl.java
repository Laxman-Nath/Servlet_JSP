package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Db;
import com.models.Appointment;
import com.models.Doctor;
import com.service.AppointmentService;

public class AppointmentServiceImpl implements AppointmentService{
    private static Connection conn=Db.getConnection();
	@Override
	public void addAppointment(Appointment a) {
		String sql="Insert into appointment(doctor,date,fee,details,slots) values(?,?,?,?,?)";
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, a.getDoctor());
			stm.setDate(2,a.getDate());
			stm.setDouble(3, a.getFee());
			stm.setString(4,a.getDetails());
			stm.setInt(5, a.getSlots());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Appointment> getAllAppointments() {
		List<Appointment> appointments=new ArrayList<>();
		String query="Select * from appointment";
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				Appointment a =new Appointment();
				a.setDoctor(rs.getString("doctor"));
				a.setDetails(rs.getString("details"));
				a.setId(rs.getInt("id"));
				a.setSlots(rs.getInt("slots"));
				a.setFee(rs.getDouble("fee"));
				a.setDate(rs.getDate("date"));
				appointments.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appointments;
		
	}

	@Override
	public void deleteAppointment(int id) {
		String sql="Delete from appointment where id="+id;
		try {
			Statement stm=conn.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAppointment(int id, Appointment a) {
		String sql="Update appointment set doctor=?,date=?,fee=?,details=?,slots=? where id="+id;
		try {
			PreparedStatement stm=conn.prepareStatement(sql);
			stm.setString(1, a.getDoctor());
			stm.setDate(2,a.getDate());
			stm.setDouble(3, a.getFee());
			stm.setString(4,a.getDetails());
			stm.setInt(5, a.getSlots());
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Appointment getAppointmentById(int id) {
		String sql="Select * from appointment where id="+id;
		Appointment a=null;
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				a=new Appointment();
				a.setDoctor(rs.getString("doctor"));
				a.setDetails(rs.getString("details"));
				a.setId(rs.getInt("id"));
				a.setSlots(rs.getInt("slots"));
				a.setFee(rs.getDouble("fee"));
				a.setDate(rs.getDate("date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

}
