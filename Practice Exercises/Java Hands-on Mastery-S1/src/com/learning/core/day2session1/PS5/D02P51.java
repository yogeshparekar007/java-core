package com.learning.core.day2session1.PS5;

import java.util.Scanner;

public class D02P51 {


	public static void main(String[] args) {
		String str, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		str= sc.nextLine();
		
		int length = str.length();
		for (int i = length - 1; i>=0; i--) 
			rev = rev + str.charAt(i);
		
		if(str.equals(rev)) 
			System.out.println(str+" It is a Palindrome");
		else
			System.out.println(str+" It is not a Palindrome");
	}
	
}
	

	


