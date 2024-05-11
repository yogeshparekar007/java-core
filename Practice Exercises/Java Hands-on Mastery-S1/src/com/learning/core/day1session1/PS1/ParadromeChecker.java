package com.learning.core.day1session1.PS1;
import java.util.Scanner;

public class ParadromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to a string for easier manipulation
        String numStr = Integer.toString(number);
        
        // Reverse the number
        String reverse = new StringBuilder(numStr).reverse().toString();
        
        // Check if the original number is equal to its reverse
        if (numStr.equals(reverse)) {
            System.out.println(number + " is a paradrome.");
        } else {
            System.out.println(number + " is not a paradrome.");
        }
        
        scanner.close();
    }
}
