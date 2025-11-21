package com.maingroon;

import java.util.Arrays;

public class Solution1930 {

    public int countPalindromicSubsequence(String s) {
        final int ALPHABET = 26;
        int count = 0;
        int[] beginIndex = new int[ALPHABET];
        int[] endIndex = new int[ALPHABET];
        Arrays.fill(beginIndex, -1);

        for (int i = 0; i < s.length(); i++) {
            int ci = s.charAt(i) - 'a';
            if (beginIndex[ci] == -1) {
                beginIndex[ci] = i;
            }
            endIndex[ci] = i;
        }

        for (int i = 0; i < ALPHABET; i++) {
            if (beginIndex[i] == -1) {
                continue;
            }

            boolean[] used = new boolean[26];
            for (int bi = beginIndex[i] + 1; bi < endIndex[i]; bi++) {
                int ci = s.charAt(bi) - 'a';
                if (!used[ci]) {
                    used[ci] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
