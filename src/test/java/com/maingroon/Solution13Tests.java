package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution13Tests {

    private final Solution13 solution = new Solution13();

    @Test
    void test1() {
        String s = "III";
        assertEquals(3, solution.romanToInt(s));
    }

    @Test
    void test2() {
        String s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }

    @Test
    void test3() {
        String s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }
}
