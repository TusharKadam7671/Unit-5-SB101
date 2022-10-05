package com.question2;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			
			System.out.println("Roll is: "+s.getRoll());
			System.out.println("Name is: "+s.getName());
			System.out.println("Marks is: "+s.getMarks());
		};
		
		c.accept(new Student(10, "Amit", 521));
		
	}

}

/*
op-

Roll is: 10
Name is: Amit
Marks is: 521


*/