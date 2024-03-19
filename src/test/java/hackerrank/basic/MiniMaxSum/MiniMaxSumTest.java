package hackerrank.basic.MiniMaxSum;

import hackerrank.basic.MiniMaxSum.Result;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniMaxSumTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPlusMinus() {
        List<Integer> arr = Arrays.asList(7, 69, 2, 221, 8974);
        Result.miniMaxSum(arr);

        String expectedOutput = "299 9271";
        String actualOutput = outContent.toString().trim();

        assertEquals(expectedOutput, actualOutput, "\nExpected:\n" + expectedOutput + "\nActual:\n" + actualOutput);
    }
}
