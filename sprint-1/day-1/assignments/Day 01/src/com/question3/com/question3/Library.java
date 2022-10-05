package com.question3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for members
		
		HashSet<AdditionalMembers> hs = new HashSet<>();
		
		hs.add(new AdditionalMembers(1,"n1",01,28));
		hs.add(new AdditionalMembers(2,"n2",02,05));
		hs.add(new AdditionalMembers(3,"n3",03,19));
		hs.add(new AdditionalMembers(4,"n4",04,26));
		hs.add(new AdditionalMembers(5,"n5",05,12));
		hs.add(new AdditionalMembers(6,"n6",06,11));
		
		TreeSet<AdditionalMembers> set = new TreeSet<>(hs);
		
		for(AdditionalMembers s : set)
		{
			System.out.println(s);
		}
		
		System.out.println("--------------------------------------------------");
		
		LinkedHashSet<Books> books = new LinkedHashSet<>();
		
		books.add(new Books(1, "b1", "author1"));
		books.add(new Books(2, "b2", "author2"));
		books.add(new Books(4, "b1", "author1"));
		books.add(new Books(3, "b3", "author3"));
		books.add(new Books(1, "b1", "author1"));
		
		for(Books b : books)
		{
			System.out.println(b);
		}

	}

}
