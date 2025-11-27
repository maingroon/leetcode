package com.maingroon;

import java.util.Arrays;

public class Solution3381 {

    public long maxSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE;
        long prefixSum = 0;
        long[] kSum = new long[k];
        Arrays.fill(kSum, Long.MAX_VALUE / 2);
        kSum[k-1] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            maxSum = Math.max(maxSum, prefixSum - kSum[i % k]);
            kSum[i % k] = Math.min(kSum[i % k], prefixSum);
        }
        return maxSum;
    }

//    first attempt solution
//    public long maxSubarraySum(int[] nums, int k) {
//        long maxSum = Long.MIN_VALUE;
//        for (int window = k; window <= nums.length; window += k) {
//            long sum = 0;
//            for (int i = 0; i < window; i++) {
//                sum += nums[i];
//            }
//            if (sum > maxSum) {
//                maxSum = sum;
//            }
//
//            for (int i = 1; i <= nums.length - window; i++) {
//                sum -= nums[i - 1];
//                sum += nums[i + window - 1];
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//        return maxSum;
//    }
}
