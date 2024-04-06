package com.learning.core.day2session1.PS5;

public class D02P54 {

    public static int minDeletionsForPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Initialize dp table with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }

        // Fill the dp table using bottom-up approach
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String inputString = "aebcbda";
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + minDeletionsForPalindrome(inputString));
    }
}
