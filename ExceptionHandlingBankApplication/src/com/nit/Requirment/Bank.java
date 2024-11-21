package com.nit.Requirment;

import com.nit.CustomException.*;
import com.nit.Implementation.BankAccount;
 

public interface Bank {

	public void deposit(double amt)throws InvalidAmountException;
	public void withdraw(double amt)throws InsufficientFundsException,InvalidAmountException;
	public void transfer(BankAccount toAccount,double amoutn) throws InsufficientFundsException,AccountNotFoundException,InvalidAmountException;
	public void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException;
	
	public double getBalance();
	
}
  