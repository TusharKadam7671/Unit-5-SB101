package com.question3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void doTransactions(List<? extends Payment> list)
	{
		for(Payment p : list)
		{
			p.doPayment();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<CardPayment> list1 = new ArrayList<>();
		
		CardPayment c1 = new CardPayment(8000);
		CardPayment c2 = new CardPayment(7000);
		
		list1.add(c1);
		list1.add(c2);
		doTransactions(list1);
		
		List<CashPayment> list2 = new ArrayList<>();
		
		CashPayment c3 = new CashPayment(6000);
		CashPayment c4 = new CashPayment(9000);
		
		list2.add(c3);
		list2.add(c4);
		doTransactions(list2);

	}

}
