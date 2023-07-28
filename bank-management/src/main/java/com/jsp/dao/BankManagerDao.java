package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankManagerDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ap");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//checkBMaccount
	public int checkBMAccount(int id,String email,String password) {
		int count= entityManager.createQuery("Select count(*) from BankManager bm where bankManager_id="+id+" and bankManager_email="+email+" and bankManager_password="+password+"").getFirstResult();
		return count;
	}
}
