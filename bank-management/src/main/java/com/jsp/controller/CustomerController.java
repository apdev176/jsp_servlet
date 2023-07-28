package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer")
public class CustomerController extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String new_customer=req.getParameter("openAccount");
	String login=req.getParameter("login");
	
	if(new_customer!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("open_account.jsp");
		requestDispatcher.forward(req, resp);
	}
	else if (login!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("customer_login.jsp");
		requestDispatcher.forward(req, resp);
	}
}
}
