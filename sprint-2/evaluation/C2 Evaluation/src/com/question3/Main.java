package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Name1",565,"Pune"));
		students.add(new Student(2,"Name2",360,"Chennai"));
		students.add(new Student(3,"Name3",745,"Delhi"));
		students.add(new Student(4,"Name4",440,"Mumbai"));
		students.add(new Student(5,"Name5",600,"Kolkata"));
		
		List<Employee> filtered =  students.stream()
											.filter(s -> s.getMarks() > 500)
											.map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks()*10000, s.getAddress()))
											.collect(Collectors.toList());
		
		
		filtered.forEach(s -> System.out.println(s));
		
	}

}
