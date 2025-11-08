package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1611Tests {

    private final Solution1611 solution = new Solution1611();

    @Test
    void test1() {
        int n = 3;
        assertEquals(2, solution.minimumOneBitOperations(n));
    }

    @Test
    void test2() {
        int n = 6;
        assertEquals(4, solution.minimumOneBitOperations(n));
    }
}
