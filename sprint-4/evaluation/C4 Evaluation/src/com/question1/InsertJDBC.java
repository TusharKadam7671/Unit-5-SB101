package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students details you want to insert");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter roll no");
			int roll = sc.nextInt();
			
			System.out.println("Enter name");
			String name=sc.next();
			
			System.out.println("Enter address");
			String address = sc.next();
			
			System.out.println("Enter mobile no");
			String mobile = sc.next();
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/examdb";
			
			try(Connection conn = DriverManager.getConnection(url, "root", "groot")) {
				
				PreparedStatement ps = conn.prepareStatement("insert into Student values(?,?,?,?)");
				
				ps.setInt(1, roll);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setString(4, mobile);
				
				int x = ps.executeUpdate();
				
				if(x>0)
				{
					System.out.println("Details inserted");
				}else
				{
					System.out.println("Not inserted");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	

	}

}
