package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Tests {

    private final Solution4 solution = new Solution4();

    @Test
    void test1() {
        int[] input1 = {1, 3};
        int[] input2 = {2};

        assertEquals(2.0, solution.findMedianSortedArrays(input1, input2));
    }

    @Test
    void test2() {
        int[] input1 = {1, 2};
        int[] input2 = {3, 4};

        assertEquals(2.5, solution.findMedianSortedArrays(input1, input2));
    }
}
