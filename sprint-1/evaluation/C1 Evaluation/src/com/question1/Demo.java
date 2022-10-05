package com.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Collection<Employee> col = originalMap.keySet();
		List<Employee> list = new ArrayList<>(col);
		
		Collections.sort(list, new EmployeeSalaryComp());
//		System.out.println(list);
		
//		HashMap<Employee, String> hm = new LinkedHashMap<>();
		
		for(Employee s : list)
		{
			System.out.println(s);
		}
		
		return originalMap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Employee, String> hm = new HashMap<>();
		
		hm.put(new Employee(1,"a",5000), "A");
		hm.put(new Employee(2,"b",2000), "B");
		hm.put(new Employee(3,"c",6000), "C");
		hm.put(new Employee(4,"d",2500), "D");
		hm.put(new Employee(5,"e",1000), "E");
		
		
		Demo d = new Demo();
		Map<Employee, String> map = d.sortMapUsingEmployeeSalary(hm);
		

	}

}
