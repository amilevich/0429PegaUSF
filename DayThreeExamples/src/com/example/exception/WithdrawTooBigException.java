package com.example.exception;

public class WithdrawTooBigException extends Exception {

	public WithdrawTooBigException() {
	}
	
	public WithdrawTooBigException(String message) {
		super(message);
	}
	
	public WithdrawTooBigException(String message, Throwable cause) {
		super(message, cause);
	}
}
