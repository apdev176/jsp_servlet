package com.jsp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int bank_id;
	private String bank_name;
	private String bank_password;
	private String city;
	private String address;

	@OneToMany
	private List<Customer> customers;

	@OneToMany
	private List<BankManager> bankManagers;

	@OneToMany
	private List<BankAccount> bankAccounts;

	public int getBank_id() {
		return bank_id;
	}

//	public void setBank_id(int bank_id) {
//		this.bank_id = bank_id;
//	}

	public String getBank_name() {
		return bank_name;
	}

//	public void setBank_name(String bank_name) {
//		this.bank_name = bank_name;
//	}

	public String getCity() {
		return city;
	}

//	public void setCity(String city) {
//		this.city = city;
//	}

	public List<Customer> getCustomers() {
		return customers;
	}

//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public List<BankManager> getBankManagers() {
		return bankManagers;
	}

	public void setBankManagers(List<BankManager> bankManagers) {
		this.bankManagers = bankManagers;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

//	public void setBankAccounts(List<BankAccount> bankAccounts) {
//		this.bankAccounts = bankAccounts;
//	}

}
