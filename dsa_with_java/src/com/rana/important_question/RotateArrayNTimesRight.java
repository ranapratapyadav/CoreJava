package com.rana.important_question;

import java.util.Scanner;

public class RotateArrayNTimesRight 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arr.");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the element of the arr.");
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the number of iterator.");
		int k=sc.nextInt();
		k=k%size;
		
		
		int []newArray=new int[size];
		int index=0;
		
		for (int i = size-k; i <size; i++) 
		{
			newArray[index++]=arr[i];
		}
		
		for (int i = 0; i < size-k; i++) 
		{
			newArray[index++]=arr[i];
		}
		
		for (int i = 0; i < size; i++) 
		{
			System.out.println(newArray[i]+" ");
		}
		
		
	}
}
