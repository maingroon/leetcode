package com.maingroon;

public class Solution2528 {

    public long maxPower(int[] stations, int r, int k) {
        long[] count = new long[stations.length + 1];
        long low = Integer.MAX_VALUE;
        long high = k;
        for (int i = 0; i < stations.length; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(stations.length, i + r + 1);
            count[left] += stations[i];
            count[right] -= stations[i];

            if (low > stations[i]) {
                low = stations[i];
            }
            high += stations[i];
        }

        long result = 0;
        while (low <= high) {
            long middle = low + (high - low) / 2;
            if (check(count, middle, r, k)) {
                result = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return result;
    }

    private boolean check(long[] count, long val, int r, int k) {
        int n = count.length - 1;
        long[] diff = count.clone();
        long sum = 0;
        long remaining = k;

        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum < val) {
                long add = val - sum;
                if (remaining < add) {
                    return false;
                }
                remaining -= add;
                int end = Math.min(n, i + 2 * r + 1);
                diff[end] -= add;
                sum += add;
            }
        }
        return true;
    }
}
