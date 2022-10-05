package com.question4;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	
		System.out.println("Thread: "+Thread.currentThread().getName());
		
		
		int sum=0;
		
		for(int i=1; i<=20; i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Addition of first 20 numbers is: "+sum);
	}

}
