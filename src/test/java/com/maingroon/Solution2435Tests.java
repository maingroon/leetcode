package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2435Tests {

    private final Solution2435 solution = new Solution2435();

    @Test
    void test1() {
        int[][] grid = {{5, 2, 4}, {3, 0, 5}, {0, 7, 2}};
        int k = 3;
        assertEquals(2, solution.numberOfPaths(grid, k));
    }

    @Test
    void test2() {
        int[][] grid = {{0, 0}};
        int k = 5;
        assertEquals(1, solution.numberOfPaths(grid, k));
    }

    @Test
    void test3() {
        int[][] grid = {{7, 3, 4, 9}, {2, 3, 6, 2}, {2, 3, 7, 0}};
        int k = 1;
        assertEquals(10, solution.numberOfPaths(grid, k));
    }
}
