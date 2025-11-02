package com.maingroon;

public class Solution2257 {

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 5;
        }
        for (int[] guard : guards) {
            int y = guard[0];
            int x = guard[1];
            grid[y][x] = 10;

            // check left
            for (int xi = x - 1; xi >= 0; xi--) {
                if (grid[y][xi] == 5 || grid[y][xi] == 10) {
                    break;
                }
                if (grid[y][xi] == 0) {
                    grid[y][xi] = 1;
                }
            }
            // check right
            for (int xi = x + 1; xi < n; xi++) {
                if (grid[y][xi] == 5 || grid[y][xi] == 10) {
                    break;
                }
                if (grid[y][xi] == 0) {
                    grid[y][xi] = 1;
                }
                grid[y][xi] = 1;
            }
            // check top
            for (int yi = y - 1; yi >= 0; yi--) {
                if (grid[yi][x] == 5 || grid[yi][x] == 10) {
                    break;
                }
                if (grid[yi][x] == 0) {
                    grid[yi][x] = 1;
                }
                grid[yi][x] = 1;
            }
            // check bottom
            for (int yi = y + 1; yi < m; yi++) {
                if (grid[yi][x] == 5 || grid[yi][x] == 10) {
                    break;
                }
                if (grid[yi][x] == 0) {
                    grid[yi][x] = 1;
                }
            }
        }

        int unguarded = 0;
        for (int[] column : grid) {
            for (int cell : column) {
                if (cell == 0) {
                    unguarded++;
                }
            }
        }
        return unguarded;
    }
}
