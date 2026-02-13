package com.exceptions.customeExceptions;

import java.util.Scanner;

public class Tester {
	
		public static void main(String[] args)throws AgeInvalidException {
//			int age=12;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age:");
			int age =sc.nextInt();
			try(sc){
				if(age<18) {
					throw new AgeInvalidException("age must be greater or equal 18.");
				}
				System.out.println("You are eligible.");
				
			}
			catch(AgeInvalidException e) {
				e.printStackTrace();
			}
			
//			System.out.println("Method end");
//			try {
//			}														
//			catch(AgeInvalidException e) {
//				System.out.println(e.getMessage());
//			}
		}

}
