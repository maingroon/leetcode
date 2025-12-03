package com.maingroon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution3625 {

    private static final int INF = 1000000007;

    public int countTrapezoids(int[][] points) {
        int count = 0;
        Map<Double, List<Double>> slopeToIntercept = new HashMap<>();
        Map<Integer, List<Double>> midToSlope = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                double k = calcK(x1, y1, x2, y2);
                double b = calcB(x1, y1, x2, y2);
                slopeToIntercept
                        .computeIfAbsent(k, key -> new ArrayList<>())
                        .add(b);

                int mid = 10000 * (x1 + x2) + (y1 + y2);
                midToSlope
                        .computeIfAbsent(mid,key -> new ArrayList<>())
                        .add(k);
            }
        }

        for (List<Double> sti : slopeToIntercept.values()) {
            if (sti.size() == 1) {
                continue;
            }

            Map<Double, Integer> cnt = new TreeMap<>();
            for (double b : sti) {
                cnt.put(b, cnt.getOrDefault(b, 0) + 1);
            }

            int sum = 0;
            for (int c : cnt.values()) {
                count += sum * c;
                sum += c;
            }
        }

        for (List<Double> mts : midToSlope.values()) {
            if (mts.size() == 1) {
                continue;
            }

            Map<Double, Integer> cnt = new TreeMap<>();
            for (double k : mts) {
                cnt.put(k, cnt.getOrDefault(k, 0) + 1);
            }

            int sum = 0;
            for (int c : cnt.values()) {
                count -= sum * c;
                sum += c;
            }
        }

        return count;
    }

    private double calcK(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return INF;
        } else {
            double k = ((double) (y2 - y1)) / (x2 - x1);
            if (k == -0.0) {
                return 0.0;
            }
            return k;
        }
    }

    private double calcB(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return x1;
        } else {
            int dx = x1 - x2;
            int dy = y1 - y2;
            double b = ((double) (y1 * dx - x1 * dy)) / dx;
            if (b == -0.0) {
                return 0.0;
            }
            return b;
        }
    }
}
