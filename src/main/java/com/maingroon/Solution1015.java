package com.maingroon;

public class Solution1015 {

    public int smallestRepunitDivByK(int k) {
        int rem = 0;
        for (int i = 1; i <= k; i++) {
            rem *= 10;
            rem += 1;
            rem %= k;
            if (rem % k == 0) {
                return i;
            }
        }
        return -1;
    }
}
