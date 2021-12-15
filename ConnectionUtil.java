package com.electronics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
public static Connection getDbConnection(){
	Connection con = null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("driver jar not here");
	}
	

		catch (SQLException e) {
		e.printStackTrace();
		System.out.println("user_name or paasword may wrong");
	}
	return con;
}

public void closeConnection() {
	
}










	
	
	
	
	
	
}
