package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

@WebServlet("/customerDetail")
public class CustomerDetail extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("customerName");
	String email=req.getParameter("customerEmail");
	String password=req.getParameter("customerPassword");
	String phoneno=req.getParameter("customerPhone");
	String pan=req.getParameter("customerPan");

	int age=Integer.parseInt(req.getParameter("customerAge"));
	String accountType=req.getParameter("accountType");
	
	
	
	if(name!=""&&email!=""&&password!=""&&phoneno!=""&&pan!="" &&age>=18&&(accountType.equals("saving") || accountType.equals("current"))) {
		CustomerService customerService=new CustomerService();
		int count=customerService.checkAccount(pan,accountType);
		PrintWriter printWriter=resp.getWriter();
		if(count>=1) {
			printWriter.write("<html><body><h1>"+"you are already a customer with"+accountType+"account"+"</h1></body></html>");
		}
		else {
			Customer customer=new Customer();
			customer.setCustomer_name(name);
			customer.setCustomer_email(email);
			customer.setCustomer_password(password);
			customer.setCustomer_phoneNo(phoneno);
			customer.setPan(pan);
			customer.setAge(age);
			customer.setAccount_type(accountType);
			customer.setStatus("unapproved");
			Customer customer_result=customerService.saveCustomer(customer);
			if(customer_result!=null) {
				printWriter.write("<html><body><h1>"+name+"registered succcessfully"+"</h1><h2>Thank You</h2><h3>check status of approval after 2-3 days</h3></body></html>");
			}
		}
		
	}
	else {
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+"something went wrong register again"+"</h1></body></html>");
	}
	
}
}
