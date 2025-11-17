package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution1437Tests {

    private final Solution1437 solution = new Solution1437();

    @Test
    void test1() {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        assertTrue(solution.kLengthApart(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {1, 0, 0, 1, 0, 1};
        int k = 2;
        assertFalse(solution.kLengthApart(nums, k));
    }
}
