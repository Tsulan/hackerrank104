package hackerrank.basic.TimeConversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String timeConverted = s.substring(0, s.length() - 2);

//        if (s.contains("AM") && !s.startsWith("12"))
//            return timeConverted;
//
//
//        if (s.startsWith("12") && s.contains("PM"))
//            return timeConverted;

        Map<String, String> map12to24Hours = Stream.of(new String[][]{
                {"12AM", "00"},
                {"01PM", "13"},
                {"02PM", "14"},
                {"03PM", "15"},
                {"04PM", "16"},
                {"05PM", "17"},
                {"06PM", "18"},
                {"07PM", "19"},
                {"08PM", "20"},
                {"09PM", "21"},
                {"10PM", "22"},
                {"11PM", "23"},
                {"12PM", "12"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        String minutesAndSeconds = timeConverted.substring(2);
        String hour = s.substring(0, 2);
        String pmOrAm = s.substring(s.length() - 2);
        String hourWithFormat = hour + pmOrAm;

        if (map12to24Hours.containsKey(hourWithFormat)) {
            String newHour = map12to24Hours.get(hourWithFormat);
            timeConverted = newHour + minutesAndSeconds;
        }

//        System.out.println(timeConverted);

        return timeConverted;
    }
}
