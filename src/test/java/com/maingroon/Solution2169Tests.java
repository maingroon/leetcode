package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2169Tests {

    private final Solution2169 solution = new Solution2169();

    @Test
    void test1() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(3, solution.countOperations(num1, num2));
    }

    @Test
    void test2() {
        int num1 = 10;
        int num2 = 10;
        assertEquals(1, solution.countOperations(num1, num2));
    }
}
