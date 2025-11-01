package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1526Tests {

    private final Solution1526 solution = new Solution1526();

    @Test
    void test1() {
        int[] input = new int[]{1, 2, 3, 2, 1};
        assertEquals(3, solution.minNumberOperations(input));
    }


    @Test
    void test2() {
        int[] input = new int[]{3, 1, 1, 2};
        assertEquals(4, solution.minNumberOperations(input));
    }


    @Test
    void test3() {
        int[] input = new int[]{3, 1, 5, 4, 2};
        assertEquals(7, solution.minNumberOperations(input));
    }
}
