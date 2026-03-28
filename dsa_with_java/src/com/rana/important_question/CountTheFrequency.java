package com.rana.important_question;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Write a program in java to count the frequency of each element of an array. 

Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 25
element - 1 : 12
element - 2 : 43


Expected Output :
The frequency of all elements of an array :
25 occurs 1 times
12 occurs 1 times
43 occurs 1 times

 */

//public class CountTheFrequency {
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Enter the size of the array");
//		Scanner sc=new Scanner(System.in);
//		if(!sc.hasNextInt())return;
//		
//		int size=sc.nextInt();
//		int []arr=new int[size];
//		boolean[]visited=new boolean[size];
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("Enter the element of the array");
//			arr[i]=sc.nextInt();
//		}
//		
//		for (int i = 0; i < size; i++) 
//		{
//			if(visited[i])
//			{
//				continue;
//			}
//			int count=1;
//			for (int j = i+1; j < size; j++) 
//			{
//				if(arr[i]==arr[j])
//				{
//					visited[j]=true;
//					count++;
//				}
//			}
//			System.out.println(arr[i]+" occurs "+count+" times");
//		}
//		
//
//	}
//
//}

//Using map 

public class CountTheFrequency
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array.");
			if(!sc.hasNextInt())return;
			int size=sc.nextInt();
			int []arr=new int[size];
			Map<Integer,Integer>map=new LinkedHashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println("Enter the element of the array.");
				if(sc.hasNextInt())
				{
					
					arr[i]=sc.nextInt();
					map.put(arr[i],map.getOrDefault(arr[i],0)+1);
				}
			}
			
			System.out.println("The frequency of the each element of the array");
			for(Map.Entry<Integer, Integer>entry:map.entrySet())
			{
				System.out.println(entry.getKey()+" occurs"+entry.getValue()+" times");
			}
		}
		
	}
}























