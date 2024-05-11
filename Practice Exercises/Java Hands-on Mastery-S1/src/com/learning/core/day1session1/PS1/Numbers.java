package com.learning.core.day1session1.PS1;

import java.util.Arrays;
import java.util.List;

public class Numbers {

public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	int sum = numbers.stream().mapToInt(Integer::intValue).sum();
	System.out.println("Sum of the Numbers: "+ sum);
	}
}
