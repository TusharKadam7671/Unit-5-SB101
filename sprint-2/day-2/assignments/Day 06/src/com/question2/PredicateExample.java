package com.question2;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test() method
				Predicate<Integer> p = i -> i > 0;
				
				System.out.println(p.test(10));		//true
				System.out.println(p.test(-10));	//false

	}

}
