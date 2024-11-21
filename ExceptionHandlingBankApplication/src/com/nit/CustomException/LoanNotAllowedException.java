package com.nit.CustomException;

public class LoanNotAllowedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LoanNotAllowedException(String errMessage) {
		super(errMessage);
	}

}
