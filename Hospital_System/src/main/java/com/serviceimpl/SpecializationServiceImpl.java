package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Db;
import com.models.Specialization;
import com.service.SpecializationService;

public class SpecializationServiceImpl implements SpecializationService {
	private Connection conn = Db.getConnection();

	@Override
	public void addSpecialization(Specialization s) {
      String sql="Insert into specialization(code,name,note) values(?,?,?)";
      try {
		PreparedStatement stm=conn.prepareStatement(sql);
		stm.setString(1, s.getCode());
		stm.setString(2,s.getName());
		stm.setString(3,s.getNote());
		stm.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public List<Specialization> getSpecializations() {
		List<Specialization> specializations=new ArrayList<>();
		String sql="Select * from specialization ";
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Specialization s=new Specialization();
				s.setId(rs.getInt(1));
				s.setCode(rs.getString(2));
				s.setName(rs.getString(3));
				s.setNote(rs.getString(4));
				specializations.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return specializations;
	}

	@Override
	public void deleteSpecialization(int id) {
		String sql="Delete from specialization where id="+id;
		try {
			Statement stm=conn.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void updateSpecailization(int id, Specialization s) {
		 String sql="Update specialization set code=?,name=?,note=? where id="+id;
		  try {
				PreparedStatement stm=conn.prepareStatement(sql);
				stm.setString(1, s.getCode());
				stm.setString(2,s.getName());
				stm.setString(3,s.getNote());
				stm.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public Specialization getSpecializationById(int id) {
	
		Specialization s=null;
		String sql="Select * from specialization where id="+id;
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				s=new Specialization();
				s.setId(rs.getInt(1));
				s.setCode(rs.getString(2));
				s.setName(rs.getString(3));
				s.setNote(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

}
