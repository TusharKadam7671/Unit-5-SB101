package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a");
		String a = sc.nextLine();
//		int an = sc.nextInt();
		
		System.out.println("Enter number b");
		String b = sc.nextLine();
//		int bn = sc.nextInt();
		
		try
		{
			int an=Integer.parseInt(a);
			int bn=Integer.parseInt(b);
			
			System.out.println("The quotient of "+an+"/"+bn+" = "+an/bn);
			
		}catch(ArithmeticException ae)
		{
			System.out.println("DivideByZeroException caught");
		}catch(NumberFormatException ne)
		{
			System.out.println("NumberFormatException caught");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}

	}

}
