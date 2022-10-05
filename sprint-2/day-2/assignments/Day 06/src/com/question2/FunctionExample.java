package com.question2;

import java.util.function.Function;


public class FunctionExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,String> f1 = i -> "The number is: "+i;
		System.out.println(f1.apply(18));	//op- The number is: 18
		
		Function<String,Integer> f2 = s -> Integer.parseInt(s);
		System.out.println(f2.apply("100")+200);	//op- 300
		
		Function<String,Integer> f3 = Integer :: parseInt;
		System.out.println(f3.apply("400")+260); 	//op- 660
		
		//----------------------------------------------------//
		
		//getting student object and returning greeting message with student name
		
		Function<Student,String> f4 = s -> "Welcome "+s.getName().toUpperCase();
		String msg = f4.apply(new Student(17, "Tushar", 596));
		System.out.println(msg);	//op- Welcome TUSHAR

	}

}
