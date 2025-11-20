package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution757Tests {

    private final Solution757 solution = new Solution757();

    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {3, 7}, {8, 9}};
        assertEquals(5, solution.intersectionSizeTwo(intervals));
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        assertEquals(3, solution.intersectionSizeTwo(intervals));
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        assertEquals(5, solution.intersectionSizeTwo(intervals));
    }
}
