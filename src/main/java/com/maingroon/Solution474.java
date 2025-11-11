package com.maingroon;

public class Solution474 {

    public int findMaxForm(String[] strs, int zeroCap, int oneCap) {
        int[][][] cache = new int[strs.length][zeroCap + 1][oneCap + 1];
        return calculate(cache, 0, strs, zeroCap, oneCap);
    }

    private int calculate(int[][][] cache, int i, String[] strs, int zeroCount, int oneCount) {
        if (i == strs.length) {
            return 0;
        }
        if (cache[i][zeroCount][oneCount] != 0) {
            return cache[i][zeroCount][oneCount];
        }
        int[] count = countNums(strs[i]);
        int taken = -1;
        if (zeroCount - count[0] >= 0 && oneCount - count[1] >= 0) {
            taken = 1 + calculate(cache, i + 1, strs, zeroCount - count[0], oneCount - count[1]);
        }
        int notTaken = calculate(cache, i + 1, strs, zeroCount, oneCount);
        cache[i][zeroCount][oneCount] = Math.max(taken, notTaken);
        return cache[i][zeroCount][oneCount];
    }

    private static int[] countNums(String str) {
        int[] count = new int[2];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }
        return count;
    }
}
