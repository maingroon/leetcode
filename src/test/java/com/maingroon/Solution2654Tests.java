package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2654Tests {

    private final Solution2654 solution = new Solution2654();

    @Test
    void test1() {
        int[] nums = {2, 6, 3, 4};
        assertEquals(4, solution.minOperations(nums));
    }

    @Test
    void test2() {
        int[] nums = {2, 10, 6, 14};
        assertEquals(-1, solution.minOperations(nums));
    }

    @Test
    void test3() {
        int[] nums = {6, 10, 15};
        assertEquals(4, solution.minOperations(nums));
    }

    @Test
    void test4() {
        int[] nums = {4, 2, 6, 3};
        assertEquals(5, solution.minOperations(nums));
    }
}
