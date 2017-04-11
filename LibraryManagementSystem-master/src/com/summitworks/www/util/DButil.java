package com.summitworks.www.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DButil {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
			  
			/*if (con!= null) {
	            System.out.println("Connected");
	        }*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	public static void closeConnection(ResultSet result, Statement statement,Connection con )
	{
		try
		{
			result.close();
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(Statement statement,Connection con)
	{
		try
		{
			statement.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
