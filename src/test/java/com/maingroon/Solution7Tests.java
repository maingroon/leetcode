package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution7Tests {

    private final Solution7 solution = new Solution7();

    @Test
    void test1() {
        int input = 123;
        assertEquals(321, solution.reverse(input));
    }

    @Test
    void test2() {
        int input = -123;
        assertEquals(-321, solution.reverse(input));
    }

    @Test
    void test3() {
        int input = 120;
        assertEquals(21, solution.reverse(input));
    }

    @Test
    void overflowTest() {
        int input = 1534236469;
        assertEquals(0, solution.reverse(input));
    }
}
