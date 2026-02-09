package com.rana.important_question;

public class PrimeInRange {

	public static void main(String[] args) {
		for(int k=1;k<=1000;k++)
		{
			int n=k;
			int count =0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
					
			}
			if(count==2)
			{
				System.out.println(n+" It is a prime number");
			}
			
		}

	}

}
