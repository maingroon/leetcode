import com.maingroon.Solution9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution9Tests {

    private final Solution9 solution = new Solution9();

    @Test
    void testSimplePalindrome() {
        int input = 121;
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    void testNegative() {
        int input = -121;
        assertFalse(solution.isPalindrome(input));
    }

    @Test
    void testNotPalindrome() {
        int input = 10;
        assertFalse(solution.isPalindrome(input));
    }
}
