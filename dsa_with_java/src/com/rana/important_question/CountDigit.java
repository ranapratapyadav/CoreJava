package com.rana.important_question;

public class CountDigit {

	public static void main(String[] args) {
		int n=1257891;
//		int count=0;
//		while(n!=0)
//		{
//			count++;
//			n=n/10;
//		}
//		System.out.println(count);
		
		int c=(int)Math.log10(n)+1;
		System.out.println(c);

	}

}
