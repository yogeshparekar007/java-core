package com.learning.core.day1session1.PS1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learning.core.day3session2.PS8.Employee;

public class Main {
	
	static List<Emp> employeeList = Arrays.asList(new Emp("David", 15000.00),
	new Emp("Tom", 7000.00),
	new Emp("AB", 56000.00));

	public static void main(String[] args) {
		Optional<Emp> maxSalaryEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Emp::getSalary)));
		System.out.println("Employee with max salary:" +maxSalaryEmp.get().getSalary());
		
//		Map<String, Double> map = new HashMap<>();
//		map.put("David",2000.00);
//		map.put("tom", 3500.00);
//		map.put("Ab", 45000.00);
//		
//		int n = 3;
//		Map.Entry<Double, List<String>> res = getHighestSalary(map,n);

		
		

	}

private static Entry<Double, List<String>> getHighestSalary(Map<String, Double> map, int n) {
	// TODO Auto-generated method stub
	return null;
}

}
