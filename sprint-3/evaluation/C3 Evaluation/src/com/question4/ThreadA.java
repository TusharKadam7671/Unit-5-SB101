package com.question4;

public class ThreadA extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Thread: "+Thread.currentThread().getName());
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
}
