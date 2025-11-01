package com.maingroon;

import com.maingroon.Solution2.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Tests {

    private final Solution2 solution = new Solution2();

    private void checkListNodeEquality(ListNode expected, ListNode actual) {
        while (expected != null) {
            assertNotNull(actual);
            assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }
        assertNull(actual);
    }

    @Test
    void test1() {
        ListNode input1 = new ListNode(3);
        input1 = new ListNode(4, input1);
        input1 = new ListNode(2, input1);

        ListNode input2 = new ListNode(4);
        input2 = new ListNode(6, input2);
        input2 = new ListNode(5, input2);

        ListNode expected = new ListNode(8);
        expected = new ListNode(0, expected);
        expected = new ListNode(7, expected);

        ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }

    @Test
    void test2() {
        ListNode input1 = new ListNode(0);

        ListNode input2 = new ListNode(0);

        ListNode expected = new ListNode(0);

        ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }

    @Test
    void test3() {
        ListNode input1 = new ListNode(9);
        input1 = new ListNode(9, input1);
        input1 = new ListNode(9, input1);
        input1 = new ListNode(9, input1);
        input1 = new ListNode(9, input1);
        input1 = new ListNode(9, input1);
        input1 = new ListNode(9, input1);

        ListNode input2 = new ListNode(9);
        input2 = new ListNode(9, input2);
        input2 = new ListNode(9, input2);
        input2 = new ListNode(9, input2);

        ListNode expected = new ListNode(1);
        expected = new ListNode(0, expected);
        expected = new ListNode(0, expected);
        expected = new ListNode(0, expected);
        expected = new ListNode(9, expected);
        expected = new ListNode(9, expected);
        expected = new ListNode(9, expected);
        expected = new ListNode(8, expected);

        ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }
}
