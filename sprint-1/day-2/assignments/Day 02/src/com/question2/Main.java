package com.question2;


import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Student, String> hm = new TreeMap<>(new StudentComMarks());
		//without this new StudentComMarks we will get class cast exception.
		
		hm.put(new Student(1,"Tushar",99), "Maharashtra");
		hm.put(new Student(4,"Sundar",68), "Gujrat");
		hm.put(new Student(3,"Ravindra",76), "Punjab");
		
		for(Map.Entry<Student,String> me:hm.entrySet()){
			
//			System.out.println(me.getKey()+" "+me.getValue());
			
			
			System.out.println("State: "+me.getValue());
			
			
			System.out.println("Student Details: ");
			System.out.println("Roll No.: "+me.getKey().getRoll());
			System.out.println("Name: "+me.getKey().getName());
			System.out.println("Marks: "+me.getKey().getMarks());
			
			System.out.println("-----------------------------");
			
			}
		

	}

}
