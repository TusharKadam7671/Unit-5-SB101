package com.question7;

public class Main implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Thread Name : "+Thread.currentThread().getName());
			System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main job = new Main();
		
		Thread one = new Thread(job);
		Thread two = new Thread(job);
		
		one.setName("Dhoni");
		two.setName("Kohli");
		
		one.setPriority(8);
		two.setPriority(10);
		
		one.start();
		two.start();
	}

	

}
