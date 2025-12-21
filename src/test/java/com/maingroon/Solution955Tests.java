package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution955Tests {

    private final Solution955 solution = new Solution955();

    @Test
    void test1() {
        String[] strs = {"ca", "bb", "ac"};
        assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void test2() {
        String[] strs = {"xc", "yb", "za"};
        assertEquals(0, solution.minDeletionSize(strs));
    }

    @Test
    void test3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        assertEquals(3, solution.minDeletionSize(strs));
    }
}
