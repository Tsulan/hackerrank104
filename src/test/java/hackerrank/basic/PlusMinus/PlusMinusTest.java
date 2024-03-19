package hackerrank.basic.PlusMinus;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTest {
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
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        Result.plusMinus(arr);

        String expectedOutput = "0.500000\n0.333333\n0.166667";
        String actualOutput = outContent.toString().trim();

        assertEquals(expectedOutput, actualOutput, "\nExpected:\n" + expectedOutput + "\nActual:\n" + actualOutput);
    }
}
