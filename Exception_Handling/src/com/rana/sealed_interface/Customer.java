package com.rana.sealed_interface;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		
		
		try(Scanner sc=new Scanner(System.in);)
		{
		System.out.println("Enter your total bill Amount :");
		double totalAmount=sc.nextDouble();
		ShoppingCart sp=new ShoppingCart(totalAmount);
		
		while(true)
		{
			
			System.out.println("1. Credit Card Payment\n2. DebitCard Payment\n3. UPI Payment\n4. Exit");
			System.out.println("Enter your Choice ::");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				CreditCard cpay=new CreditCard(IO.readln("Enter AC Holder Name"));
				sp.checkOut(cpay);
				sp.cancelOrder(cpay);
				break;
				
			case 2:
				
				DebitCard dpay=new DebitCard(IO.readln("Enter Bank Name"));
				sp.checkOut(dpay);
				sp.cancelOrder(dpay);
				break;
				
			case 3:
				UPI upay=new UPI(IO.readln("Enter UPI ID::"));
				sp.checkOut(upay);
				sp.cancelOrder(upay);
				break;
			case 4:
				System.out.println("Application Ended!!");
				System.exit(0);
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}


}
