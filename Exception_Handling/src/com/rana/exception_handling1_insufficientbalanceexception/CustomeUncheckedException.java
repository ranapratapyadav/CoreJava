package com.rana.exception_handling1_insufficientbalanceexception;

import java.util.Scanner;

public class CustomeUncheckedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your balance:");
		double bankBalance=sc.nextDouble();
		try(sc)
		{
			if(bankBalance<10000)
			{
				throw new InsufficientBalanceException("Insufficient Balance :");
			}
			else 
			{
				System.out.println("Withdraw SuccessFully:");
			}
		}
		
		catch (InsufficientBalanceException e) 
		{
			e.printStackTrace();
		}

	}

}
