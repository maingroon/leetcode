package com.maingroon;

class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        } else if (nums1.length == 1 || nums2.length == 1) {
            return mergeAndFindMedianSortedArrays(nums1, nums2);
        }


        if (nums1.length < nums2.length) {
            return findMedianBySmaller(nums1, nums2);
        } else {
            return findMedianBySmaller(nums2, nums1);
        }
    }

    private double findMedianBySmaller(int[] smaller, int[] larger) {
        int m = smaller.length;
        int n = larger.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;

            int leftX = (i == 0) ? Integer.MIN_VALUE : smaller[i - 1];
            int rightX = (i == m) ? Integer.MAX_VALUE : smaller[i];
            int leftY = (j == 0) ? Integer.MIN_VALUE : larger[j - 1];
            int rightY = (j == n) ? Integer.MAX_VALUE : larger[j];

            if (leftX <= rightY && leftY <= rightX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                } else {
                    return Math.max(leftX, leftY);
                }
            } else if (leftX > rightY) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        throw new IllegalArgumentException("No median solution found for these arguments");
    }

    private double mergeAndFindMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < merged.length; i++) {
            if (i2 >= nums2.length || (i1 < nums1.length && nums1[i1] < nums2[i2])) {
                merged[i] = nums1[i1];
                i1++;
            } else {
                merged[i] = nums2[i2];
                i2++;
            }
        }

        if (merged.length % 2 == 0) {
            return (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2.0;
        } else {
            return merged[merged.length / 2];
        }
    }

//    first attempt solution
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] merged = new int[nums1.length + nums2.length];
//        int i1 = 0;
//        int i2 = 0;
//        for (int i = 0; i < merged.length; i++) {
//            if (i2 >= nums2.length || (i1 < nums1.length && nums1[i1] < nums2[i2])) {
//                merged[i] = nums1[i1];
//                i1++;
//            } else {
//                merged[i] = nums2[i2];
//                i2++;
//            }
//        }
//
//        if (merged.length % 2 == 1) {
//            return merged[merged.length / 2];
//        } else {
//            return (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2.0;
//        }
//    }
}
