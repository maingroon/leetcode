package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2872Tests {

    private final Solution2872 solution = new Solution2872();

    @Test
    void test1() {
        int n = 5;
        int[][] edges = {{0, 2}, {1, 2}, {1, 3}, {2, 4}};
        int[] values = {1, 8, 1, 4, 4};
        int k = 6;
        assertEquals(2, solution.maxKDivisibleComponents(n, edges, values, k));
    }

    @Test
    void test2() {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
        int[] values = {3, 0, 6, 1, 5, 2, 1};
        int k = 3;
        assertEquals(3, solution.maxKDivisibleComponents(n, edges, values, k));
    }
}
