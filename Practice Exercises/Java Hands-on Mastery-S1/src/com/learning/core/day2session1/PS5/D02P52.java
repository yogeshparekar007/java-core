package com.learning.core.day2session1.PS5;

import java.util.Scanner;

public class D02P52 {
    
    public static String countLastNVowels(String str, int n) {
        int count = 0;
        StringBuilder lastNVowels = new StringBuilder();

        // Traverse the string from right to left
        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                lastNVowels.insert(0, ch);
                count++;
            }
        }

        if (count < n) {
            return "Mismatch in Vowel Count";
        }

        return lastNVowels.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Number of last vowels to count
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();

        // Count last 'n' vowels
        String result = countLastNVowels(inputString, n);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
