package com.question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "product 1", 12, 1204));
		products.add(new Product(2, "product 2", 5, 3600));
		products.add(new Product(3, "product 3", 21, 2560));
		products.add(new Product(4, "product 4", 35, 560));
		products.add(new Product(5, "product 5", 7, 8210));
		
//		System.out.println(products);
		for(Product p : products)
		{
			System.out.println(p);
		}
		
		Collections.sort(products, (p1,p2) -> p1.getPrice() > p2.getPrice() ? -1 : +1);
		
		System.out.println("-----after sorting in descendent order-----");
//		System.out.println(products);
		for(Product p : products)
		{
			System.out.println(p);
		}

	}

}
