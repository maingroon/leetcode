package com.maingroon;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution3433Tests {

    private final Solution3433 solution = new Solution3433();

    @Test
    void test1() {
        int numberOfUsers = 2;
        List<List<String>> events = new ArrayList<>();
        events.add(List.of("MESSAGE", "10", "id1 id0"));
        events.add(List.of("OFFLINE", "11", "0"));
        events.add(List.of("MESSAGE", "71", "HERE"));
        assertArrayEquals(new int[]{2, 2}, solution.countMentions(numberOfUsers, events));
    }

    @Test
    void test2() {
        int numberOfUsers = 2;
        List<List<String>> events = new ArrayList<>();
        events.add(List.of("MESSAGE", "10", "id1 id0"));
        events.add(List.of("OFFLINE", "11", "0"));
        events.add(List.of("MESSAGE", "12", "ALL"));
        assertArrayEquals(new int[]{2, 2}, solution.countMentions(numberOfUsers, events));
    }

    @Test
    void test3() {
        int numberOfUsers = 2;
        List<List<String>> events = new ArrayList<>();
        events.add(List.of("OFFLINE", "10", "0"));
        events.add(List.of("MESSAGE", "12", "HERE"));
        assertArrayEquals(new int[]{0, 1}, solution.countMentions(numberOfUsers, events));
    }

    @Test
    void test4() {
        int numberOfUsers = 3;
        List<List<String>> events = new ArrayList<>();
        events.add(List.of("MESSAGE", "2", "HERE"));
        events.add(List.of("OFFLINE", "2", "1"));
        events.add(List.of("OFFLINE", "1", "0"));
        events.add(List.of("MESSAGE", "61", "HERE"));
        assertArrayEquals(new int[]{1, 0, 2}, solution.countMentions(numberOfUsers, events));
    }

    @Test
    void test5() {
        int numberOfUsers = 3;
        List<List<String>> events = new ArrayList<>();
        events.add(List.of("MESSAGE", "1", "id0 id1"));
        events.add(List.of("MESSAGE", "5", "id2"));
        events.add(List.of("MESSAGE", "6", "ALL"));
        events.add(List.of("OFFLINE", "5", "2"));
        assertArrayEquals(new int[]{2, 2, 2}, solution.countMentions(numberOfUsers, events));
    }
}
