package com.question3;

public class ThreadA extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1; i<=20; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Number : "+i);
			}
		}
	}

}
