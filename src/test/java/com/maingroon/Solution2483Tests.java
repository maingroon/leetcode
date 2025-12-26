package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2483Tests {

    private final Solution2483 solution = new Solution2483();

    @Test
    void test1() {
        String customers = "YYNY";
        assertEquals(2, solution.bestClosingTime(customers));
    }

    @Test
    void test2() {
        String customers = "NNNNN";
        assertEquals(0, solution.bestClosingTime(customers));
    }

    @Test
    void test3() {
        String customers = "YYYY";
        assertEquals(4, solution.bestClosingTime(customers));
    }
}
