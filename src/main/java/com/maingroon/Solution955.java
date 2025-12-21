package com.maingroon;

public class Solution955 {

    public int minDeletionSize(String[] strs) {
        int arrayLength = strs.length;
        int wordLength = strs[0].length();

        int deletions = 0;
        boolean[] sorted = new boolean[arrayLength - 1];
        for (int col = 0; col < wordLength; col++) {
            boolean needDelete = false;
            for (int row = 0; row < arrayLength - 1; row++) {
                if (!sorted[row] && strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    needDelete = true;
                    break;
                }
            }

            if (needDelete) {
                deletions++;
                continue;
            }

            for (int row = 0; row < arrayLength - 1; row++) {
                if (!sorted[row] && strs[row].charAt(col) < strs[row + 1].charAt(col)) {
                    sorted[row] = true;
                }
            }
        }

        return deletions;
    }
}
