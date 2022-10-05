package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CourseJDBC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Course details you want to insert");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter cid");
			int cid = sc.nextInt();
			
			System.out.println("Enter cname");
			String cname=sc.next();
			
			System.out.println("Enter fee");
			int fee = sc.nextInt();
			
			System.out.println("Enter duration");
			String duration = sc.next();
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/examdb";
			
			try(Connection conn = DriverManager.getConnection(url, "root", "groot")) {
				
				PreparedStatement ps = conn.prepareStatement("insert into Course values(?,?,?,?)");
				
				ps.setInt(1, cid);
				ps.setString(2, cname);
				ps.setInt(3, fee);
				ps.setString(4, duration);
				
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
