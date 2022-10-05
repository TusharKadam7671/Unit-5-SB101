package com.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "pro1", 850, 15));
		products.add(new Product(2, "pro2", 430, 9));
		products.add(new Product(3, "pro3", 125, 13));
		products.add(new Product(4, "pro4", 490, 26));
		products.add(new Product(5, "pro5", 1500, 5));
		
		List<Product> filtered = products.stream()
										  .filter(p -> p.getQuantity() > 10)
										   .collect(Collectors.toList());
		
		filtered.sort( (s1,s2)->s1.getPrice() > s2.getPrice() ? +1 : -1 );
		
		System.out.println("Original list");
		products.forEach( s -> System.out.println(s));
		
		System.out.println();
		
		System.out.println("Filtered list");
		filtered.forEach( s -> System.out.println(s));
		
	}

}
