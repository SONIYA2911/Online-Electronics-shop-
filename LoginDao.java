package com.electronics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	PreparedStatement pstmt=null;
	public void select(Login l) throws SQLException {
	
	
ConnectionUtil conUtil=new ConnectionUtil();
Connection con=conUtil.getDbConnection();
	
System.out.println("connection get successfully");

try {
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from login");
	while(rs.next()) {
		System.out.println(rs.getString("user_name")+"\t"+rs.getString("password"));
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


pstmt.setString(1,l.getUser_name());
pstmt.setString(2,l.getPassword());

int i=pstmt.executeUpdate();
System.out.println(i+"row updated successfully");

	}
}
