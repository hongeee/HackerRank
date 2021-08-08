package com.hongeee.hackerrank.meshkorea.solution;

import java.io.*;
import java.util.*;

/**
 * Is the Number Present
 *
 * Given an array of integers, for each element determine whether that element occurs earlier in the array and whether it occurs later in the array.
 * Create two strings of binary digits. In the first string, each character is a 1 if the value at that index also occurs earlier int the array, or 0 if not.
 * In the second string, each character is a 1 if the value at that index occurs later in the array, or 0 if not.
 * Return an array of two strings where the first string is related to lower indices and the second to higher.
 */
public class Section2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < numCount; i++) {
            int numItem = Integer.parseInt(bufferedReader.readLine().trim());
            num.add(numItem);
        }

        List<String> result = Result.bitPattern(num);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'bitPattern' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER_ARRAY num as parameter.
     */

    public static List<String> bitPattern(List<Integer> num) {
        // Write your code here
        Queue<Integer> queue = new LinkedList<Integer>(num);
        Set<Integer> set = new HashSet<>();

        StringBuilder bit1 = new StringBuilder();
        StringBuilder bit2 = new StringBuilder();

        while (!queue.isEmpty()) {
            int i = queue.poll();

            // whether occur earlier in the array
            if (!set.contains(i)) {
                // add bit1 value : 0
                set.add(i);
                bit1.append(0);
            } else {
                // add bit1 value : 1
                bit1.append(1);
            }

            // whether occur later in the array
            if (!queue.contains(i)) {
                // add bit2 value : 0
                bit2.append(0);
            } else {
                // add bit2 value : 1
                bit2.append(1);
            }
        }

        List<String> str = new ArrayList<>();
        str.add(bit1.toString());
        str.add(bit2.toString());

        return str;
    }
}
