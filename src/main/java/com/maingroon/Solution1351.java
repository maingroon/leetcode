package com.maingroon;

public class Solution1351 {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
