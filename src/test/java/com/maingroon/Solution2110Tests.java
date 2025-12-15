package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2110Tests {

    private final Solution2110 solution = new Solution2110();

    @Test
    void test1() {
        int[] prices = {3, 2, 1, 4};
        assertEquals(7, solution.getDescentPeriods(prices));
    }

    @Test
    void test2() {
        int[] prices = {8,6,7,7};
        assertEquals(4, solution.getDescentPeriods(prices));
    }

    @Test
    void test3() {
        int[] prices = {1};
        assertEquals(1, solution.getDescentPeriods(prices));
    }
}
