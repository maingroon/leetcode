package com.maingroon;

public class Solution2257 {

    private static final int OCCUPIED = -1;
    private static final int EMPTY = 0;
    private static final int GUARDED = 1;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] wall : walls)
            grid[wall[0]][wall[1]] = OCCUPIED;

        for (int[] guard : guards)
            grid[guard[0]][guard[1]] = OCCUPIED;

        for (int[] guard : guards) {
            int y = guard[0];
            int x = guard[1];

            // Look left
            for (int xi = x - 1; xi >= 0 && grid[y][xi] != OCCUPIED; xi--)
                if (grid[y][xi] == EMPTY)
                    grid[y][xi] = GUARDED;

            // Look right
            for (int xi = x + 1; xi < n && grid[y][xi] != OCCUPIED; xi++)
                if (grid[y][xi] == EMPTY)
                    grid[y][xi] = GUARDED;

            // Look up
            for (int yi = y - 1; yi >= 0 && grid[yi][x] != OCCUPIED; yi--)
                if (grid[yi][x] == EMPTY)
                    grid[yi][x] = GUARDED;

            // Look down
            for (int yi = y + 1; yi < m && grid[yi][x] != OCCUPIED; yi++)
                if (grid[yi][x] == EMPTY)
                    grid[yi][x] = GUARDED;
        }

        int unguarded = 0;
        for (int yi = 0; yi < m; yi++)
            for (int xi = 0; xi < n; xi++)
                if (grid[yi][xi] == EMPTY)
                    unguarded++;
        return unguarded;
    }
}
