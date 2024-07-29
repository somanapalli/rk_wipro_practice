package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
	
	
	public static void main(String[] args) throws Exception {
		
		
		//load the driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//get the connection 
		Connection con = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		//create the Statement object 
		
		Statement st = con.createStatement();
		
		//processing select query
		
		ResultSet rs = st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		
		
		//close the connection 
		con.close();
		
	}

}
