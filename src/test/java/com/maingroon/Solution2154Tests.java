package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2154Tests {

    private final Solution2154 solution = new Solution2154();

    @Test
    void test1() {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        assertEquals(24, solution.findFinalValue(nums, original));
    }

    @Test
    void test2() {
        int[] nums = {2, 7, 9};
        int original = 4;
        assertEquals(4, solution.findFinalValue(nums, original));
    }

    @Test
    void test3() {
        int[] nums = {8, 19, 4, 2, 15, 3};
        int original = 2;
        assertEquals(16, solution.findFinalValue(nums, original));
    }
}
