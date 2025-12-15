package com.maingroon;

public class Solution2110 {

    public long getDescentPeriods(int[] prices) {
        long periods = prices.length;
        int begin = 0;
        for (int end = 1; end < prices.length; end++) {
            if (prices[end] - prices[end - 1] != -1) {
                begin = end;
            }
            periods += end - begin;
        }
        return periods;
    }
}
