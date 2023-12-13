package com.bank.web.exception;

public class InvalideJwtTokenException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalideJwtTokenException(String message) {
		super(message);
	}
	
}
