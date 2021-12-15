package com.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.electronics.ConnectionUtil;
import com.register.ConnectonUtil;



public class RegisterDao {

	public void insert(Register reg) throws SQLException {
		String insertQuery="insert into register values(?,?,?)";
		ConnectionUtil conUtil=new ConnectionUtil();
		Connection con=conUtil.getDbConnection();
		System.out.println("connection get successfully");
		PreparedStatement pstmt=con.prepareStatement(insertQuery);
		
		pstmt.setString(1, reg.getReg_user_name());
		pstmt.setString(2,reg.getReg_email());
		pstmt.setString(3,reg.getReg_Password());
		
		int i=pstmt.executeUpdate();
		System.out.println(i+"row updated successfully");
		
	}
	
	
	
	
}
