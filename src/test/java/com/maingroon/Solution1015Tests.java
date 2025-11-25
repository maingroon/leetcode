package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1015Tests {

    private final Solution1015 solution = new Solution1015();

    @Test
    void test1() {
        int k = 1;
        assertEquals(1, solution.smallestRepunitDivByK(k));
    }

    @Test
    void test2() {
        int k = 2;
        assertEquals(-1, solution.smallestRepunitDivByK(k));
    }

    @Test
    void test3() {
        int k = 3;
        assertEquals(3, solution.smallestRepunitDivByK(k));
    }
}
