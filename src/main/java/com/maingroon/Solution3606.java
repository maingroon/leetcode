package com.maingroon;

import java.util.ArrayList;
import java.util.List;

public class Solution3606 {

    private static final List<String> VALID_BUSINESS_LIES = List.of("electronics", "grocery", "pharmacy", "restaurant");

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        List<Integer> validCoupons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) {
                continue;
            }
            if (isCodeValid(code[i]) && isBusinessLineValid(businessLine[i])) {
                validCoupons.add(i);
            }
        }
        validCoupons
                .sort((c1, c2) -> {
                    int result = businessLine[c1].compareTo(businessLine[c2]);
                    if (result == 0) {
                        return code[c1].compareTo(code[c2]);
                    }
                    return result;
                });

        return validCoupons
                .stream()
                .map(c -> code[c])
                .toList();
    }

    private boolean isCodeValid(String code) {
        if (code == null || code.isEmpty()) {
            return false;
        }
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '_')) {
                return false;
            }
        }
        return true;
    }

    private boolean isBusinessLineValid(String businessLine) {
        return VALID_BUSINESS_LIES.contains(businessLine);
    }
}
