package com.rana.sealed_interface;

public class ShoppingCart {
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}


	public void checkOut(Payment pay)
	{
		System.out.println("Starting checkout for amount RS :"+totalAmount);
		pay.makePayment(totalAmount);
	}
	
	public void cancelOrder(Payment pay)
	{
		System.out.println("Order Canceled. Initiating Refund...\nCancelling order for amount Rs : "+totalAmount);
		pay.makeRefund(totalAmount);
		
	}

	
	
}

