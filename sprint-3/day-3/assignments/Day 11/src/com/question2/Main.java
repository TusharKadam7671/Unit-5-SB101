package com.question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("abc.txt");
		
		BufferedReader br = new BufferedReader(fr); //reads via other read object
		
		String line = br.readLine();
		
		while( line != null ) //readLine() return null if next line is not available.
		{
			System.out.println(line);
			line=br.readLine();
		}
		

	}

}
