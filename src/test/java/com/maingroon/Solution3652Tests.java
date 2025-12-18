package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3652Tests {

    private final Solution3652 solution = new Solution3652();

    @Test
    void test1() {
        int[] prices = {4, 2, 8};
        int[] strategy = {-1, 0, 1};
        int k = 2;

        assertEquals(10, solution.maxProfit(prices, strategy, k));
    }

    @Test
    void test2() {
        int[] prices = {5, 4, 3};
        int[] strategy = {1, 1, 0};
        int k = 2;

        assertEquals(9, solution.maxProfit(prices, strategy, k));
    }
}
