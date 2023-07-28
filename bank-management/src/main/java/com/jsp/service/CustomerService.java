package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

	public int checkAccount(String pan, String accountType) {
		return customerDao.checkAccount(pan, accountType);
	}
	
	//save
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	
	public int loginValidation(String email,String password,String accountType) {
		return customerDao.loginValidation(email, password, accountType);
	}
}
