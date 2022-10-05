package com.question3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
	
	int num;
	
	

	public MyCallable(int num) {
		super();
		this.num = num;
	}



	@Override
	public Object call() throws Exception {
		
		int product=1;
		
		for(int i=1; i<=num; i++)
		{
			product=product*i;
		}
		
		return product;
	}

}
