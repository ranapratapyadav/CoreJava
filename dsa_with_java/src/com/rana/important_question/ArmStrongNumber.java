package com.rana.important_question;

public class ArmStrongNumber {
// Hello 
	public static void main(String[] args) {
		int temp=153;
//		int temp=n;
		int temp1=temp;
//		int count=0;
//		while(n!=0)
//		{
//			count++;
//			n=n/10;
//			
//		}
//		System.out.println(count);
		
		int count=(int)Math.log10(temp)+1;
		System.out.println(count);
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
		else
		{
			System.out.println("It is  not a armStrong number");
		}

	}

}
