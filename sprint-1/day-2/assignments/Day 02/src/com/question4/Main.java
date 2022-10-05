package com.question4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Student> map = new HashMap<>();
		
		map.put("Maharashtra", new Student(26, "Tushar", 850));
		map.put("Karnataka", new Student(02, "Rokey", 410));
		map.put("Telangana", new Student(23, "Prabhas", 780));
		map.put("Delhi", new Student(18, "Virat", 640));
		
		Map<String, Student> sortedMap = sortByMapValue(map);
		
		for(Map.Entry<String, Student> s : sortedMap.entrySet())
		{
			System.out.println("Student is from: "+s.getKey());
			Student stu = s.getValue();
			System.out.println("Name: "+stu.getName());
			System.out.println("Roll: "+stu.getRoll());
			System.out.println("Marks: "+stu.getMarks());
			System.out.println("----------------------");
		}
		
	}

	private static Map<String, Student> sortByMapValue(HashMap<String, Student> map) {
		// TODO Auto-generated method stub
		
		Comparator<Map.Entry<String, Student>> markscomp = (s1,s2) -> {
			
			return s1.getValue().getMarks() > s2.getValue().getMarks() ? +1 : -1 ;
		};
		
		Set<Map.Entry<String, Student>> set = map.entrySet();
		
		Set<Map.Entry<String, Student>> sortedMap = new TreeSet<>(markscomp);
		
		sortedMap.addAll(set);
		
		LinkedHashMap<String, Student> finalMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s : sortedMap)
		{
			finalMap.put(s.getKey(), s.getValue());
		}
		
		return finalMap;
	}

}
