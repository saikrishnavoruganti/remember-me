package com.summitworks.www.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.summitworks.www.util.DButil;

public class LibrarianDAO {
	
	public void insert(String name, String password, String address, String phoneNumber, String emailId)
	{
		Connection con=null;
		PreparedStatement st=null;
		//ResultSet resultSet=null;
		try
		{
			con=DButil.getConnection();
	
				st=con.prepareStatement("insert into employee(NAME, PASSWORD, ADDRESS, PHONE_NUMBER,EMAIL_ID)values(?,?,?,?,?)");
			 
				st.setString(1,name);
				st.setString(2,password);
				st.setString(3,address);
				st.setString(4,phoneNumber);
				st.setString(5,emailId);
				
				int i=st.executeUpdate();  
			    System.out.println("number of records inserted "+i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DButil.closeConnection(st,con);
		}
	}
	
}