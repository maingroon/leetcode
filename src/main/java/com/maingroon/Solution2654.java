package com.maingroon;

public class Solution2654 {

    public int minOperations(int[] nums) {
        int numOneRep = 0;
        int numsGcd = 0;
        for (int num : nums) {
            if (num == 1) {
                numOneRep++;
            }
            numsGcd = gcd(numsGcd, num);
        }
        if (numOneRep > 0) {
            return nums.length - numOneRep;
        }
        if (numsGcd > 1) {
            return -1;
        }

        int toOneOperations = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int currentGcd = 0;
            for (int j = i; j < nums.length; j++) {
                currentGcd = gcd(currentGcd, nums[j]);
                if (currentGcd == 1) {
                    toOneOperations = Math.min(toOneOperations, j - i + 1);
                    break;
                }
            }
        }
        return toOneOperations + nums.length - 2;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
