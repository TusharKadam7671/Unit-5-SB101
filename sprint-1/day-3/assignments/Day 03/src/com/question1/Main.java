package com.question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of  main..");
		
		Scanner sc = new Scanner(System.in);
		
		String message = null;
		
		try {
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();

		
		int num3 = num1 / num2;
		
		if(num3 > 10)
		{
		message = "Welcome to Exception Handling ";
		}
		System.out.println("Message is :"+message.toUpperCase());
		
		}catch(InputMismatchException ime)
		{
			message="Please enter valid number";
			System.out.println("Message is :"+message.toUpperCase());
		}catch(ArithmeticException ae)
		{
			message= "num2 should not be 0";
			System.out.println("Message is :"+message.toUpperCase());
		}catch(NullPointerException ne)
		{
			message= "String value is null";
			System.out.println("Message is :"+message.toUpperCase());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println("end of main");
		

	}

}
