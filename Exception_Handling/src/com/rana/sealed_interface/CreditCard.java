package com.rana.sealed_interface;


public final class CreditCard implements Payment {

	private String cardHolderName;

	public CreditCard(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :" + amount + " using Credit Card Holder : " + cardHolderName);

	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS :" + amount + " to Credit Card Holder : " + cardHolderName);

	}

}

