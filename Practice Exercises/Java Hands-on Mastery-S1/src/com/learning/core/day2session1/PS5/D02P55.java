package com.learning.core.day2session1.PS5;

import java.util.*;

public class D02P55 {
    public static void main(String[] args) {
        String[] input1 = {"abc", "efg", "cde", "ghi", "ija"};
        String[] input2 = {"Ijk", "kji", "abc", "cba"};

        System.out.println("Output for input1: " + canFormCircle(input1));
        System.out.println("Output for input2: " + canFormCircle(input2));
    }

    public static boolean canFormCircle(String[] strings) {

    	Map<Character, Character> map = new HashMap<>();

        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            map.put(firstChar, lastChar);
        }

        // Check if a circle can be formed
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (map.containsKey(lastChar) && map.get(lastChar) == firstChar)
                return true;
        }

        return false;
    }
}
