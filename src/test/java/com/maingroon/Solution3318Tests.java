package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution3318Tests {

    private final Solution3318 solution = new Solution3318();

    @Test
    void test1() {
        int[] nums = {1, 1, 2, 2, 3, 4, 2, 3};
        int k = 6;
        int x = 2;
        assertArrayEquals(new int[]{6, 10, 12}, solution.findXSum(nums, k, x));
    }

    @Test
    void test2() {
        int[] nums = {3, 8, 7, 8, 7, 5};
        int k = 2;
        int x = 2;
        assertArrayEquals(new int[]{11, 15, 15, 15, 12}, solution.findXSum(nums, k, x));
    }
}
