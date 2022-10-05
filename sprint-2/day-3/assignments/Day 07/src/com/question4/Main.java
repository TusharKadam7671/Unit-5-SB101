package com.question4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> students = new TreeSet<>( (s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
		
		students.add(new Student(10,"a",450));
		students.add(new Student(10,"b",300));
		students.add(new Student(12,"c",880));
		students.add(new Student(13,"d",350));
		students.add(new Student(14,"e",770));
		
		Set<Student> filtered = students.stream()
										.filter( s -> s.getMarks() < 500 )
										.collect(Collectors.toSet());
		
		System.out.println(filtered);
		
		Set<Student> withoutDuplicates = filtered.stream()
												 .collect(Collectors.toCollection( () -> new TreeSet<>(Comparator.comparing(Student :: getRoll))));
		
		System.out.println(withoutDuplicates);

	}

}
