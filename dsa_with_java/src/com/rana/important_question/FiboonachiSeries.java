package com.rana.important_question;

public class FiboonachiSeries {

	public static void main(String[] args) {
		int n=5;
		int a=0,b=1,c=0;
		for(int i=1;i<=n-1;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		
		System.out.print(c);

	}

}
