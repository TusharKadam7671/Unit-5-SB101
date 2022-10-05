package com.question3;

public class CashPayment implements Payment{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Cash "+amount);
		
	}
	
	private int amount;
	
	public CashPayment(int i) {
		// TODO Auto-generated constructor stub
		
		amount = i;
	}

}
