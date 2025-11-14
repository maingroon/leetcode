package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution2536Tests {

    private final Solution2536 solution = new Solution2536();

    @Test
    void test1() {
        int n = 3;
        int[][] queries = {
                {1, 1, 2, 2},
                {0, 0, 1, 1}
        };

        int[][] expected = {
                {1, 1, 0},
                {1, 2, 1},
                {0, 1, 1}
        };
        assertArrayEquals(expected, solution.rangeAddQueries(n, queries));
    }

    @Test
    void test2() {
        int n = 2;
        int[][] queries = {
                {0, 0, 1, 1}
        };

        int[][] expected = {
                {1, 1},
                {1, 1}
        };
        assertArrayEquals(expected, solution.rangeAddQueries(n, queries));
    }
}
