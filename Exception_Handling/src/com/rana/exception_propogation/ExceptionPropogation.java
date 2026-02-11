package com.rana.exception_propogation;

public class ExceptionPropogation {

	public static void main(String[] args) 
	{
		System.out.println("Main method starte:");
		m1();
		System.out.println("Main method ended:");

	}
	
	public static void m1()
	{
		System.out.println("M1 method started:");
		m2();
		System.out.println("M1 method ended:");
	}
	
	public static void m2()
	{
		System.out.println("M2 method stated:");
		IO.print(10/0);
		System.out.println("M2 method ended:");
	}

}
