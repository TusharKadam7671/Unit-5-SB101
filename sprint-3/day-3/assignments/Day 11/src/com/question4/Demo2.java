package com.question4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("studentdata.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		List<Student> list = (List)ois.readObject();
		
		System.out.println(list);
		
		list.forEach(s -> System.out.println(s));


	}

}
