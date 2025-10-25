import com.maingroon.Solution7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution7Tests {

    private final Solution7 solution = new Solution7();

    @Test
    void test1() {
        int input = 123;
        assertEquals(321, solution.reverse(input));
    }

    @Test
    void test2() {
        int input = -123;
        assertEquals(-321, solution.reverse(input));
    }

    @Test
    void test3() {
        int input = 120;
        assertEquals(21, solution.reverse(input));
    }
}
