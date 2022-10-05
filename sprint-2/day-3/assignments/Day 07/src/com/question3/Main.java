package com.question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> squares = integers.stream()
										.map( s -> s*s )
										.collect(Collectors.toList());
		
		
		System.out.println("Integers:");
		integers.forEach( s -> System.out.println(s));
		
		System.out.println();
		
		System.out.println("Squres:");
		squares.forEach( s -> System.out.println(s));

	}

}
