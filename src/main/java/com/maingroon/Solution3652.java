package com.maingroon;

public class Solution3652 {

    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long profit = 0;
        for (int i = 0; i < n; i++) {
            profit += (long) prices[i] * strategy[i];
        }

        long modProfit = profit;
        for (int i = 0; i < k / 2; i++) {
            modProfit -= (long) prices[i] * strategy[i];
        }
        for (int i = k / 2; i < k; i++) {
            if (strategy[i] == 0) {
                modProfit += prices[i];
            } else if (strategy[i] == -1) {
                modProfit += 2L * prices[i];
            }
        }
        profit = Math.max(profit, modProfit);

        for (int i = k; i < n; i++) {
            modProfit += (long) prices[i - k] * strategy[i - k];
            if (strategy[i - (k / 2)] == 0) {
                modProfit -= prices[i - (k / 2)];
            } else if (strategy[i - (k / 2)] == -1) {
                modProfit -= 2L * prices[i - (k / 2)];
            }

            modProfit -= (long) prices[i - k + 1] * strategy[i - k + 1];
            if (strategy[i - (k / 2) + 1] == 0) {
                modProfit += prices[i - (k / 2) + 1];
            } else if (strategy[i - (k / 2) + 1] == -1) {
                modProfit += 2L * prices[i - (k / 2) + 1];
            }
            profit = Math.max(profit, modProfit);
        }
        return profit;
    }
}
