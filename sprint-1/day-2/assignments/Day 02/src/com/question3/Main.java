package com.question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedHashMap<String,String> hm = new LinkedHashMap<>();
		
		
		hm.put("Maharashtra","Mumbai");
		hm.put("Bihar","Patna");
		hm.put("Telangana","Hyderabad");
		hm.put("Rajasthan","Jaipur");
		hm.put("Goa","Panaji");
		
		
		
		for(Map.Entry<String,String> me:hm.entrySet()){
			
		System.out.println("State: "+me.getKey()+", "+"Capital: "+me.getValue());
		
		}


	}

}
