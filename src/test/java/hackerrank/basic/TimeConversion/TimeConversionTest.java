package hackerrank.basic.TimeConversion;


import org.junit.jupiter.api.Test;

import static hackerrank.basic.TimeConversion.Result.timeConversion;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTest {

    @Test
    public void testTimeConversion() {
        assertAll(
                () -> assertEquals("19:05:45", timeConversion("07:05:45PM")),
                () -> assertEquals("07:05:45", timeConversion("07:05:45AM")),
                () -> assertEquals("12:01:00", timeConversion("12:01:00PM")),
                () -> assertEquals("00:01:00", timeConversion("12:01:00AM"))
        );
    }
}
