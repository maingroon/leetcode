package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1930Tests {

    private final Solution1930 solution = new Solution1930();

    @Test
    void test1() {
        String s = "aabca";
        assertEquals(3, solution.countPalindromicSubsequence(s));
    }

    @Test
    void test2() {
        String s = "abc";
        assertEquals(0, solution.countPalindromicSubsequence(s));
    }

    @Test
    void test3() {
        String s = "bbcbaba";
        assertEquals(4, solution.countPalindromicSubsequence(s));
    }
}
