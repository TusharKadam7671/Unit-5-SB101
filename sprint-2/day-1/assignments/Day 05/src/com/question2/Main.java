package com.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<City> cities = new ArrayList<>();
		
		cities.add(new City("Mumbai"));
		cities.add(new City("Pune"));
		cities.add(new City("Delhi"));
		cities.add(new City("Indore"));
		
		Collections.sort(cities, (c1,c2) -> (c2.getName().compareTo(c1.getName())));
		
		for(City city : cities)
		{
			System.out.println(city.name);
		}

	}

}
