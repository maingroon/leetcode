package com.maingroon;

import com.maingroon.utils.PropertiesLoader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3234Tests {

    private final Solution3234 solution = new Solution3234();

    @Test
    void test1() {
        String s = "00011";
        assertEquals(5, solution.numberOfSubstrings(s));
    }

    @Test
    void test2() {
        String s = "101101";
        assertEquals(16, solution.numberOfSubstrings(s));
    }

    @Test
    void optimizationTest() throws IOException {
        Properties properties = PropertiesLoader.loadProperties("large.properties");
        String s = properties.getProperty("test_3234_input");
        assertEquals(79998, solution.numberOfSubstrings(s));
    }
}
