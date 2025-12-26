package com.maingroon;

public class Solution2483 {

    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            prefix[i] = prefix[i + 1];
            if (customers.charAt(i) == 'Y') {
                prefix[i]++;
            }
        }

        int minPenalty = Integer.MAX_VALUE;
        int minTime = Integer.MAX_VALUE;
        for (int time = 0; time <= n; time++) {
            int penalty = prefix[time];
            penalty += time - (prefix[0] - prefix[time]);
            if (penalty < minPenalty) {
                minPenalty = penalty;
                minTime = time;
            }
        }
        return minTime;
    }
}
