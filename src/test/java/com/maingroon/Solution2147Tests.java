package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2147Tests {

    private final Solution2147 solution = new Solution2147();

    @Test
    void test1() {
        String corridor = "SSPPSPS";
        assertEquals(3, solution.numberOfWays(corridor));
    }

    @Test
    void test2() {
        String corridor = "PPSPSP";
        assertEquals(1, solution.numberOfWays(corridor));
    }

    @Test
    void test3() {
        String corridor = "S";
        assertEquals(0, solution.numberOfWays(corridor));
    }

    @Test
    void test4() {
        String corridor = "SPSPPSSPSSSS";
        assertEquals(6, solution.numberOfWays(corridor));
    }
}
