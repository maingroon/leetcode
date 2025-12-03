package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3623Tests {

    private final Solution3623 solution = new Solution3623();

    @Test
    void test1() {
        int[][] points = {{1, 0}, {2, 0}, {3, 0}, {2, 2}, {3, 2}};
        assertEquals(3, solution.countTrapezoids(points));
    }

    @Test
    void test2() {
        int[][] points = {{0,0},{1,0},{0,1},{2,1}};
        assertEquals(1, solution.countTrapezoids(points));
    }
}
