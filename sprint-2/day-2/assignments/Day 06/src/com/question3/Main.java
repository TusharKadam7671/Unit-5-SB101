package com.question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String, Student> originalMap = new HashMap<>();
		
		originalMap.put("India", new Student(18, "Tushar", "kadamtushar080@gmail.com", 850));
		originalMap.put("America", new Student(99, "Tony", "tonystark99@gmail.com", 1000));
		originalMap.put("Russia", new Student(21, "Putin", "putin1111@gmail.com", 450));
		originalMap.put("Canada", new Student(36, "AkshayKumar", "khiladi234@gmail.com", 234));
		originalMap.put("South Africa", new Student(17, "ABD", "abcd1234@gmail.com", 360));
		
		
		Map<String, Student> sortedMap = sortMapusingStudentName(originalMap);
		
		System.out.println("Sorting according to the name - in descending order");
		
		for(Map.Entry<String,  Student> s : sortedMap.entrySet())
		{
			System.out.println("Student is from: "+s.getKey());
			Student st = s.getValue();
			System.out.println("Student name: "+st.getName());
			System.out.println("Student roll: "+st.getRoll());
			System.out.println("Student email: "+st.getEmail());
			System.out.println("Student marks: "+st.getMarks());
			System.out.println("---------------------------");
		}
		
		

	}

	private static Map<String, Student> sortMapusingStudentName(Map<String, Student> originalMap) {
		// TODO Auto-generated method stub
		
		Comparator<Map.Entry<String, Student>> marksComp = (s1,s2) -> {
			
			return s2.getValue().getName().compareTo(s1.getValue().getName());
		};
		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		
		Set<Map.Entry<String, Student>> sortedMap = new TreeSet<>(marksComp);
		
		sortedMap.addAll(set);
		
		LinkedHashMap<String, Student> finalMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s : sortedMap)
		{
			finalMap.put(s.getKey(), s.getValue());
		}
		
		return finalMap;
	}

}
