package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3542Tests {

    private final Solution3542 solution = new Solution3542();

    @Test
    void test1() {
        int[] nums = {0, 2};
        assertEquals(1, solution.minOperations(nums));
    }

    @Test
    void test2() {
        int[] nums = {3, 1, 2, 1};
        assertEquals(3, solution.minOperations(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 1, 2, 1, 2};
        assertEquals(4, solution.minOperations(nums));
    }
}
