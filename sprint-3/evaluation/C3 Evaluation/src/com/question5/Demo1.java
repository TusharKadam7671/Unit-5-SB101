package com.question5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "name1", 50, "n1@123", "1111", new Address("Maharashtra", "Mumbai", "415401")));
		list.add(new Student(2, "name2", 60, "n2@123", "2222", new Address("Bihar", "Patna", "569412")));
		list.add(new Student(3, "name3", 70, "n3@123", "3333", new Address("Goa", "Panaji", "485621")));
		list.add(new Student(4, "name4", 80, "n4@123", "4444", new Address("Tamil Nadu", "Chennai", "785109")));
		list.add(new Student(5, "name5", 90, "n5@123", "5555", new Address("Maharashtra", "Pune", "329445")));
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.close();
		
		System.out.println("Done");

	}

}
