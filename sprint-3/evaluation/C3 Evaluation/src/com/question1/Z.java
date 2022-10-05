package com.question1;

public class Z {

	public synchronized  void funZ(Y y1) {
		// TODO Auto-generated method stub
		
		y1.fun1();
	}

	public synchronized void fun2() {
		// TODO Auto-generated method stub
		System.out.println("inside fun2 of Z");
	}

}
