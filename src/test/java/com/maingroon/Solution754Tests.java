package com.maingroon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution754Tests {

    private final Solution754 solution = new Solution754();

    @Test
    void test1() {
        String bottom = "BCD";
        List<String> allowed = List.of("BCC", "CDE", "CEA", "FFF");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void test2() {
        String bottom = "AAAA";
        List<String> allowed = List.of("AAB", "AAC", "BCD", "BBE", "DEF");
        assertFalse(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void test3() {
        String bottom = "ABCD";
        List<String> allowed = List.of("ABC", "BCA", "CDA", "ABD", "BCE", "CDF", "DEA", "EFF", "AFF");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }
}
