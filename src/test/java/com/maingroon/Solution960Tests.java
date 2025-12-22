package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution960Tests {

    private final Solution960 solution = new Solution960();

    @Test
    void test1() {
        String[] strs = {"babca","bbazb"};
        assertEquals(3, solution.minDeletionSize(strs));
    }

    @Test
    void test2() {
        String[] strs = {"edcba"};
        assertEquals(4, solution.minDeletionSize(strs));
    }

    @Test
    void test3() {
        String[] strs = {"ghi","def","abc"};
        assertEquals(0, solution.minDeletionSize(strs));
    }
}
