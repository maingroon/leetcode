package com.maingroon;

import java.util.Arrays;

public class Solution3531 {

    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] minRow = new int[n + 1];
        int[] maxRow = new int[n + 1];
        int[] minCol = new int[n + 1];
        int[] maxCol = new int[n + 1];

        Arrays.fill(minRow, n + 1);
        Arrays.fill(minCol, n + 1);

        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];
            minRow[y] = Math.min(minRow[y], x);
            maxRow[y] = Math.max(maxRow[y], x);
            minCol[x] = Math.min(minCol[x], y);
            maxCol[x] = Math.max(maxCol[x], y);
        }

        int count = 0;
        for (int[] building : buildings) {
            int x = building[0];
            int y = building[1];
            if (x > minRow[y] && x < maxRow[y] && y > minCol[x] && y < maxCol[x]) {
                count++;
            }
        }
        return count;
    }
}
