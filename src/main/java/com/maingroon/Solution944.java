package com.maingroon;

public class Solution944 {

    public int minDeletionSize(String[] strs) {
        int arrayLength = strs.length;
        int wordLength = strs[0].length();
        int result = 0;
        for (int i = 0; i < wordLength; i++) {
            for (int j = 1; j < arrayLength; j++) {
                if (strs[j - 1].charAt(i) > strs[j].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
