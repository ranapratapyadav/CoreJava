package com.rana.important_question;

public class StrongNumberInRange {

	public static void main(String[] args) {
		for(int k=100;k<=1000;k++)
		{
			int n=k;
			int temp=n;
			int sum=0;
			while(n!=0)
			{
				 int digit=n%10;
				 int fact=1;
				 for(int i=1;i<=digit;i++)
				 {
					 fact=fact*i;
				 }
				 sum=sum+fact; 
				 n=n/10;
			}
			if(temp==sum)
			{
				System.out.println(sum+" It is a strong number");
			}
		}

	}

}
