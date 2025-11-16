package com.maingroon;

import com.maingroon.utils.PropertiesLoader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1513Tests {

    private final Solution1513 solution = new Solution1513();

    @Test
    void test1() {
        String s = "0110111";
        assertEquals(9, solution.numSub(s));
    }

    @Test
    void test2() {
        String s = "101";
        assertEquals(2, solution.numSub(s));
    }

    @Test
    void test3() {
        String s = "111111";
        assertEquals(21, solution.numSub(s));
    }

    @Test
    void moduloCutTest() throws IOException {
        Properties properties = PropertiesLoader.loadProperties("large.properties");
        String s = properties.getProperty("test_1513_input");
        assertEquals(200542505, solution.numSub(s));
    }
}
