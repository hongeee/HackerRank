package com.hongeee.hackerrank.practice.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Objective
 * In this challenge, we're going to use loops to help us do some simple math.
 *
 * Task
 * Given an integer, N, print its first 10 multiples. Each multiple N (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
 *
 * Input Format
 *
 * A single integer, N.
 *
 * Constraints
 *  2 <= N <= 20
 * Output Format
 *
 * Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N x i in the form:
 * N x i = result.
 *
 * Sample Input
 */
public class LoopsI {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }

        bufferedReader.close();
    }
}
