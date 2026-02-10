package com.rana.exception_hjandling;

public class SpecificTypeException {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try 
		{
			int x=10/0;
			System.out.println(x);
		} 
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main method ended");

	}

}
