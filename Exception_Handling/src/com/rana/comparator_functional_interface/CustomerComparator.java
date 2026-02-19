package com.rana.comparator_functional_interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerComparator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size :");
			int size=Integer.parseInt(sc.next());
			Customer [] customer =new Customer[size];
			
			for (int i = 0; i < customer.length; i++) 
			{
				System.out.println("Enter the id :");
				Integer id=Integer.parseInt(sc.next());
				System.out.println("Enter the name :");
				String name=sc.next();
				sc.nextLine();
				System.out.println("Enter the Bill : ");
				Double bill=Double.parseDouble(sc.next());
				customer[i]=new Customer(id, name, bill);
			}
			
			for(Customer customer2:customer)
			{
				System.out.println(customer2);
			}
			
			//Anonymous inner class
			Comparator<Customer> cmpId = new Comparator<Customer>() 
			{
				public int compare(Customer s1, Customer s2)
				{
					return Integer.compare(s1.id(), s2.id());
				}
			};
			Arrays.sort(customer,cmpId);
			
			System.out.println("Sorted based on id :");
			for(Customer customer2:customer)
			{
				System.out.println(customer2);
			}
			
			//Lambda Approach
			Comparator<Customer> cmp1=(c1,c2)->c1.name().compareTo(c2.name());
			Arrays.sort(customer,cmp1);
			
			System.out.println("Sorted based on the name :");
			
			for(Customer customer2:customer)
			{
				System.out.println(customer2);
			}
			
			//Assigning lambda to comparator
			
			System.out.println("Sorted based on bill");
			
			Arrays.sort(customer,(c1,c2)->c1.bill().compareTo(c2.bill()));
			
			for (Customer customer2 : customer) 
			{
				System.out.println(customer2);
			}
		}

	}

}
