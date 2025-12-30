package com.maingroon;

import java.util.HashSet;
import java.util.Set;

public class Solution840 {

    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int y = 0; y <= grid.length - 3; y++) {
            for (int x = 0; x <= grid[0].length - 3; x++) {
                if (isSquareMagic(grid, y, x)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isSquareMagic(int[][] grid, int fromY, int fromX) {
        Set<Integer> nums = new HashSet<>(9);

        int[] rows = new int[3];
        int[] cols = new int[3];
        int[] diagonals = new int[2];

        for (int y = fromY; y < fromY + 3; y++) {
            for (int x = fromX; x < fromX + 3; x++) {
                int num = grid[y][x];
                if (num < 1 || num > 9 || nums.contains(num)) {
                    return false;
                }
                nums.add(num);
                rows[y - fromY] += num;
                cols[x - fromX] += num;

            }
        }

        diagonals[0] = grid[fromY][fromX] + grid[fromY + 1][fromX + 1] + grid[fromY + 2][fromX + 2];
        diagonals[1] = grid[fromY + 2][fromX] + grid[fromY + 1][fromX + 1] + grid[fromY][fromX + 2];

        for (int i = 0; i < 2; i++) {
            if (rows[i] != rows[i + 1] || cols[i] != cols[i + 1] || rows[i] != cols[i] || rows[i] != diagonals[i]) {
                return false;
            }
        }
        return true;
    }
}
