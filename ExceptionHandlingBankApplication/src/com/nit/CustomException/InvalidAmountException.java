package com.nit.CustomException;

public class InvalidAmountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidAmountException(String errMessage) {
		super(errMessage);
	}
}
