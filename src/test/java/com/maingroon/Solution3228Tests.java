package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3228Tests {

    private final Solution3228 solution = new Solution3228();

    @Test
    void test1() {
        String input = "1001101";
        assertEquals(4, solution.maxOperations(input));
    }

    @Test
    void test2() {
        String input = "00111";
        assertEquals(0, solution.maxOperations(input));
    }
}
