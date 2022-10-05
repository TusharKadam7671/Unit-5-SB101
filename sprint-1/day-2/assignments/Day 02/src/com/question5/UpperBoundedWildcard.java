package com.question5;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {
	
	public static double sumOfList(List<? extends Number> list) {
		
		double s = 0.0;
		for (Number n : list)
    	s += n.doubleValue();
		return s;
	}
	
	public static void main(String[] args) {
		
//		using a list of Integer objects
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		
//		A list of Double values can use the same sumOfList method
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
		
		
	}

}
