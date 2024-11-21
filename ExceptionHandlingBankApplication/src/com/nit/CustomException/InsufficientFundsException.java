package com.nit.CustomException;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String errMessage) {
		super(errMessage);
	}
}
