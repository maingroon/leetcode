package com.maingroon;

public class Solution1925 {

    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a < n; a++) {
            for (int b = a; b <= n; b++) {
                double c = Math.sqrt(a * a + b * b);
                if (c > n) {
                    break;
                }
                if (c == (int) c) {
                    if (a == b) {
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
        }
        return count;
    }
}
