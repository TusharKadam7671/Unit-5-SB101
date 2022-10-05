package com.question1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f = new File("abc.txt");
		f.createNewFile();
			
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee name");
		String name = sc.nextLine();
		
		System.out.println("Enter address");
		String address = sc.nextLine();
		
		FileWriter fw = new FileWriter("abc.txt");	//<--
		
		fw.write("Employee Name: "+name);
		
		
		fw.write("\n");
		
		fw.write("Employee Address: "+address);
		
		
		
		fw.flush();		//<--
		
		fw.close();		//<--
		
		System.out.println(f.length());
		System.out.println("done");
		
		

	}

}
