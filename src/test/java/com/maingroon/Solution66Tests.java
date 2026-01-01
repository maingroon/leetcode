package com.maingroon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution66Tests {

    private final Solution66 solution = new Solution66();

    @Test
    void test1() {
        int[] digits = {1, 2, 3};
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(digits));
    }

    @Test
    void test2() {
        int[] digits = {4, 3, 2, 1};
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(digits));
    }

    @Test
    void test3() {
        int[] digits = {9};
        Assertions.assertArrayEquals(new int[]{1, 0}, solution.plusOne(digits));
    }
}
