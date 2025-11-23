package com.maingroon;

public class Solution1262 {

    public int maxSumDivThree(int[] nums) {
        int minRem1First = Integer.MAX_VALUE;
        int minRem1Second = Integer.MAX_VALUE;
        int minRem2First = Integer.MAX_VALUE;
        int minRem2Second = Integer.MAX_VALUE;

        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num % 3 == 1) {
                if (num < minRem1First) {
                    minRem1Second = minRem1First;
                    minRem1First = num;
                } else if (num < minRem1Second) {
                    minRem1Second = num;
                }
            } else if (num % 3 == 2) {
                if (num < minRem2First) {
                    minRem2Second = minRem2First;
                    minRem2First = num;
                } else if (num < minRem2Second) {
                    minRem2Second = num;
                }
            }
        }

        if (sum % 3 == 1) {
            int minRem2 = minRem2First != Integer.MAX_VALUE && minRem2Second != Integer.MAX_VALUE
                    ? minRem2First + minRem2Second
                    : Integer.MAX_VALUE;
            sum -= Math.min(minRem1First, minRem2);
        } else if (sum % 3 == 2) {
            int minRem1 = minRem1First != Integer.MAX_VALUE && minRem1Second != Integer.MAX_VALUE
                    ? minRem1First + minRem1Second
                    : Integer.MAX_VALUE;
            sum -= Math.min(minRem1, minRem2First);
        }
        return sum;
    }
}
