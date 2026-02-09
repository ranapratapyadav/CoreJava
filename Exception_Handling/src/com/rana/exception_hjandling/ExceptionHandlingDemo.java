package com.rana.exception_hjandling;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter the first number:");
			int a=sc.nextInt();
			System.out.print("Enter the second number:");
			int b=sc.nextInt();
			System.out.println("First number is : "+a);
			System.out.println("First number is : "+b);
			

			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		
	
	}

}
