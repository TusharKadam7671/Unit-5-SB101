package com.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model)
	{

		if(mobiles.containsKey(company))
		{
			ArrayList<String> list = mobiles.get(company);
			list.add(model);
			mobiles.put(company, list);
		}else
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(model);
			mobiles.put(company, list);
		}
		
		return "Mobile added successfully";
	}
	
	public List<String> getModels(String company)
	{
		if(mobiles.containsKey(company))
		{
			ArrayList<String> list = mobiles.get(company);
			
			return list;
		}
		
		return null;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
		String message = m.addMobile("apple", "Iphone");
		System.out.println(message);
		
		String message2 = m.addMobile("apple", "Iphone 2");
		System.out.println(message2);
		
		String message3 = m.addMobile("Motorola", "E4 Plus");
		System.out.println(message3);
		
		List<String> list = m.getModels("apple");
		System.out.println("apple company list of models: "+list);
		
		
		List<String> list2 = m.getModels("Motorola");
		System.out.println("Motorola company list of models: "+list2);
		
	}

}
