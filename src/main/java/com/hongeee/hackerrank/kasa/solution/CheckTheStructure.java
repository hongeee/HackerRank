package com.hongeee.hackerrank.kasa.solution;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CheckTheStructure {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static String isValid(List<Integer> a) {
        // Write your code here
        int root = -1;
        int left = -1;
        int right = -1;

        for (int i : a) {
            if (root == -1) {
                root = i;
                continue;
            }

            // left
            if (i < root) {
                if (left == -1) {
                    left = i;
                    continue;
                } else {
                    if (left > i) {
                        root = left;
                        left = i;
                        continue;
                    } else {
                        root = left;
                        right = i;
                        continue;
                    }
                }
            }

            // right
            if (i > root) {
                if (right == -1) {
                    right = i;
                    continue;
                } else {
                    if (right < i) {
                        root = right;
                        right = i;
                        continue;
                    } else {
                        root = right;
                        left = i;
                        continue;
                    }
                }
            }

            return "NO";
        }

        return "YES";
    }

    static boolean checkBST(Node root) {
        return isBSTNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTNode(Node root, int min, int max){
        boolean isBstNode = false;
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }
        return (isBSTNode(root.left, min, root.data-1) && isBSTNode(root.right, root.data+1, max));
    }

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 3, 4, 2 };
        System.out.println(isValid(Arrays.asList(arr)));

        arr = new Integer[] { 3, 2, 4, 1, 5 };
        System.out.println(isValid(Arrays.asList(arr)));
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                int aCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                String result = isValid(a);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}
