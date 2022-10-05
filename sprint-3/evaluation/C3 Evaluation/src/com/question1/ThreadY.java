package com.question1;

public class ThreadY extends Thread{

	
	Y y1;
	Z z1;
	
	
	public ThreadY(Y y1, Z z1) {
		super();
		this.y1 = y1;
		this.z1 = z1;
	}
	
	@Override
	public void run() {

		y1.funY(z1);
		
	}
	
	
}
