package com.rana.important_question;

public class PalindromeInRange {
	public static void main(String[] args) {
		for(int k=100;k<=1000;k++)
		{
			int n=k;
			int rev=0;
			int temp=n;
			
			while(n!=0)
			{
				rev=(rev*10)+n%10;
				n/=10;
			
			}
			
			if(temp==rev)
			{
				System.out.println(rev+" It is a palindrome");
			}
			
		}
	}
}
