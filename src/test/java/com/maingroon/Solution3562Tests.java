package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3562Tests {

    private final Solution3562 solution = new Solution3562();

    @Test
    void test1() {
        int n = 2;
        int[] present = {1, 2};
        int[] future = {4, 3};
        int[][] hierarchy = {{1, 2}};
        int budget = 3;

        assertEquals(5, solution.maxProfit(n, present, future, hierarchy, budget));
    }

    @Test
    void test2() {
        int n = 2;
        int[] present = {3, 4};
        int[] future = {5, 8};
        int[][] hierarchy = {{1, 2}};
        int budget = 4;

        assertEquals(4, solution.maxProfit(n, present, future, hierarchy, budget));
    }

    @Test
    void test3() {
        int n = 3;
        int[] present = {4, 6, 8};
        int[] future = {7, 9, 11};
        int[][] hierarchy = {{1, 2}, {1, 3}};
        int budget = 10;

        assertEquals(10, solution.maxProfit(n, present, future, hierarchy, budget));
    }

    @Test
    void test4() {
        int n = 3;
        int[] present = {5, 2, 3};
        int[] future = {8, 5, 6};
        int[][] hierarchy = {{1, 2}, {2, 3}};
        int budget = 7;

        assertEquals(12, solution.maxProfit(n, present, future, hierarchy, budget));
    }
}
