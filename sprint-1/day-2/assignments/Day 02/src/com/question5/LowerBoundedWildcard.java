package com.question5;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
	
	
	public static void sumOfList(List<? super Integer> list) {
		
//		the method that works on lists of Integer and the supertypes of Integer, such as Integer, Number, and Object
	
		System.out.println(list);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lower Bounded Integer List
		List<Integer> li = Arrays.asList(1, 2, 3);
		sumOfList(li);
	
		 // Number list
		List<Number> ld = Arrays.asList(1.2, 2.3, 3.5);
		sumOfList(ld);
		
		
	}


}
