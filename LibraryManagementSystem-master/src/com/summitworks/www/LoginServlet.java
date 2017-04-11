package com.summitworks.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.summitworks.www.util.DButil;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    		System.out.println("Say Hi!");
    	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		//System.out.println("Say Hello!");
		/*
		 * Steps to do:
		 * 1.accept the librarian name and password once it gets requests from client.
		 * 2.write select query with condition to check whtr username and password are correct.
		 * 3.if right, allow Librarian to go next step
		 * 		else, show error
		 * http://localhost:9090/LibraryManagementSystem/Login?lname=Radhika&lpassword=qwerty123
		 */
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		String librarianName = request.getParameter("lname");
		String librarianPassword = request.getParameter("lpassword");
		
		try
		{
			con=DButil.getConnection();
		
			if(librarianName==null||librarianName.equals("")||librarianPassword==null||librarianPassword.equals(""))
			{
				out.println("<html><body><center>");
				out.println("<li><i>User Name and Password cannot be empty</i></li><br/>");
				out.println("<li><i>We cannot log you into your account at this time. Please try again later</i>");
				out.println("</center></body></html>");
				return;
			}
			
			pst=con.prepareStatement("select * from librarian_details where name=? and password=?");
			pst.setString(1, librarianName);
			pst.setString(2, librarianPassword);
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				response.sendRedirect("LibrarianHome.jsp");
			}
			else{
				out.println("<html><body><center>");
				out.println("Given username and password are incorrect<br/>");
				out.println("<li><i>We cannot log you into your account at this time. Please try again later</i>");
				out.println("</center></body></html>");				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DButil.closeConnection(rs,pst,con);
		}	
	}
}
