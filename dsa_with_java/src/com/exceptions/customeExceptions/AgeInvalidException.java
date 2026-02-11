package com.exceptions.customeExceptions;

@SuppressWarnings("serial")
public class AgeInvalidException extends Exception{
	
	public AgeInvalidException(String msg) {
		super(msg);
	}

}
