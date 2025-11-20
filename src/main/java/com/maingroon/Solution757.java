package com.maingroon;

import java.util.Arrays;

public class Solution757 {

    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            int endComp = Integer.compare(a[1], b[1]);
            if (endComp == 0) {
                return Integer.compare(b[0], a[0]);
            }
            return endComp;
        });

        int result = 0;
        int reuseStart = -1;
        int reuseEnd = -1;
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (start <= reuseStart) {
                continue;
            }

            if (start > reuseEnd) {
                result += 2;
                reuseStart = end - 1;
            } else {
                result += 1;
                reuseStart = reuseEnd;
            }
            reuseEnd = end;
        }
        return result;
    }
}
