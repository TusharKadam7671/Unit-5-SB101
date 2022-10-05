package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter an integer:");
			String s = sc.nextLine();
			int n = Integer.parseInt(s);
			System.out.println("The square value is "+n*n);
		}catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		System.out.println("The work has been done successfully");

	}

}
