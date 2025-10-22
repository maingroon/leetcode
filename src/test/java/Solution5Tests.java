import com.maingroon.Solution5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution5Tests {

    private final Solution5 solution = new Solution5();

    @Test
    void palindromic() {
        String palindromic1 = "bcdaadcb";
        String palindromic2 = "aboba";
        assertEquals(palindromic1, solution.longestPalindrome(palindromic1));
        assertEquals(palindromic2, solution.longestPalindrome(palindromic2));
    }

    @Test
    void oneSymbol() {
        String a = "a";
        String b = "b";
        assertEquals(a, solution.longestPalindrome(a));
        assertEquals(b, solution.longestPalindrome(b));
    }

    @Test
    void internal1() {
        String check = "cbcdcbedcbc";
        assertEquals("bcdcb", solution.longestPalindrome(check));
    }

    @Test
    void internal2() {
        String check = "abbcccbbbcaaccbababcbcabca";
        assertEquals("bbcccbb", solution.longestPalindrome(check));
    }

    @Test
    void internal3() {
        String check = "cbbd";
        assertEquals("bb", solution.longestPalindrome(check));
    }
}