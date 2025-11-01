package com.maingroon;

import com.maingroon.Solution3217.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3217Tests {

    private final Solution3217 solution = new Solution3217();

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
        int[] nums = new int[]{1, 2, 3};
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        ListNode expected = new ListNode(5);
        expected = new ListNode(4, expected);
        checkListNodeEquality(expected, solution.modifiedList(nums, head));
    }

    @Test
    void test2() {
        int[] nums = new int[]{1};
        ListNode head = new ListNode(2);
        head = new ListNode(1, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        ListNode expected = new ListNode(2);
        expected = new ListNode(2, expected);
        expected = new ListNode(2, expected);
        checkListNodeEquality(expected, solution.modifiedList(nums, head));
    }

    @Test
    void test3() {
        int[] nums = new int[]{5};
        ListNode head = new ListNode(4);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        ListNode expected = new ListNode(4);
        expected = new ListNode(3, expected);
        expected = new ListNode(2, expected);
        expected = new ListNode(1, expected);
        checkListNodeEquality(expected, solution.modifiedList(nums, head));
    }
}
