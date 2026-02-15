package com.rana.sealed_interface;

public final class UPI implements Payment {

	private String UPIid;
	public UPI(String uPIid) {
		super();
		UPIid = uPIid;
	}
	
	@Override
	public void makePayment(double amount) {
		
		System.out.println("Paid RS "+amount+" using UPI ID : "+UPIid);

	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS "+amount+" to UPI ID : "+UPIid);

	}

	

}
