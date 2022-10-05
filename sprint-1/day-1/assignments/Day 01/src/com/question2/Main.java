package com.question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Queue<Product> products = new PriorityQueue<>();
		
		while(true)
		{
			System.out.println("Enter product details:");
			System.out.println("Enter product id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter product name:");
			String name = sc.nextLine();
			
			System.out.println("Enter product price:");
			int price = sc.nextInt();
			
			Product p = new Product(id,name,price);
			products.add(p);
			
			System.out.println("Do you want to add more products? y/n ?");
			String reply = sc.next();
			if(reply.contains("n"))
			{
				break;
			}
			
		}
		
//		while(!products.isEmpty())
//		{
//			System.out.println(products.poll());
//		}
		
		Iterator itr = products.iterator();
		
		while(itr.hasNext()) {
			
			Product p = (Product) itr.next();
			
			System.out.println(p);
			
		}
	}

}
