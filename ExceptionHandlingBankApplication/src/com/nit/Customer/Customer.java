package com.nit.Customer;

import com.nit.Implementation.*;

public class Customer {

	private String custName;
	private BankAccount account; // HAS-A Relation

	public Customer(String name, BankAccount account) {
		super();
		this.account = account;
		this.custName = name;
	}

	public BankAccount getAccount() {
		return account;
	}
 
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", account=" + account + "]";
	}

}
