package com.maingroon;

public class Solution3577 {

    private static final int MOD = 1000000007;

    public int countPermutations(int[] complexity) {
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= complexity[0]) {
                return 0;
            }
        }

        long count = 1;
        for (int i = 2; i < complexity.length; i++) {
            count = (count * i) % MOD;
        }
        return (int) count;
    }
}
