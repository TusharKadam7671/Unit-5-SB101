package com.question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA t = new ThreadA();
		
		t.start();
		
		synchronized (t) {
			
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Product of 1 to 10 number is: "+t.num);
		}

	}

}
