package com.maingroon;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2054 {

    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(
                events,
                Comparator.comparingInt((int[] e) -> e[0])
                        .thenComparingInt((int[] e) -> e[1])
        );

        int max = 0;
        int[] maxValues = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, events[i][2]);
            maxValues[i] = max;
        }

        for (int i = 0; i < n - 1; i++) {
            int searchStart = findSearchStart(events, events[i][1] + 1);
            if (searchStart != -1) {
                max = Math.max(max, events[i][2] + maxValues[searchStart]);
            }
        }
        return max;
    }

    private int findSearchStart(int[][] events, int search) {
        int from = 0;
        int to = events.length - 1;
        while (from != to) {
            int half = from + ((to - from) / 2);
            if (events[half][0] < search) {
                from = half + 1;
            } else {
                to = half;
            }
        }
        if (events[from][0] < search) {
            return -1;
        }
        return from;
    }
}
