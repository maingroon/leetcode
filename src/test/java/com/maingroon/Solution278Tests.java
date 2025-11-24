package com.maingroon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution278Tests {

    @Test
    void test1() {
        int badVersion = 4;
        Solution278 solution278 = new Solution278(badVersion);

        int n = 5;
        assertEquals(badVersion, solution278.firstBadVersion(n));
    }

    @Test
    void test2() {
        int badVersion = 1;
        Solution278 solution278 = new Solution278(badVersion);

        int n = 1;
        assertEquals(badVersion, solution278.firstBadVersion(n));
    }

    @Test
    void test3() {
        int badVersion = 1702766719;
        Solution278 solution278 = new Solution278(badVersion);

        int n = 2126753390;
        assertEquals(badVersion, solution278.firstBadVersion(n));
    }
}
