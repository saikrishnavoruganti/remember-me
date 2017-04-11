package com.summitworks.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.summitworks.www.util.DButil;

/**
 * Servlet implementation class BooksServlet
 */
@WebServlet("/BooksServlet")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("application/json");
		PrintWriter out=response.getWriter();
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		JSONArray users = new JSONArray();
		
		try
		{
			con=DButil.getConnection();
		
			st=con.createStatement();
			
			rs = st.executeQuery("select * from books order by id");
			
			while(rs.next())
			{
				JSONObject user = new JSONObject();
				
				user.put("id", rs.getInt("id"));
				user.put("name", rs.getString("name"));
				user.put("author_name", rs.getString("author_name"));
				user.put("year", rs.getInt("year"));
				
				users.add(user);
				//out.println("<html><body><center>");
				//out.println("User Details");
				//out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("phone_number")+" "+rs.getString("email"));
				//out.println("</center></body></html>");	
				//System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("phone_number")+" "+rs.getString("email"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			DButil.closeConnection(rs,st,con);
		}

		out.write(users.toString());
	}
	

}


