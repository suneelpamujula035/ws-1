package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("uname");
		String passord = request.getParameter("upass");

		LoginDAO dao = new LoginDAO();
		if (username.equals("suneel") && passord.equals("sunny")) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			response.sendRedirect("welcome.jsp");
		} else 
		{
			response.sendRedirect("login.jsp");
		}
	}

}
