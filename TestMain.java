package com.electronics;

import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws SQLException {
Scanner sc=new Scanner(System.in);

System.out.println("enter login details");
String obj=sc.nextLine();
Login l=new Login(obj.split(",")[0],obj.split(",")[1]);
LoginDao ld=new LoginDao();
ld.select(l);


	}

}
