package com.learning.core.day2session1.PS5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D02P57 {
    public static void main(String[] args) {

    	String dictionary = "abb abc xyz xyy foo";

        String pattern = "xyy";

        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

        System.out.println("Output:");
        for (String str : matchingStrings) {
            System.out.println(str);
        }
    }

    public static List<String> findMatchingStrings(String dictionary, String pattern) {
        List<String> result = new ArrayList<>();

        Pattern regexPattern = Pattern.compile(pattern);

        // Split the dictionary into words
        String[] words = dictionary.split("\\s+");

        for (String word : words) {
            Matcher matcher = regexPattern.matcher(word);
            if (matcher.matches()) {

            	result.add(word);
            }
        }

        return result;
    }
}
