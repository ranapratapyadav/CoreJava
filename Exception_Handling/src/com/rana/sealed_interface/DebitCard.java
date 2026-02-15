package com.rana.sealed_interface;

public final class DebitCard implements Payment {

	private String bankName;
	
	public DebitCard(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	
	
	@Override
	public void makePayment(double amount) 
	{
		System.out.println("Paid RS :"+amount+ "using Debit Card Bank: "+bankName);

	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS :"+amount+ "to Debit Card Bank: "+bankName);

	}

	

}
