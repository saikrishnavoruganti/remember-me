package com.summitworks.www;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.summitworks.www.DAO.LibrarianDAO;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		LibrarianDAO dao = new LibrarianDAO();
		
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("pass");
		//String userRepassword = request.getParameter("repass");
		String userAddress = request.getParameter("addr");
		String userPhone = request.getParameter("phno");
		String userEmail = request.getParameter("email");
		
		dao.insert(userName, userPassword, userAddress, userPhone, userEmail);
		
	}

}
