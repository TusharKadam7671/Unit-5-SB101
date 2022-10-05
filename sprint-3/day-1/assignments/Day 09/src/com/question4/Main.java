package com.question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common c = new Common();
		
		//sharing same common object to two thread.
		
		ThreadA t1 = new ThreadA(c, "Ram");
		ThreadB t2 = new ThreadB(c, "Shyam");
		
		t1.start();
		t2.start();

	}

}

/*
if we didn't make fun1() method of Common class then we will get unexpected output
i.e. Welcome
Welcome
Shyam
Ram

but if we made fun1() synchronized then we will get desired output.
i.e.
Welcome
Ram
Welcome
Shyam

*/
