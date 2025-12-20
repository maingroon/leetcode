package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution944Tests {

    private final Solution944 solution = new Solution944();

    @Test
    void test1() {
        String[] strs = {"cba","daf","ghi"};
        assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void test2() {
        String[] strs = {"a", "b"};
        assertEquals(0, solution.minDeletionSize(strs));
    }

    @Test
    void test3() {
        String[] strs = {"zyx","wvu","tsr"};
        assertEquals(3, solution.minDeletionSize(strs));
    }
}
