package com.nit.CustomException;

public class AccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(String errMessage) {
		super(errMessage);
	}
}
