package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.CustomerService;

@WebServlet("/welcome")
public class CustomerLogin extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String account_type=req.getParameter("accountType");
	
	if(email!=""&&password!=""&&account_type!="") {
		CustomerService customerService=new CustomerService();
		int count=customerService.loginValidation(email, password, account_type);
		if(count!=1) {
			PrintWriter  printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+"wrong email and password or account type"+"</h1></body></html>");
		}
		else if(count==1) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("customer_actions.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	else {
		PrintWriter  printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+"something went wrong login again"+"</h1></body></html>");
	}
}
}
