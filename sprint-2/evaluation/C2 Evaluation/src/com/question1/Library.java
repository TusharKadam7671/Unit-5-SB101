package com.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	
	List<Book> booksList = new ArrayList<>();
	
	public void addBook(Book book) throws BookException
	{
		if(booksList.contains(book))
		{
			throw new BookException(" Book is already exist.");
		}else
		{			
			booksList.add(book);
		}
	}

	public List<Book> viewAllBooks() throws BookException
	{
		if(booksList.isEmpty())
		{
			throw new BookException("Booklist is empty");
		}else
		{			
			return booksList;
		}
		
	}
	
	public List<Book> viewBooksByAuthor(String author) throws BookException
	{
		List<Book> newList = new ArrayList<>();
		
		Iterator itr = booksList.iterator();
		while(itr.hasNext())
		{
			Book b = (Book)itr.next();
			if(b.getAuthor().equals(author))
			{				
				newList.add(b);
			}
			
		}
		
		if(newList.isEmpty())
		{
			throw new BookException(" None of the book published by the author "+author);
		}else
		{			
			return newList;
		}
		
	}
	
	public Book getbookByISBN(int isbn) throws BookException
	{
		Book t = null;
		List<Book> newList = new ArrayList<>();
		
		Iterator itr = booksList.iterator();
		while(itr.hasNext())
		{
			Book b = (Book)itr.next();
			if(b.getIsbn() == isbn)
			{				
				t=b;
				newList.add(b);
			}
			
			
		}
		
		if(newList.isEmpty())
		{
			throw new BookException("Book not available");
		}else
		{
			return t;
		}
		
		
		
	}

}
