package hackerrank.basic.MiniMaxSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = 0;
        long maxSum = 0;

        arr.sort(Comparator.naturalOrder());

        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

}
