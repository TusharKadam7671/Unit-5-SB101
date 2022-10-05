package com.question4;

public class Common {
	
	public synchronized  void fun1(String name)
	//if we made this method synchronized then only we will get desired output.
	{
		System.out.println("Welcome");
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name);
	}

}
