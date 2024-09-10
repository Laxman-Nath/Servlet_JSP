package com.serviceimpl;

import com.db.Db;
import com.models.Admin;
import com.service.AdminService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminServiceImpl implements AdminService {
	private static Connection conn = Db.getConnection();

	@Override
	public void addAdmin(Admin a) {
		String sql = "Insert into admin(name,address,password) values(?,?,?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, a.getName());
			stm.setString(2, a.getAddress());
			stm.setString(3, a.getPassword());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Admin getAdmin(String name, String password) {
		String sql = "Select * from admin where name='"+name+"'and password='"+password+"'";
		Statement stm;
		Admin a=null;
		try {
			stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				System.out.println("inside");
				a=new Admin();
				a.setName(rs.getString("name"));
				a.setAddress(rs.getString("address"));
				a.setPassword(rs.getString("password"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}

}
