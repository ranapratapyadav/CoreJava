package com.rana.comparable_function_interface;

import java.util.Arrays;
import java.util.Scanner;

public class StudentComparable {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size of the array :");
			int size=Integer.parseInt(sc.next());
			Student[] std=new Student[size];
			
			for(int i=0;i<std.length;i++)
				
			{
				System.out.println("Enter the id :");
				Integer id =Integer.parseInt(sc.next());
				System.out.println("Enter the Student name :");
				String name=sc.next();
				sc.nextLine();
				System.out.println("Enter the marks");
				Double marks=Double.parseDouble(sc.next());
				std[i]=new Student(id, name, marks);
				
			}
			System.out.println("Original data : ");
			for(Student student:std)
			{
				System.out.println(student);
			}
			
			Arrays.sort(std);
			System.out.println("Employee data sorted based on Id");
			for(Student student :std)
			{
				System.out.println(student);
			}
		}

	}

}
