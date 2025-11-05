package com.maingroon;

import com.maingroon.utils.PropertiesLoader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution3321Tests {

    private final Solution3321 solution = new Solution3321();

    @Test
    void test1() {
        int[] nums = {1, 1, 2, 2, 3, 4, 2, 3};
        int k = 6;
        int x = 2;
        assertArrayEquals(new long[]{6, 10, 12}, solution.findXSum(nums, k, x));
    }

    @Test
    void test2() {
        int[] nums = {3, 8, 7, 8, 7, 5};
        int k = 2;
        int x = 2;
        assertArrayEquals(new long[]{11, 15, 15, 15, 12}, solution.findXSum(nums, k, x));
    }

    @Test
    void overflowInt() {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
        int k = 6;
        int x = 1;
        assertArrayEquals(new long[]{6000000000L}, solution.findXSum(nums, k, x));
    }

    @Test
    void optimizationTest() throws IOException {
        Properties properties = PropertiesLoader.loadProperties("large.properties");
        int[] nums = Stream.of(properties.getProperty("test_3321_input").split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int k = 2519;
        int x = 1320;
        long[] expected = Stream.of(properties.getProperty("test_3321_expected").split(","))
                .mapToLong(Long::parseLong)
                .toArray();
        assertTrue(expected.length > 0);
        assertArrayEquals(expected, solution.findXSum(nums, k, x));
    }
}
