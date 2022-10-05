package com.question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date of Birth in dd-MM-yyyy format");
		
		String dob = sc.nextLine();
		
		try
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate ld = LocalDate.parse(dob,dtf);
			LocalDate currentDate = LocalDate.now();
			
			if(currentDate.isBefore(ld))
			{
				System.out.println("Date should not be in Future");
			}else
			{
				System.out.println("Age is : "+ChronoUnit.YEARS.between(ld, currentDate));
			}
			
		}catch(DateTimeParseException e)
		{
			System.out.println("Please enter the date in correct format");
		}

	}

}
