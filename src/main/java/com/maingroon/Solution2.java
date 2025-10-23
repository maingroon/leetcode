package com.maingroon;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution2 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = getNumber(l1) + getNumber(l2);

        ListNode result = null;
        while (sum > 9) {
            result = new ListNode(sum % 10, result);
            sum /= 10;
        }
        result = new ListNode(sum % 10, result);
        
        return result;
    }
    
    private int getNumber(ListNode node) {
        int result = 0;
        for (int multiplier = 1; node != null; multiplier *= 10) {
            result += node.val * multiplier;
            node = node.next;
        }
        return result;
    }
}