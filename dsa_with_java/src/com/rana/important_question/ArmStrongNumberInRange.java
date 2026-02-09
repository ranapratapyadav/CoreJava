package com.rana.important_question;

public class ArmStrongNumberInRange {

	public static void main(String[] args) {
		for(int k=1;k<=1000;k++)
		{
			int n=k;
			int temp=n;
			int temp1=n;
			int count=0;
			while(n!=0)
			{
				count++;
				n=n/10;
				
			}
			//System.out.println(count);
			int sum=0;
			while(temp!=0)
			{
				int digit=temp%10;
				sum=sum+(int)Math.pow(digit, count);
				temp=temp/10;
				
			}
			if(temp1==sum)
			{
				System.out.println(sum+" It is a armstrong number");
			}
		}
	}

}
