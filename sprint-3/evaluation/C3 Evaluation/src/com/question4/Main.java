package com.question4;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		//giving names to the threads
		t1.setName("Kohli");
		t2.setName("Dhoni");
		t3.setName("Rohit");
		
		//setting max priority to Dhoni thread
		t2.setPriority(10);
		
		
		//using join- suspending threads conditionally.
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t1.start();
		
	
		
		

	}

}
