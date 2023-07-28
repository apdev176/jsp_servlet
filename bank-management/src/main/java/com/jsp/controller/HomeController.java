package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String admin=req.getParameter("administrator");
	String manager=req.getParameter("bankManager");
	String customer=req.getParameter("customer");
	
	if(admin!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("administrator_login.jsp");
		requestDispatcher.forward(req, resp);
	}
	else if (manager!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("bank_manager_login.jsp");
		requestDispatcher.forward(req, resp);
	}
	else if (customer!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("customer.jsp");
		requestDispatcher.forward(req, resp);
	}
}
}
