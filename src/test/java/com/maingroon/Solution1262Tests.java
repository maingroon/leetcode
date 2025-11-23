package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1262Tests {

    private final Solution1262 solution = new Solution1262();

    @Test
    void test1() {
        int[] nums = {3, 6, 5, 1, 8};
        assertEquals(18, solution.maxSumDivThree(nums));
    }

    @Test
    void test2() {
        int[] nums = {4};
        assertEquals(0, solution.maxSumDivThree(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 4, 4};
        assertEquals(12, solution.maxSumDivThree(nums));
    }

    @Test
    void test4() {
        int[] nums = {2,6,2,2,7};
        assertEquals(15, solution.maxSumDivThree(nums));
    }
}
