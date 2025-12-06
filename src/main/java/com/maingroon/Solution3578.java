package com.maingroon;

import java.util.Deque;
import java.util.LinkedList;

public class Solution3578 {

    private static final int MOD = 1000000007;

    public int countPartitions(int[] nums, int k) {
        long[] dp = new long[nums.length + 1];
        long[] prefix = new long[nums.length + 1];
        Deque<Integer> minQ = new LinkedList<>();
        Deque<Integer> maxQ = new LinkedList<>();

        dp[0] = 1;
        prefix[0] = 1;
        for (int i = 0, j = 0; i < nums.length; i++) {
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] <= nums[i]) {
                maxQ.pollLast();
            }
            maxQ.offerLast(i);
            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[i]) {
                minQ.pollLast();
            }
            minQ.offerLast(i);
            while (
                    !maxQ.isEmpty() &&
                            !minQ.isEmpty() &&
                            nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k
            ) {
                if (maxQ.peekFirst() == j) {
                    maxQ.pollFirst();
                }
                if (minQ.peekFirst() == j) {
                    minQ.pollFirst();
                }
                j++;
            }

            dp[i + 1] = (prefix[i] - (j > 0 ? prefix[j - 1] : 0) + MOD) % MOD;
            prefix[i + 1] = (prefix[i] + dp[i + 1]) % MOD;
        }

        return (int) dp[nums.length];
    }
}
