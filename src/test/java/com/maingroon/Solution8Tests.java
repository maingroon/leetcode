package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution8Tests {

    private final Solution8 solution = new Solution8();

    @Test
    void test1() {
        String input = "42";
        assertEquals(42, solution.myAtoi(input));
    }

    @Test
    void test2() {
        String input = " -042";
        assertEquals(-42, solution.myAtoi(input));
    }

    @Test
    void test3() {
        String input = "1337c0d3";
        assertEquals(1337, solution.myAtoi(input));
    }

    @Test
    void test4() {
        String input = "0-1";
        assertEquals(0, solution.myAtoi(input));
    }

    @Test
    void test5() {
        String input = "words and 987";
        assertEquals(0, solution.myAtoi(input));
    }

    @Test
    void overflowNegativeTest() {
        String input = "-91283472332";
        assertEquals(Integer.MIN_VALUE, solution.myAtoi(input));
    }

    @Test
    void overflowPositiveTest() {
        String input = "2147483648";
        assertEquals(Integer.MAX_VALUE, solution.myAtoi(input));
    }

    @Test
    void nearOverflowPositiveTest() {
        String input = "2147483646";
        assertEquals(2147483646, solution.myAtoi(input));
    }

    @Test
    void nearOverflowNegativeTest() {
        String input = "-2147483647";
        assertEquals(-2147483647, solution.myAtoi(input));
    }

    @Test
    void empty() {
        String input = "";
        assertEquals(0, solution.myAtoi(input));
    }

    @Test
    void blank() {
        String input = "    ";
        assertEquals(0, solution.myAtoi(input));
    }
}
