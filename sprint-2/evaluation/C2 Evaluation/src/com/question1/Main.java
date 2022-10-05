package com.question1;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		while(true)
		{
			System.out.println("1.Add Book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Search book by ISBN");
			System.out.println("5.Exit");
			
			try {
			String ans = sc.nextLine();
			
			if(ans.contains("5"))
			{
				
				break;
			}else if(ans.contains("1"))
			{
				System.out.println("Enter the isbn no:");
				int isbn = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the book name:");
				String name = sc.nextLine();
				System.out.println("Enter the autor name:");
				String author = sc.nextLine();
				try {
					library.addBook(new Book(isbn, name, author));
					System.out.println("Book added successfully");
					System.out.println("----------------");
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("----------------");
					
				}
			}else if(ans.contains("2"))
			{
				try {
					List<Book> list = library.viewAllBooks();
					list.forEach(s -> 
					{
						System.out.println("ISBN no: "+s.getIsbn());
						System.out.println("Book name: "+s.getBookName());
						System.out.println("Author name :"+s.getAuthor());
						
						System.out.println("----------------");
						
					});
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("----------------");
				}
			}else if(ans.contains("3"))
			{
				System.out.println("Enter the author name");
				String author = sc.nextLine();
				
				try {
					List<Book> list = library.viewBooksByAuthor(author);
					list.forEach(s -> 
					{
						System.out.println("ISBN no: "+s.getIsbn());
						System.out.println("Book name: "+s.getBookName());
						System.out.println("Author name :"+s.getAuthor());
						
						System.out.println("----------------");
						
					});
					
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("----------------");
				}
			}else if(ans.contains("4"))
			{
				System.out.println("Enter the isbn no:");
				int isbn = Integer.parseInt(sc.nextLine());
				try {
					Book book = library.getbookByISBN(isbn);
					System.out.println("ISBN no: "+book.getIsbn());
					System.out.println("Book name: "+book.getBookName());
					System.out.println("Author name :"+book.getAuthor());
					System.out.println("----------------");
					
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("----------------");
				}
			}
			
			}catch(Exception e)
			{
				System.out.println("----Wrong inputs----");
				
			}
			
			
		}
		
	
		System.out.println("Thank you..!!");
		
	}

}
