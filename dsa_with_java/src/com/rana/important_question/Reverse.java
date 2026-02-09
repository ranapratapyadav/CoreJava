package com.rana.important_question;

public class Reverse {
	public static void main(String[] args)
	{
		int n=12357;
		int rev=0;
		
		while(n!=0)
		{
			rev=(rev*10)+n%10;
			n/=10;
		}
		System.out.println(rev);
	}
}
