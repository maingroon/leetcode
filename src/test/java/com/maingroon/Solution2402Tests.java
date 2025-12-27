package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2402Tests {

    private final Solution2402 solution = new Solution2402();

    @Test
    void test1() {
        int n = 2;
        int[][] meetings = {{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        assertEquals(0, solution.mostBooked(n, meetings));
    }

    @Test
    void test2() {
        int n = 3;
        int[][] meetings = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        assertEquals(1, solution.mostBooked(n, meetings));
    }

    @Test
    void test3() {
        int n = 4;
        int[][] meetings = {{18, 19}, {3, 12}, {17, 19}, {2, 13}, {7, 10}};
        assertEquals(0, solution.mostBooked(n, meetings));
    }
}
