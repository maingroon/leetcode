package com.maingroon;

import java.util.Arrays;

public class Solution960 {

    public int minDeletionSize(String[] strs) {
        int wordLength = strs[0].length();
        int[] dp = new int[wordLength];
        Arrays.fill(dp, 1);
        for (int i = 1; i < wordLength; i++) {
            for (int j = 0; j < i; j++) {
                if (isValid(strs, j, i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int val : dp) {
            max = Math.max(max, val);
        }
        return wordLength - max;
    }

    private boolean isValid(String[] strs, int j, int i) {
        for (String s : strs) {
            if (s.charAt(j) > s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
