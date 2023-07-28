package com.jsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BankManager {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankManager_id;	
	private String bankManager_name;
	private String bankManager_email;
	private String bankManager_phone;
	private String bankManager_password;
	
	@OneToMany
	private List<Customer> customers;
	
	public int getBankManager_id() {
		return bankManager_id;
	}

	public void setBankManager_id(int bankManager_id) {
		this.bankManager_id = bankManager_id;
	}

	public String getBankManager_name() {
		return bankManager_name;
	}

	public void setBankManager_name(String bankManager_name) {
		this.bankManager_name = bankManager_name;
	}

	public String getBankManager_email() {
		return bankManager_email;
	}

	public void setBankManager_email(String bankManager_email) {
		this.bankManager_email = bankManager_email;
	}

	public String getBankManager_phone() {
		return bankManager_phone;
	}

	public void setBankManager_phone(String bankManager_phone) {
		this.bankManager_phone = bankManager_phone;
	}

	public String getBankManager_password() {
		return bankManager_password;
	}

	public void setBankManager_password(String bankManager_password) {
		this.bankManager_password = bankManager_password;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
	
	
}
