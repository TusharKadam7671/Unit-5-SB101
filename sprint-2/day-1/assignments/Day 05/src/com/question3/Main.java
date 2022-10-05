package com.question3;

public class Main {
	
	public int StringToNumber(String s)
	{
		
		return Integer.parseInt(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		
		X x = m :: StringToNumber;
		int result = x.convetStringToNumber("100");
		System.out.println(result+300);

	}

}
