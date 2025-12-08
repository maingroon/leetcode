package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1925Tests {

    private final Solution1925 solution = new Solution1925();

    @Test
    void test1() {
        int n = 5;
        assertEquals(2, solution.countTriples(n));
    }

    @Test
    void test2() {
        int n = 10;
        assertEquals(4, solution.countTriples(n));
    }

    @Test
    void test3() {
        int n = 12;
        assertEquals(4, solution.countTriples(n));
    }
}
