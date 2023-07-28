package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.BankManagerService;

@WebServlet("/BMLogin")
public class BankManagerLogin extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id")) ;
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	if(id!=0&&email!=""&&password!="") {
		BankManagerService bankManagerService=new BankManagerService();
		int count=bankManagerService.checkBMAccount(id, email, password);
		if(count!=1) {
			PrintWriter  printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+"either id,email or password is incorrect"+"</h1></body></html>");
		}
		else if(count==1) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("BMactions.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
	else {
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+"you are not authorized"+"</h1></body></html>");
	}
}
}
