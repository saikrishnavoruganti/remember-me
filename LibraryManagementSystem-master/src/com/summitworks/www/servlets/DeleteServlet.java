package com.summitworks.www.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.summitworks.www.DAO.DataAccessLayer;
import com.summitworks.www.VO.User;
import com.summitworks.www.VO.User;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		DataAccessLayer dao = new DataAccessLayer();
		
		String userId = request.getParameter("id");
		int uid = Integer.parseInt(userId);
		user.setId(uid);
		
		dao.delete(user);	
	}
}
