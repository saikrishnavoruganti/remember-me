package com.summitworks.www.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.summitworks.www.VO.User;
import com.summitworks.www.util.DButil;

public class DataAccessLayer {
	
	
	public void insert(User user)
	{
		Connection con=null;
		PreparedStatement st=null;
		//ResultSet resultSet=null;
		try
		{
			con=DButil.getConnection();
			
				st=con.prepareStatement("insert into user_details(ID, NAME, PHONE_NUMBER, EMAIL) values(?,?,?,?)");
				st.setInt(1,user.getId()); 
				st.setString(2,user.getUserName());
				st.setLong(3,user.getPhoneNo());
				st.setString(4,user.getEmailId());
				
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
	
	public void delete(User user)
	{
		Connection con=null;
		PreparedStatement st=null;
		try
		{
			con=DButil.getConnection();
			
			st=con.prepareStatement("delete from user_details where ID=?");
			st.setInt(1,user.getId());
			
		    int i=st.executeUpdate();
		    System.out.println("no of rows deleted: "+i);
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
	
	/*public void update(Employee emp)
	{
		Connection con=null;
		PreparedStatement st=null;
		try
		{	
			con=DButil.getConnection();
			
			st=con.prepareStatement("update curd_employee set EMP_NAME=?, EMP_PHONE=?, EMP_ADDR=?, EMP_EMAILID=? where EMP_ID=?");
			
			st.setString(1,emp.getEmpName());
			st.setLong(2, emp.getEmpPhone());
			st.setString(3, emp.getEmpAddress());
			st.setString(4, emp.getEmpEmailId());
			st.setInt(5, emp.getEmpId());
			
		    int i=st.executeUpdate();
		    System.out.println("no of rows updated: "+i);
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
	
	public List<Employee> retriveAll()
	{
		Connection con=null;
		Statement st=null;
		ResultSet resultSet=null;
		
		List<Employee> employees = new ArrayList<>();
		
		try
		{
			con=DButil.getConnection();
			
			st=con.createStatement();
			
			resultSet=st.executeQuery("select * from curd_employee");
			
			while(resultSet.next())
			{
				Employee emp = new Employee();
				
				int empId = resultSet.getInt("EMP_ID");
				emp.setEmpId(empId);
				
				String empName= resultSet.getString("EMP_NAME");
				emp.setEmpName(empName);
				
				Long empPhone= resultSet.getLong("EMP_PHONE");
				emp.setEmpPhone(empPhone);
				
				String empAddr= resultSet.getString("EMP_ADDR");
				emp.setEmpAddress(empAddr);
				
				String empEmail= resultSet.getString("EMP_EMAILID");
				emp.setEmpEmailId(empEmail);
				
				employees.add(emp);
				
			//	Employee e = new Employee(resultSet.getInt("eid"), resultSet.getString("ename"));
			//	employees.add(e);
				System.out.println(resultSet.getInt("EMP_ID")+" "+resultSet.getString("EMP_NAME")+resultSet.getLong("EMP_PHONE")+resultSet.getString("EMP_ADDR")+resultSet.getString("EMP_EMAILID"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DButil.closeConnection(resultSet, st, con);
		} 
		return employees;
	}
	
	public Employee get(Employee emp)
	{
		Connection con=null;
		PreparedStatement st=null;
		ResultSet resultSet=null;
	//	List<Employee> employees = new ArrayList<>();
		try
		{
			
			con=DButil.getConnection();
			
			st=con.prepareStatement("select * from curd_employee where EMP_ID=?");
			st.setInt(1, emp.getEmpId());
			
			resultSet=st.executeQuery();
			
			while(resultSet.next())
			{
			//	Employee e = new Employee(resultSet.getInt("eid"), resultSet.getString("ename"));
			//	employees.add(e);
				String empName= resultSet.getString("EMP_NAME");
				emp.setEmpName(empName);
				
				Long empPhone= resultSet.getLong("EMP_PHONE");
				emp.setEmpPhone(empPhone);
				
				String empAddr= resultSet.getString("EMP_ADDR");
				emp.setEmpAddress(empAddr);
				
				String empEmail= resultSet.getString("EMP_EMAILID");
				emp.setEmpEmailId(empEmail);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DButil.closeConnection(resultSet, st, con);
		} 
		return emp;
	}
}*/

