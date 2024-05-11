package com.learning.core.day1session1.PS1;

import java.util.stream.IntStream;

public class EvenNumbers {

	public static void main(String[] agrs) {
		//for (int i=1; i<=15; i+=4) {
		//IntStream.rangeClosed(1, 15)
		IntStream.iterate(1, i -> i+4)
		.limit(4)
		
//		.filter(n -> n% 2 != 0)
		.forEach(System.out::println);
			
			//if(i%2 != 0) {
				//System.out.println(i);
			}
		}

