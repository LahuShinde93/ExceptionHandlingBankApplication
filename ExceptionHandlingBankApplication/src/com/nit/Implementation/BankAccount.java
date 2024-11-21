package com.nit.Implementation;

import com.nit.CustomException.*;
import com.nit.Requirment.Bank;

public class BankAccount implements Bank {

	private long accountNumber;
	private double balance;

	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance; 
	}

	@Override
	public void deposit(double amt) throws InvalidAmountException {

		if (amt <= 0) {
			throw new InvalidAmountException("Please enter valid amount..for deposit..");
		} else {
			balance += amt;
			System.out.println("Deposit Successfully!.. RS."+amt);
			System.out.println("Transaction Successfully...");
		}
	}

	@Override
	public void withdraw(double amt) throws InsufficientFundsException, InvalidAmountException {

		if (amt > balance) {
			throw new InsufficientFundsException("Insufficient Found...");
		} else if (amt <= 0) {
			throw new InvalidAmountException("please enter valid amont for withdraw..");
		} else {
			balance -= amt;
			System.out.println("withdraw Successfully!.. RS."+amt);
		}
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {

		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient Fund.");
		} else if (amount <= 0) {
			throw new InvalidAmountException("please enter valid amount..for transfer..");
		} else if (toAccount instanceof BankAccount) {
			this.balance -= amount;
			toAccount.deposit(amount); 
		} else {
			if (toAccount == null) {
				throw new AccountNotFoundException("This Bank Account is not exist.. please enter valid AccNo..");
			} else {
				throw new AccountNotFoundException("This Bank Account is not exist.. please enter valid AccNo..");

			}
		}

	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {

		if (amount > 50000) {
			throw new LoanNotAllowedException(
					"Loan limit is exceeds.. you can't give loan..! Enter amount in loan range..");

		} else if (amount <= 0) {
			throw new InvalidAmountException("Please enter valid amount for apply loan..");
		} else {
			System.out.println("Congratulation! you applied for Rs." + amount + " loan");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
}
