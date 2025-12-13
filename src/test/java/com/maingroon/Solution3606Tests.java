package com.maingroon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution3606Tests {

    private final Solution3606 solution = new Solution3606();

    @Test
    void test1() {
        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
        String[] businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isActive = {true, true, true, true};

        Assertions.assertLinesMatch(
                List.of("PHARMA5", "SAVE20"),
                solution.validateCoupons(code, businessLine, isActive)
        );
    }

    @Test
    void test2() {
        String[] code = {"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"};
        String[] businessLine = {"grocery", "electronics", "invalid"};
        boolean[] isActive = {false, true, true};

        Assertions.assertLinesMatch(
                List.of("ELECTRONICS_50"),
                solution.validateCoupons(code, businessLine, isActive)
        );
    }
}
