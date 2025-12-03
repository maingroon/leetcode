package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3625Tests {

    private final Solution3625 solution = new Solution3625();

    @Test
    void test1() {
        int[][] points = {{-3, 2}, {3, 0}, {2, 3}, {3, 2}, {2, -3}};
        assertEquals(2, solution.countTrapezoids(points));
    }

    @Test
    void test2() {
        int[][] points = {{0, 0}, {1, 0}, {0, 1}, {2, 1}};
        assertEquals(1, solution.countTrapezoids(points));
    }

    @Test
    void test3() {
        int[][] points = {{71, -89}, {-75, -89}, {-9, 11}, {-24, -89}, {-51, -89}, {-77, -89}, {42, 11}};
        assertEquals(10, solution.countTrapezoids(points));
    }
}
