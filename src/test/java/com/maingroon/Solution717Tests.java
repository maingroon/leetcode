package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution717Tests {

    private final Solution717 solution = new Solution717();

    @Test
    void test1() {
        int[] bits = {1,0,0};
        assertTrue(solution.isOneBitCharacter(bits));
    }

    @Test
    void test2() {
        int[] bits = {1,1,1,0};
        assertFalse(solution.isOneBitCharacter(bits));
    }
}
