package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3577Tests {

    private final Solution3577 solution = new Solution3577();

    @Test
    void test1() {
        int[] complexity = {1, 2, 3};
        assertEquals(2, solution.countPermutations(complexity));
    }

    @Test
    void test2() {
        int[] complexity = {3, 3, 3, 4, 4, 4};
        assertEquals(0, solution.countPermutations(complexity));
    }
}
