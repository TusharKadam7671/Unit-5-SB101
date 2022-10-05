package com.question2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"student1",850));
		students.add(new Student(11,"student2",450));
		students.add(new Student(12,"student3",555));
		students.add(new Student(13,"student4",950));
		students.add(new Student(14,"student5",480));
		
		Student max = students.stream()
								.max( (s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1)
									.get();
		
		System.out.println(max);

	}

}
