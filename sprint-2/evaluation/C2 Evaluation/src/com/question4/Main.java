package com.question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("ganesh","rohit","ramesh","prathmesh","rahul","sanket","navneet","keshav","mohan","tushar");
		
		
		List<String> filtered = names.stream()
										.filter(s -> s.length() % 2 == 0)
										.map(s -> s.toUpperCase())
										.collect(Collectors.toList());
		
	
		Collections.sort(filtered, (s1,s2) -> s2.compareTo(s1));

		
		
		System.out.println("Original list");
		System.out.println(names);
		
		System.out.println("-----------------");
		
		System.out.println("Transformed list");
		System.out.println(filtered);
		

	}

}
