package com.question2;

import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Student> s = () -> new Student(1, "name1", 500);

		Student st = s.get();
		System.out.println("Roll: "+st.getRoll());
		System.out.println("Name: "+st.getName());
		System.out.println("Marks: "+st.getMarks());
	}

}
