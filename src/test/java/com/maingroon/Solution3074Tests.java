package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3074Tests {

    private final Solution3074 solution = new Solution3074();

    @Test
    void test1() {
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};

        assertEquals(2, solution.minimumBoxes(apple, capacity));
    }

    @Test
    void test2() {
        int[] apple = {5, 5, 5};
        int[] capacity = {2, 4, 2, 7};

        assertEquals(4, solution.minimumBoxes(apple, capacity));
    }
}
