package com.question2;

import java.util.function.Consumer;

public class ConsumerFunction {
	
	public static void main(String[] args) {
		
		Consumer<Student> s = n -> {
			
			System.out.println("Roll: "+n.getRoll());
			System.out.println("Name: "+n.getName());
			System.out.println("Marks: "+n.getMarks());
		};
		
		s.accept(new Student(1, "name1", 850));
	}

}
