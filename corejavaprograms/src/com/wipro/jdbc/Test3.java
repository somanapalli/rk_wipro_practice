package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) throws Exception{
		
		//load the driver class 
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//get the connection 
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
		
		//create the object for PreparedStatement
		
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter student id");
		
		int stid = s.nextInt();
		
		System.out.println("enter student name");
		
		String stname = s.next();
		
		
		ps.setInt(1, stid);
		
		ps.setString(2, stname);
		
		int x= ps.executeUpdate();
		
		System.out.println(x + "row(s) inserted");
		
		
		//close the connection 
		
		con.close();
		
		
		
		
	}

}
