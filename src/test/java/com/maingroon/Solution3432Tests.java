package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3432Tests {

    private final Solution3432 solution = new Solution3432();

    @Test
    void test1() {
        int[] nums = {10, 10, 3, 7, 6};
        assertEquals(4, solution.countPartitions(nums));
    }

    @Test
    void test2() {
        int[] nums = {1, 2, 2};
        assertEquals(0, solution.countPartitions(nums));
    }

    @Test
    void test3() {
        int[] nums = {2, 4, 6, 8};
        assertEquals(3, solution.countPartitions(nums));
    }
}
