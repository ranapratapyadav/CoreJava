package com.rana.exception_handling1_Custom_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class AgeValidationException extends Exception
{

	public AgeValidationException() {
		super();
	}

	public AgeValidationException(String errorMessage) {
		super(errorMessage);
	}
	
	 
}

public class CustomCheckedException {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your age");
			int age=sc.nextInt();
			validate(age);
		}
		catch(AgeValidationException e1)
		{
			System.out.println(e1);
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Invalid input.");
		}

	}
	
	public static void validate(int age) throws AgeValidationException
	{
		if(age<18)
		{
			throw new AgeValidationException("Age is invalid.");
		}
		else
		{
			System.out.println("You are eligible for voting.");
		}
	}

}
