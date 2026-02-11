package com.rana.lambdaBasic;

interface Vechile{
	void run();
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		Vechile car=()->System.out.println("Car is runnning");
		car.run();
		Vechile bus=()->System.out.println("Bus is running");
		bus.run();
		Vechile bike=()->System.out.println("Bike is running");
		bike.run();
	}
}
