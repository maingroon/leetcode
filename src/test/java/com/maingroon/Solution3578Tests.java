package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3578Tests {

    private final Solution3578 solution = new Solution3578();

    @Test
    void test1() {
        int[] nums = {9, 4, 1, 3, 7};
        int k = 4;
        assertEquals(6, solution.countPartitions(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {3, 3, 4};
        int k = 0;
        assertEquals(2, solution.countPartitions(nums, k));
    }
}
