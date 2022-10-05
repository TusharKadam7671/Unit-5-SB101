package com.question4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, List<String>> mp = new HashMap<>();

		mp.put("Maharashtra", Arrays.asList("pune","mumbai","kolhapur"));
		mp.put("MadhyaPradesh", Arrays.asList("bhopal","indore","jabalpur"));
		mp.put("Rajasthan", Arrays.asList("jaipur","kota","ajmer"));
		mp.put("Bengal", Arrays.asList("malda","durgapur","haldia"));
		mp.put("Haryana", Arrays.asList("panipat","gurugram","faridabad"));
		
		
		

		
		Collection<String> cols = mp.keySet();
		List<String> list = new ArrayList<>( cols );
		
		Collections.sort(list);
		Collections.reverse(list);

		for(String s : list)
		{
			System.out.println(s+" "+mp.get(s));
		}
		
		//---------------------------------------------------------//
		
		System.out.println("----------------------------");
		
//		Map <String , List<String>> tm = new TreeMap<String , List<String>>();
		Map <String , List<String>> tm = new TreeMap<String , List<String>>(Collections.reverseOrder());
	
		tm.put("Maharashtra", Arrays.asList("pune","mumbai","kolhapur"));
		tm.put("MadhyaPradesh", Arrays.asList("bhopal","indore","jabalpur"));
		tm.put("Rajasthan", Arrays.asList("jaipur","kota","ajmer"));
		tm.put("Bengal", Arrays.asList("malda","durgapur","haldia"));
		tm.put("Haryana", Arrays.asList("panipat","gurugram","faridabad"));
		
//		Map <String , List<String>> newMap = new TreeMap<String , List<String>>(Collections.reverseOrder());

//		 newMap.putAll(tm);
//		for(Map.Entry<String,List<String>> e : newMap.entrySet()) {
		 
		for(Map.Entry<String,List<String>> e : tm.entrySet()) {
			
			System.out.println(e);
		
		}
	
	
	}
	
}
