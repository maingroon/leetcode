package com.maingroon;

public class Solution278 {

    private final int badVersion;

    Solution278(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public int firstBadVersion(int n) {
        int from = 1;
        int to = n;
        while (from != to) {
            int mid = (from / 2) + (to / 2);
            if (isBadVersion(mid)) {
                to = mid;
            } else {
                from = mid + 1;
            }
        }
        return from;
    }
}
