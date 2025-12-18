package com.maingroon;

public class Solution3652 {

    public long maxProfit(int[] prices, int[] strategy, int k) {
        int length = prices.length;
        long base = 0;
        for (int i = 0; i < length; i++) {
            base += (long) prices[i] * strategy[i];
        }

        int half = k / 2;
        long prev = 0;
        long next = 0;
        for (int i = 0; i < k; i++) {
            prev += (long) prices[i] * strategy[i];
            if (i >= half) {
                next += prices[i];
            }
        }

        long max = Math.max(0, next - prev);
        for (int i = k; i < length; i++) {
            prev += (long) prices[i] * strategy[i];
            prev -= (long) prices[i - k] * strategy[i - k];

            next += prices[i];
            next -= prices[i - k + half];

            max = Math.max(max, next - prev);
        }
        return base + max;
    }
}
