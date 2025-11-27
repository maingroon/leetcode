package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3381Tests {

    private final Solution3381 solution = new Solution3381();

    @Test
    void test1() {
        int[] nums = {1, 2};
        int k = 1;
        assertEquals(3, solution.maxSubarraySum(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 4;
        assertEquals(-10, solution.maxSubarraySum(nums, k));
    }

    @Test
    void test3() {
        int[] nums = {-5, 1, 2, -3, 4};
        int k = 2;
        assertEquals(4, solution.maxSubarraySum(nums, k));
    }

    @Test
    void test4() {
        int[] nums = {2, 0, 10};
        int k = 1;
        assertEquals(12, solution.maxSubarraySum(nums, k));
    }

    @Test
    void test5() {
        int[] nums = {-15, 20, 18};
        int k = 1;
        assertEquals(38, solution.maxSubarraySum(nums, k));
    }

    @Test
    void test6() {
        int[] nums = {-39, 18, 33, 24};
        int k = 1;
        assertEquals(75, solution.maxSubarraySum(nums, k));
    }
}
