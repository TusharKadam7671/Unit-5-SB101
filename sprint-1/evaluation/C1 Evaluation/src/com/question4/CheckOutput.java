package com.question4;

public class CheckOutput {
	
	public static void main(String args[])
	{
		try
		{
		System.out.print("A");
		int num = 99/0;
		System.out.print("B");
		}
		catch(ArithmeticException ex)
		{
		System.out.print("C");
		}
		catch(Exception ex)
		{
		System.out.print("D");
		}
		System.out.print("E");
		}

}

/* Answer-

Output is - ACE

This is problem is based on exception handling.

first A is printed because prior that statement there is not any type of error
and since letter A is printed without any exception.

B is not printed because on line number 10, there is arithmetic operation and in that
number 99 is going to divide by zero so there will be a ArithmeticException so flow of
program instead of going to print letter B goes to exception handling catch block of 
Arithmetic exception and from that block letter C is printed

Since exception is handled by first catch block of Arithmetic exception, control will
not come to its parents catch block i.e. Exception ex block, so letter D is not printed

and there is no any type of unhandled exception, control comes to last line of the program
where letter E is printed.

first line print A and last line print E executed correctly so there is correct exception 
handling is done and program worked smoothly.

*/
