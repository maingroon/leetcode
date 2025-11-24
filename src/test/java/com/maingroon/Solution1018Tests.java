package com.maingroon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1018Tests {

    private final Solution1018 solution = new Solution1018();

    @Test
    void test1() {
        int[] nums = {0, 1, 1};
        assertEquals(List.of(true, false, false), solution.prefixesDivBy5(nums));
    }

    @Test
    void test2() {
        int[] nums = {1, 1, 1};
        assertEquals(List.of(false, false, false), solution.prefixesDivBy5(nums));
    }

    @Test
    void test3() {
        int[] nums = {0, 1, 1, 1, 1, 1};
        assertEquals(List.of(true, false, false, false, true, false), solution.prefixesDivBy5(nums));
    }
}
