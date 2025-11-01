package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Tests {

    private final Solution1 solution = new Solution1();

    private static void checkAnswer(int[] expected, int[] actual) {
        assertTrue((expected[0] == actual[0] && expected[1] == actual[1])
                || (expected[0] == actual[1] && expected[1] == actual[0]));
    }

    @Test
    void twoNumsArray() {
        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(nums, target);

        checkAnswer(expected, actual);
    }

    @Test
    void threeNumsArray() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;

        int[] expected = new int[]{1, 2};
        int[] actual = solution.twoSum(nums, target);

        checkAnswer(expected, actual);
    }

    @Test
    void fourNumsArray() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(nums, target);

        checkAnswer(expected, actual);
    }
}
