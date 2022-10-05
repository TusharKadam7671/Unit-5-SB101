package com.question1;

public class ThreadA extends Thread{
	
	int product=1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (this) {	//<-- synchronized
			
			for(int i=1; i<=10; i++)
			{
				product=product*i;
			}
			
			this.notify(); //<--notify.
		}
		
	}

}
