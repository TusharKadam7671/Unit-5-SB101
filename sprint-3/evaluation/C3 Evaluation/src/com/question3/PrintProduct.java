package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrintProduct {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyCallable[] job = {
				
				new MyCallable(5),
				new MyCallable(6),
				new MyCallable(7),
				new MyCallable(8),
				new MyCallable(9),
				new MyCallable(10),
				
				
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable p : job)
		{
			Future f = service.submit(p);
			
			System.out.println("Product for number "+p.num+" is "+f.get());
		}

	}

}
