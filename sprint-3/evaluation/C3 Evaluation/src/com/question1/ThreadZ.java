package com.question1;

public class ThreadZ extends Thread{
	
	Y y1;
	Z z1;
	
	
	public ThreadZ(Y y1, Z z1) {
		super();
		this.y1 = y1;
		this.z1 = z1;
	}
	
	@Override
	public void run() {

		z1.funZ(y1);
	}

}
