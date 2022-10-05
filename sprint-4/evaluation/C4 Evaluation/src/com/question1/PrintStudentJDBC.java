package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrintStudentJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course name");
		String cname = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/examdb";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "groot")) {
			
			PreparedStatement ps = conn.prepareStatement("select Student.roll,Student.name, Student.address, Student.mobile from Student inner join Course inner join Student_Course  on student.roll=Student_Course.roll AND Course.cid=Student_Course.cid  where Course.cname=?");
			
			ps.setString(1, cname);
			
			ResultSet rs = ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next())
			{
				flag=false;
				
				
				System.out.println("Details : ");
				int roll = rs.getInt("roll");
				System.out.println("Student roll: "+roll);
				String name = rs.getString("name");
				System.out.println("Student name: "+name);
				
				String address = rs.getString("address");
				System.out.println("Student address: "+address);
				String mobile = rs.getString("mobile");
				System.out.println("Student mobile no: "+mobile);
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


