package com.nit.TestAccount;

import java.util.Scanner;

import com.nit.Customer.Customer;
import com.nit.Implementation.BankAccount;

public class ATM {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		BankAccount account1 = new BankAccount(364789215, 50000);
		BankAccount account2 = new BankAccount(24896345, 100000);

		Customer customer1 = new Customer("Lahu Shinde", account1);
		Customer customer2 = new Customer("Ravi Sir", account2);

		while (true) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Transfer");
			System.out.println("4.Loan Application");
			System.out.println("5.Check Balance");
			System.out.println("6.Exit..");

			System.out.println("Enter the choice..");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the deposit amount :");
				double depositAmount = sc.nextDouble();
				account1.deposit(depositAmount);
				break;

			case 2:
				System.out.println("Enter the withdraw amount :");
				double withdrawAmount = sc.nextDouble();
				account1.withdraw(withdrawAmount);
				break;

			case 3:

				System.out.println("Enter the amount how much you want to transfer  :");
				double transferAmount = sc.nextDouble();

				account1.transfer(account2, transferAmount);
				break;

			case 4:
				System.out.println("Enter the Loan amount How much you want. :");
				double loanAmount = sc.nextDouble();
				account1.applyForLoan(loanAmount);
				break;

			case 5:
				System.out.println("Your Current balance is : " + account1.getBalance());
				break;

			case 6:
				System.out.println("Existing..");
				sc.close();
				System.exit(0);
				break;

			default:
				System.err.println("Invalid Choice.. try again..");
				break;
			}

		}
	}

}
