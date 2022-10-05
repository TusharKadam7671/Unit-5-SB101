package com.question2;

import java.util.function.Supplier;


public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s1 = () -> "This is lambda expression";
		
		System.out.println(s1.get());	//op- This is lambda expression
		
		//-----------------------------------------------------//
		
		Supplier<Student> s2 = () -> new Student(12, "Tushar", 850);
		
		System.out.println(s2.get());				//op- Student [roll=12, name=Tushar, marks=850]
		System.out.println(s2.get().getName());		//op- Tushar

	}

}
