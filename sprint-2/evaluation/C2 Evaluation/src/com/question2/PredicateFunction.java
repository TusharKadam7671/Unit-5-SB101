package com.question2;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> s =  n -> n.getMarks() < 500;
		
		boolean ans = s.test(new Student(1,"name1", 600));
		System.out.println(ans);	//op- false
		
		boolean ans2 = s.test(new Student(2,"name2", 400));
		System.out.println(ans2);	//op- true
		

	}

}
