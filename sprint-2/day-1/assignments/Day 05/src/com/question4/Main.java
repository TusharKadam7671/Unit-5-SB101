package com.question4;

import java.util.Arrays;
import java.util.List;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> list = Arrays.asList("Mumbai","Pune","Kollata","Chennai","Delhi");
	
		
		PrintList p = n -> {
			
			for(String l : n)
			{
				System.out.println(l);
			}
			
		};
		
		p.display(list);
		
		

	}

	

}
