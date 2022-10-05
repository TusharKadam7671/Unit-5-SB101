package com.question3;

public class CardPayment implements Payment{
	
	private int amount;

	public CardPayment(int i) {
		// TODO Auto-generated constructor stub
		
		amount = i;
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment done using Card "+amount);
		
	}

}
