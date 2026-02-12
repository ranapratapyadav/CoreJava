package com.rana.exception_handling1;

import java.util.Arrays;

/*
 Problem Description
Write a Java program that demonstrates how to handle ArrayStoreException. 
The program should include a method that attempts to store objects of incompatible types into an array of String[]. 
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named ArrayStoreExample:

-> Implement a static method storeObjects that:

   Method name : storeObjects
   Access modifiers : public
   Non-Access modifier : static
   Return type : void

   Initializes an Object array of type String[] with a size of 5.
   Attempts to store objects of different types (String, Integer, etc.) into the array using array indexing.
   Throws an ArrayStoreException if an attempt is made to store an object that is not compatible with String.

-> Implement the main method:

   Inside the main method, call the storeObjects method with different objects, including objects of incompatible types.
   Use a try-catch block to catch and handle any ArrayStoreException thrown by storeObjects method.
   Print an appropriate error message when an incompatible object type is attempted to be stored in the array.


TEST CASE 1 :
-------------
Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = "Java";    // Storing another String
Output as :
Objects stored successfully.

TEST CASE 2 :
-------------

Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = 123;       // Trying to store an Integer in a String array

Output as :
ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String

Examples
Example 1
Input:
Enter number of elements: 3
Enter value 1: Hello
Enter value 2: World
Enter value 3: Java
Output:
Objects stored successfully.
 */

class ArrayStoreExample
{
	
	public static void storeObject()
	{
//		try
//		{
//		Object[] arr = new String[3];
//		arr[0]="Rana";
//		arr[1]="Rahul";
//		arr[2]=90;
//		System.out.println(Arrays.toString(arr));
//		}
//		catch(ArrayStoreException e)
//		{
//			System.out.println("Data type is not matched:");
//			e.printStackTrace();
//		}
		
		try
		{
		Object[] arr = new String[3];
		arr[0]="Rana Paratp Yadav";
		arr[1]="Rahul Raj";
		arr[2]="Varsha Gautam";
		System.out.println(Arrays.toString(arr));
		}
		catch(ArrayStoreException e)
		{
			System.out.println("Data type is not matched:");
			e.printStackTrace();
		}
		
		
		

	}
}

public class HandlingArrayStoreException 
{
	public static void main(String[] args) 
	{
		ArrayStoreExample.storeObject();
	}
}
