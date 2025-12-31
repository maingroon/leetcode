package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1970Tests {

    private final Solution1970 solution = new Solution1970();

    @Test
    void test1() {
        int row = 2;
        int col = 2;
        int[][] cells = {{1, 1}, {2, 1}, {1, 2}, {2, 2}};

        assertEquals(2, solution.latestDayToCross(row, col, cells));
    }

    @Test
    void test2() {
        int row = 2;
        int col = 2;
        int[][] cells = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};

        assertEquals(1, solution.latestDayToCross(row, col, cells));
    }

    @Test
    void test3() {
        int row = 3;
        int col = 3;
        int[][] cells = {{1, 2}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2}, {3, 1}};

        assertEquals(3, solution.latestDayToCross(row, col, cells));
    }
}
