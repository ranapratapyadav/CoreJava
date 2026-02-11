package com.rana.lambdaBasic;
import module java.base;
@FunctionalInterface

interface Length
{
	int getLength(String str);
}


public class LambdaDemo2 {

	public static void main(String[] args) {
		
		Length lht=str->str.length();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str1=sc.nextLine();
		int result=lht.getLength(str1);
		System.out.println("The length of string is : "+result);
		sc.close();

	}

}
