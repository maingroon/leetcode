import com.maingroon.Solution6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution6Tests {

    private final Solution6 problem = new Solution6();

    @Test
    void singleChar() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, problem.convert(input, 1));
    }

    @Test
    void oneRow() {
        String input = "PAYPALISHIRING";
        String expected = "PAYPALISHIRING";
        assertEquals(expected, problem.convert(input, 1));
    }

    @Test
    void twoRows() {
        String input = "PAYPALISHIRING";
        String expected = "PYAIHRNAPLSIIG";
        assertEquals(expected, problem.convert(input, 2));
    }

    @Test
    void threeRows() {
        String input = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, problem.convert(input, 3));
    }

    @Test
    void fourRows() {
        String input = "PAYPALISHIRING";
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, problem.convert(input, 4));
    }
}
