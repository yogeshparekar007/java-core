package com.learning.core.day2session1.PS5;

import java.util.ArrayList;
import java.util.List;

public class D02P53 {
    
    public static void printSubsequences(String str) {
        int n = str.length();
        
        // Number of subsequences will be 2^n
        int total = (int) Math.pow(2, n);
        
        for (int i = 1; i < total; i++) {
            StringBuilder subsequence = new StringBuilder();
            
            // Form the subsequence corresponding to the current bitmask
            for (int j = 0; j < n; j++) {

            	if ((i & (1 << j)) > 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            
            System.out.print(subsequence + ", ");
        }
    }
    
    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Input: " + inputString);
        System.out.print("Output: ");
        printSubsequences(inputString);
    }
}
