package com.question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA t = new ThreadA();
		
		t.start();
		
		synchronized (t) {
			
			try {
				
				t.wait();		//<--wait
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Product of first 10 natural numbers is: "+t.product);

	}

}
