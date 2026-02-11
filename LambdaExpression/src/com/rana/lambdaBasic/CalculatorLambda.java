package com.rana.lambdaBasic;
import module java.base;
//import java.util.Scanner;

@FunctionalInterface
interface Calculator
{
	void doSum(int x,int y);
}

public class CalculatorLambda {

	public static void main(String[] args) {
		Calculator cls=(x,y)->System.out.println("Addition  of two number: "+(x+y));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		System.out.print("Enter the second number:");
		int num2=sc.nextInt();
		cls.doSum(num1, num2);
		sc.close();
		

	}

}
