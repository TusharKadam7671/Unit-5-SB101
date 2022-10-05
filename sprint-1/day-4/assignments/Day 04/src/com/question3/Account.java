package com.question3;

public class Account {
	
	String accountNumber;
	double balance;


	void deposit(int amount)
	{
		this.balance+=amount;
		System.out.println("Amount deposited successfully");
	}
	
	public double withdraw(int amount) throws InsufficientFundsException
	{
		if(amount > balance)
		{
//			throw new InsufficientFundsException("Balance is not sufficient");
			
			InsufficientFundsException ie = new InsufficientFundsException("Balance is not sufficient");
			
			throw ie;
		}else
		{
			this.balance-=amount;
			
			System.out.println(amount+" withdraw successfully");
			
			return this.balance;
		}
		
	}

}
