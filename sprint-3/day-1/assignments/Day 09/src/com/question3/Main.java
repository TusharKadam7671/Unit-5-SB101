package com.question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA t1 = new ThreadA();
		Thread t2 = new ThreadB(t1);
		
		t1.start();
		t2.start();

	}

}

/*
op-
Even Number : 2
Even Number : 4
Even Number : 6
Even Number : 8
Even Number : 10
Even Number : 12
Even Number : 14
Even Number : 16
Even Number : 18
Even Number : 20
Odd Number :1
Odd Number :3
Odd Number :5
Odd Number :7
Odd Number :9
Odd Number :11
Odd Number :13
Odd Number :15
Odd Number :17
Odd Number :19
*/