package com.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<? super Student> fun(List<? super Student> list)
	{
		System.out.println("inside fun");
		
		for(Object p : list)
		{
			System.out.println(p);
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> students = Arrays.asList(
				
				new Student(12, "n1", 500),
				new Student(10,"n2", 600)
							
				
				);
		
		List<Student> students2 = new ArrayList<>();
		
		List<Person> persons = Arrays.asList(
				
				new Person(22,"p1",124),
				new Person(14,"p2", 568)
				
				);
		
		List<? super Student> list = fun(students);
		System.out.println(list);
		
		System.out.println("-------------------------------");
		
		List<? super Student> list2 =fun(persons);
		System.out.println(list2);
		
		System.out.println("------using scanner------");
		
		System.out.println("Enter student details");
		
		
		
		while(true)
		{
			System.out.println("Enter roll number");
			int roll = sc.nextInt();
			
			System.out.println("Enter name");
			String name = sc.next();
			
			System.out.println("Enter marks");
			int marks = sc.nextInt();
			Student s = new Student(roll,name,marks);
			students2.add(s);
			
			System.out.println("Do you want to add more students? y/n ?");
			String ans = sc.next();
			if(ans.contains("n"))
			{
				break;
			}
		}
		
		List<? super Student> list3 = fun(students2);
		System.out.println(list3);
		
		
		

	}

}
