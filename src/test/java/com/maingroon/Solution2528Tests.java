package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2528Tests {

    private final Solution2528 solution = new Solution2528();

    @Test
    void test1() {
        int[] stations = {1, 2, 4, 5, 0};
        int r = 1;
        int k = 2;
        assertEquals(5, solution.maxPower(stations, r, k));
    }

    @Test
    void test2() {
        int[] stations = {4, 4, 4, 4};
        int r = 0;
        int k = 3;
        assertEquals(4, solution.maxPower(stations, r, k));
    }

    @Test
    void test3() {
        int[] stations = {4,2};
        int r = 1;
        int k = 1;
        assertEquals(7, solution.maxPower(stations, r, k));
    }
}
