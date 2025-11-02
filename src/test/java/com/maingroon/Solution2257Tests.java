package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2257Tests {

    private final Solution2257 solution = new Solution2257();

    @Test
    void test1() {
        int m = 4;
        int n = 6;
        int[][] guards = {{0, 0}, {1, 1}, {2, 3}};
        int[][] walls = {{0, 1}, {2, 2}, {1, 4}};
        assertEquals(7, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void test2() {
        int m = 3;
        int n = 3;
        int[][] guards = {{1, 1}};
        int[][] walls = {{0, 1}, {1, 0}, {2, 1}, {1, 2}};
        assertEquals(4, solution.countUnguarded(m, n, guards, walls));
    }
}
