package com.question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Y y = new Y();
		Z z = new Z();
		
		
		ThreadY t1 = new ThreadY(y, z);
		ThreadZ t2 = new ThreadZ(y, z);
		
		t1.start();
		t2.start();
	}

}
