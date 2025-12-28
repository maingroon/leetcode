package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1351Tests {

    private final Solution1351 solution = new Solution1351();

    @Test
    void test1() {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        assertEquals(8, solution.countNegatives(grid));
    }

    @Test
    void test2() {
        int[][] grid = {{3, 2}, {1, 0}};
        assertEquals(0, solution.countNegatives(grid));
    }
}
