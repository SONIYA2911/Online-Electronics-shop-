package com.register;

import java.sql.SQLException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter register details");
		String s=sc.nextLine();
		Register reg=new Register(s.split(",")[0],s.split(",")[1],s.split(",")[2]);
		
		RegisterDao rd=new RegisterDao();
		rd.insert(reg);

	}

}
