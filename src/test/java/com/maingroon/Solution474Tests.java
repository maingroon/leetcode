package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution474Tests {

    private final Solution474 solution = new Solution474();

    @Test
    void test1() {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, solution.findMaxForm(strs, m, n));
    }

    @Test
    void test2() {
        String[] strs = {"10", "0", "1"};
        int m = 1;
        int n = 1;
        assertEquals(2, solution.findMaxForm(strs, m, n));
    }

    @Test
    void test3() {
        String[] strs = {"00011", "00001", "00001", "0011", "111"};
        int m = 8;
        int n = 5;
        assertEquals(3, solution.findMaxForm(strs, m, n));
    }

    @Test
    void test4() {
        String[] strs = {"11","11","0","0","10","1","1","0","11","1","0","111","11111000","0","11","000","1","1","0","00","1","101","001","000","0","00","0011","0","10000"};
        int m = 90;
        int n = 66;
        assertEquals(29, solution.findMaxForm(strs, m, n));
    }
}
