package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3583Tests {

    private final Solution3583 solution = new Solution3583();

    @Test
    void test1() {
        int[] nums = {6, 3, 6};
        assertEquals(1, solution.specialTriplets(nums));
    }

    @Test
    void test2() {
        int[] nums = {0, 1, 0, 0};
        assertEquals(1, solution.specialTriplets(nums));
    }

    @Test
    void test3() {
        int[] nums = {8, 4, 2, 8, 4};
        assertEquals(2, solution.specialTriplets(nums));
    }
}
