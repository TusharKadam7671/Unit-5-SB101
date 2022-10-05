package com.question4;

public class ThreadC extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Thread: "+Thread.currentThread().getName());
		

		int product =1;
		
		for(int i=1; i<=10; i++)
		{
			product=product*i;
		}
		
		System.out.println("Product is: "+product);
	}
	

}
