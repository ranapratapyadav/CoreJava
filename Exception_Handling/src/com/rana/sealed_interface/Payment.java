package com.rana.sealed_interface;

public sealed interface Payment permits DebitCard,CreditCard,UPI {
	void makePayment(double amount);
	 void makeRefund(double amount);
	    
}
