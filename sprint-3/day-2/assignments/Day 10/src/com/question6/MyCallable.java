package com.question6;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
	
	int num;
	
	public MyCallable(int num)
	{
		this.num=num;
		
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		if(num % 2 == 0)
		{
			return "Even Number";
		}else
		{
			return "Odd Number";
		}
	}

}
