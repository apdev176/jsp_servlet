package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Customer;
import com.mysql.cj.Query;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ap");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public int checkAccount( String pan,String accoutType) {
		int count= entityManager.createQuery("Select count(*) from Customer c where account_type="+accoutType+" and pan="+pan+"").getFirstResult();
		return count;
	}
	
	public int loginValidation(String email,String password,String accountType) {
		int count=entityManager.createQuery("Select count(*) from Customer c where customer_email="+email+" and customer_password="+password+" and account_type="+accountType+"").getFirstResult();
	    return count;
	}
	//save
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
}
