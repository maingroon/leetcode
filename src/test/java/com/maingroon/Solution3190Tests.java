package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3190Tests {

    private final Solution3190 solution = new Solution3190();

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(3, solution.minimumOperations(nums));
    }

    @Test
    void test2() {
        int[] nums = {3, 6, 9};
        assertEquals(0, solution.minimumOperations(nums));
    }
}
