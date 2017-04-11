package com.summitworks.www.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.summitworks.www.DAO.DataAccessLayer;
import com.summitworks.www.VO.User;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		User user = new User();
		DataAccessLayer dao = new DataAccessLayer();
		
		String userId = request.getParameter("id");
		int id = Integer.parseInt(userId);
		user.setId(id);
		
		String userName = request.getParameter("name");
		user.setUserName(userName);
		
		String phone = request.getParameter("phone");
		Long phoneNo = Long.parseLong(phone);
		user.setPhoneNo(phoneNo);
		
		String emailId = request.getParameter("email");
		user.setEmailId(emailId);
		
		dao.insert(user);	
	}
}
