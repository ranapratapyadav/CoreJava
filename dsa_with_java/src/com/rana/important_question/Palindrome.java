package com.rana.important_question;

public class Palindrome {

	public static void main(String[] args) {
		int n=121;
		int rev=0;
		int temp=n;
		
		while(n!=0)
		{
			rev=(rev*10)+n%10;
			n/=10;
		
		}
		
		if(temp==rev)
		{
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
