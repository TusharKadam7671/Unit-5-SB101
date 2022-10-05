package com.question4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "name1", 60, new Address("Maharashtra","Mumbai",415407)));
		list.add(new Student(2, "name2", 70, new Address("Bihar","Patna",415407)));
		list.add(new Student(3, "name3", 80, new Address("Goa","Panaji",415407)));
		list.add(new Student(4, "name4", 90, new Address("Tamil Nadu","Chennai",415407)));
		list.add(new Student(5, "name5", 100, new Address("Telangana","Hyderabad",415407)));
		
		FileOutputStream fos=new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		oos.close();
		
		System.out.println("done");


		
	}

}
