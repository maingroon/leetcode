package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution6Tests {

    private final Solution6 solution = new Solution6();

    @Test
    void singleChar() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, solution.convert(input, 1));
    }

    @Test
    void oneRow() {
        String input = "PAYPALISHIRING";
        String expected = "PAYPALISHIRING";
        assertEquals(expected, solution.convert(input, 1));
    }

    @Test
    void twoRows() {
        String input = "PAYPALISHIRING";
        String expected = "PYAIHRNAPLSIIG";
        assertEquals(expected, solution.convert(input, 2));
    }

    @Test
    void threeRows() {
        String input = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, solution.convert(input, 3));
    }

    @Test
    void fourRows() {
        String input = "PAYPALISHIRING";
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, solution.convert(input, 4));
    }
}
