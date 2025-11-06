package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution3607Tests {

    private final Solution3607 solution = new Solution3607();

    @Test
    void test1() {
        int c = 5;
        int[][] connections = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int[][] queries = {{1, 3}, {2, 1}, {1, 1}, {2, 2}, {1, 2}};
        assertArrayEquals(new int[]{3, 2, 3}, solution.processQueries(c, connections, queries));
    }

    @Test
    void test2() {
        int c = 3;
        int[][] connections = {};
        int[][] queries = {{1, 1}, {2, 1}, {1, 1}};
        assertArrayEquals(new int[]{1, -1}, solution.processQueries(c, connections, queries));
    }

    @Test
    void test3() {
        int c = 3;
        int[][] connections = {{3, 2}, {1, 3}, {2, 1}};
        int[][] queries = {{2,1}};
        assertArrayEquals(new int[]{}, solution.processQueries(c, connections, queries));
    }
}
