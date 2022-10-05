package com.question3;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		
		ac.accountNumber="152489";
		
		ac.deposit(40000);
		
		try {
			
			double balance = ac.withdraw(8000);
			
			System.out.println("Balance is: "+balance);
			
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}

	}

}
