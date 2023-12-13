package com.bank.web.exception;

public class AcountDoesNotExists extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AcountDoesNotExists(String message) {
		super(message);
	}
}
