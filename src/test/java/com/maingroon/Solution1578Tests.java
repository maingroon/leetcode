package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1578Tests {

    private final Solution1578 solution = new Solution1578();

    @Test
    void test1() {
        String colors = "abaac";
        int[] neededTime = {1, 2, 3, 4, 5};
        assertEquals(3, solution.minCost(colors, neededTime));
    }

    @Test
    void test2() {
        String colors = "abc";
        int[] neededTime = {1, 2, 3};
        assertEquals(0, solution.minCost(colors, neededTime));
    }

    @Test
    void test3() {
        String colors = "aabaa";
        int[] neededTime = {1,2,3,4,1};
        assertEquals(2, solution.minCost(colors, neededTime));
    }

    @Test
    void test4() {
        String colors = "aaabbbabbbb";
        int[] neededTime = {3,5,10,7,5,3,5,5,4,8,1};
        assertEquals(26, solution.minCost(colors, neededTime));
    }
}
