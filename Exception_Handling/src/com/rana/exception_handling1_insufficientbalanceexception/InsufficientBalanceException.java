package com.rana.exception_handling1_insufficientbalanceexception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException
{

	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}
