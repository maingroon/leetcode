package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3573Tests {

    private final Solution3573 solution = new Solution3573();

    @Test
    void test1() {
        int[] prices = {1, 7, 9, 8, 2};
        int k = 2;

        assertEquals(14, solution.maximumProfit(prices, k));
    }

    @Test
    void test2() {
        int[] prices = {12, 16, 19, 19, 8, 1, 19, 13, 9};
        int k = 3;

        assertEquals(36, solution.maximumProfit(prices, k));
    }
}
