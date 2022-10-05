package com.question5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Deserialization
		
		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> list = (List) ois.readObject();
		
		
		//printing list
		list.forEach(s -> System.out.println(s));
		
		
		//adding one more student
		
		list.add(new Student(6, "name6", 100, "n6@123", "6666", new Address("Madhya Pradesh", "Bhopal", "754236")));
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.close();
		
		
		//printing list
		System.out.println();
		System.out.println("-----------after adding one more student--------------");
		
		FileInputStream fis2 = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		
		List<Student> list2 = (List) ois2.readObject();
		
		list2.forEach(s -> System.out.println(s));

	}

}
