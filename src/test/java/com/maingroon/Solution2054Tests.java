package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2054Tests {

    private final Solution2054 solution = new Solution2054();

    @Test
    void test1() {
        int[][] events = {{1, 3, 2}, {4, 5, 2}, {2, 4, 3}};
        assertEquals(4, solution.maxTwoEvents(events));
    }

    @Test
    void test2() {
        int[][] events = {{1, 3, 2}, {4, 5, 2}, {1, 5, 5}};
        assertEquals(5, solution.maxTwoEvents(events));
    }

    @Test
    void test3() {
        int[][] events = {{1, 5, 3}, {1, 5, 1}, {6, 6, 5}};
        assertEquals(8, solution.maxTwoEvents(events));
    }

    @Test
    void test4() {
        int[][] events = {
                {19, 36, 24}, {70, 90, 11}, {61, 78, 36}, {38, 38, 70}, {39, 83, 72}, {8, 46, 5}, {64, 69, 49},
                {88, 89, 39}, {53, 77, 24}, {35, 76, 26}
        };
        assertEquals(142, solution.maxTwoEvents(events));
    }
}
