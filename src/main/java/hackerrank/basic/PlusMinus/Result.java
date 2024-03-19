package hackerrank.basic.PlusMinus;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int n = arr.size();
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

//        for (Integer element : arr) {
//            if (element > 0) {
//                positiveCount++;
//            } else if (element < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//        }

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            } else if (arr.get(i) < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

//        double proportionPositive = positiveCount / n;
//        double proportionNegative = negativeCount / n;
//        double proportionZero = zeroCount / n;

//        printWithSixDigits(proportionPositive);
//        printWithSixDigits(proportionNegative);
//        printWithSixDigits(proportionZero);

        String proportionPositive = String.format("%.6f", positiveCount / n);
        String proportionNegative = String.format("%.6f", negativeCount / n);
        String proportionZero = String.format("%.6f", zeroCount / n);

        String result = proportionPositive + "\n" + proportionNegative + "\n" + proportionZero;

        System.out.println(result);
    }

//    private static void printWithSixDigits(double number) {
//        String formatted = String.format("%.6f", number);
//        System.out.println(formatted);
//    }

}
