package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Tests {

    private final Solution3 solution = new Solution3();

    @Test
    void test1() {
        String input = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void test2() {
        String input = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void test3() {
        String input = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(input));
    }
}
