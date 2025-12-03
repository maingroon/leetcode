package com.maingroon;

import java.util.HashMap;
import java.util.Map;

public class Solution3623 {

    private static final int MODULO = 1000000007;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> pointsInLine = new HashMap<>();
        for (int[] point : points) {
            pointsInLine.put(point[1], pointsInLine.getOrDefault(point[1], 0) + 1);
        }

        long count = 0;
        long sum = 0;
        for (long p : pointsInLine.values()) {
            long edge = p * (p - 1L) / 2;
            count += sum * edge;
            sum += edge;
        }
        return (int) (count % MODULO);
    }
}
