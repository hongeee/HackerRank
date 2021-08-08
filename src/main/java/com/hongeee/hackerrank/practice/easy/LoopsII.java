package com.hongeee.hackerrank.practice.easy;

import java.util.Scanner;

/**
 * We use the integers a, b, and n to create the following series:
 *  (a + 20 * b),(a + 20 * b + 21 * b),...,(a + 20 * b + 21 + ... + 2n-1 * b)
 *
 * You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
 *
 * Input Format
 *
 * The first line contains an integer, q, denoting the number of queries.
 * Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.
 *
 * Constraints
 *  0 <= q <= 500
 *  0 <= a, b <= 50
 *  1 <= n <= 15
 *
 * Output Format
 *
 * For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
 *
 * Sample Input
 *
 * 2
 * 0 2 10
 * 5 3 5
 * Sample Output
 *
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 * Explanation
 *
 * We have two queries:
 *
 * We use a = 0, b = 2, and n = 10 to produce some series 80,81,...,8n-1:
 *   s0 = 0 + 1 * 2 = 2;
 *   s1 = 0 + 1 * 2 + 2 * 2 = 6
 *   s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14
 * ... and so on.
 *
 * Once we hit n = 10, we print the first ten terms as a single line of space-separated integers.
 *
 * We use a = 5, b = 3, and n = 5 to produce some series 80,81,...,8n-1:
 *
 * We then print each element of our series as a single line of space-separated values.
 */
public class LoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(String.format("%d ", sum));
            }

            System.out.println();
        }

        in.close();
    }
}
