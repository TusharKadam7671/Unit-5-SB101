package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DetailsJDBC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student roll no");
		int roll = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/examdb";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "groot")) {
			
			PreparedStatement ps = conn.prepareStatement("select Student.name, Course.cid,Course.cname,Course.fee,Course.duration from Student inner join Course inner join Student_Course on student.roll=Student_Course.roll AND Course.cid=Student_Course.cid where Student.roll=?");
			
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next())
			{
				flag=false;
				
				String name = rs.getString("name");
				System.out.println("Student Name: "+ name);
				System.out.println("Course Details: ");
				int cid = rs.getInt("cid");
				System.out.println("Course id: "+cid);
				String cname = rs.getString("cname");
				System.out.println("Course name: "+cname);
				int fee = rs.getInt("fee");
				System.out.println("Course fee: "+fee);
				String duration = rs.getString("duration");
				System.out.println("Duration of course: "+duration);
				System.out.println("------");
			}
			
			if(flag)
			{
				System.out.println("No record found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
