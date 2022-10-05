package com.question5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException
	{
		if(userCountry.equalsIgnoreCase("India"))
//		if(Pattern.matches(userCountry, "India"))
		{
			System.out.println("User registration done successfully");
		}else
		{
			InvalidCountryException ie = new InvalidCountryException("User Outside India cannot be registered");
			throw ie;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your country name");
		String country_name = sc.nextLine();
		
		
		UserRegistration ur = new UserRegistration();
		
		try {
			ur.registerUser(name, country_name);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
