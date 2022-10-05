package com.question6;

import java.security.Provider.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCallable[] jobs = {
				
				new MyCallable(1),
				new MyCallable(2),
				new MyCallable(3),
				new MyCallable(4),
				new MyCallable(5),
				new MyCallable(6),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallable job : jobs)
		{
			Future f = service.submit(job);
			
			try {
				
				System.out.println(f.get());
				
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();

	}

}
