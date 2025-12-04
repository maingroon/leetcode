package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2211Tests {

    private final Solution2211 solution = new Solution2211();

    @Test
    void test1() {
        String directions = "RLRSLL";
        assertEquals(5, solution.countCollisions(directions));
    }

    @Test
    void test2() {
        String directions = "LLRR";
        assertEquals(0, solution.countCollisions(directions));
    }

    @Test
    void test3() {
        String directions = "LLSLRRLSRR";
        assertEquals(4, solution.countCollisions(directions));
    }
}
