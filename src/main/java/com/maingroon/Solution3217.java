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
class Solution3217 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        boolean[] filter = new boolean[max];
        for (int num : nums) {
            filter[num - 1] = true;
        }

        ListNode current = new ListNode();
        ListNode result = current;
        while (head != null) {
            if (head.val > filter.length || !filter[head.val - 1]) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        result = result.next;
        return result;
    }

//    first attempt solution using hash set
//    public ListNode modifiedList(int[] nums, ListNode head) {
//        HashSet<Integer> numsSet = new HashSet<>(nums.length);
//        for (int idx = 0; idx < nums.length; idx++) {
//            numsSet.add(nums[idx]);
//        }
//
//        ListNode current = new ListNode();
//        ListNode result = current;
//
//        while (head != null) {
//            if (!numsSet.contains(head.val)) {
//                current.next = new ListNode(head.val);
//                current = current.next;
//            }
//            head = head.next;
//        }
//        result = result.next;
//        return result;
//    }
}
