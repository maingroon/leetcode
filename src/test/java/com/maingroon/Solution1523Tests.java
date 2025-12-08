package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1523Tests {

    private final Solution1523 solution = new Solution1523();

    @Test
    void test1() {
        int low = 3;
        int high = 7;
        assertEquals(3, solution.countOdds(low, high));
    }

    @Test
    void test2() {
        int low = 8;
        int high = 10;
        assertEquals(1, solution.countOdds(low, high));
    }

    @Test
    void test3() {
        int low = 8;
        int high = 11;
        assertEquals(2, solution.countOdds(low, high));
    }

    @Test
    void test4() {
        int low = 5;
        int high = 5;
        assertEquals(1, solution.countOdds(low, high));
    }

    @Test
    void test5() {
        int low = 2;
        int high = 2;
        assertEquals(0, solution.countOdds(low, high));
    }
}
