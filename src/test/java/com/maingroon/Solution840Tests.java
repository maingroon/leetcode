package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution840Tests {

    private final Solution840 solution = new Solution840();

    @Test
    void test1() {
        int[][] grid = {{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};
        assertEquals(1, solution.numMagicSquaresInside(grid));
    }

    @Test
    void test2() {
        int[][] grid = {{8}};
        assertEquals(0, solution.numMagicSquaresInside(grid));
    }

    @Test
    void test3() {
        int[][] grid = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
        assertEquals(0, solution.numMagicSquaresInside(grid));
    }

    @Test
    void test4() {
        int[][] grid = {{10, 3, 5}, {1, 6, 11}, {7, 9, 2}};
        assertEquals(0, solution.numMagicSquaresInside(grid));
    }
}
