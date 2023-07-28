package com.jsp.service;

import com.jsp.dao.BankManagerDao;

public class BankManagerService {
BankManagerDao bankManagerDao=new BankManagerDao();
//checkBMaccount
public int checkBMAccount(int id,String email,String password) {
	return bankManagerDao.checkBMAccount(id, email, password);
}
}
