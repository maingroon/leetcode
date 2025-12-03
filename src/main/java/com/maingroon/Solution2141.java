package com.maingroon;

import java.util.Arrays;

class Solution2141 {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long extra = 0;
        for (int i = 0; i < batteries.length - n; i++) {
            extra += batteries[i];
        }

        int[] live = new int[n];
        for (int i = 0; i < n; i++) {
            live[i] = batteries[batteries.length - n + i];
        }

        for (int i = 0; i < n - 1; i++) {
            int powerUsed = (i + 1) * (live[i + 1] - live[i]);
            if (extra < powerUsed) {
                return live[i] + extra / (i + 1);
            }
            extra -= powerUsed;
        }
        return live[n - 1] + (extra / n);
    }
}