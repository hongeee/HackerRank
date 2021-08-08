package com.hongeee.hackerrank.kasa.solution;

import java.util.Stack;

public class SimpleCustomerSupportTicketing {

    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] result = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            String s = values[i];
            char[] chars = s.toCharArray();

            if (chars.length % 2 != 0) {
                result[i] = "NO";
                continue;
            }

            Stack stack = new Stack();

            for (char c : chars) {
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                    continue;
                }

                if (stack.size() == 0) {
                    result[i] = "NO";
                    break;
                }

                char peek = (char) stack.peek();

                switch (c) {
                    case '}':
                        if (peek == '{') {
                            stack.pop();
                            continue;
                        }
                    case ']':
                        if (peek == '[') {
                            stack.pop();
                            continue;
                        }
                    case ')':
                        if (peek == '(') {
                            stack.pop();
                            continue;
                        }
                }
            }

            if (!stack.isEmpty()) {
                result[i] = "NO";
            }

            if (result[i] == null) {
                result[i] = "YES";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] result = braces(new String[] { "{}[]()", "{[}]" });

        for (String s : result) {
            System.out.println(s);
        }

        result = braces(new String[] { "({}([][]))[]()" });

        for (String s : result) {
            System.out.println(s);
        }

        result = braces(new String[] { "{{", "{{()" });

        for (String s : result) {
            System.out.println(s);
        }
    }

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int valuesCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] values = new String[valuesCount];
//
//        for (int i = 0; i < valuesCount; i++) {
//            String valuesItem = scanner.nextLine();
//            values[i] = valuesItem;
//        }
//
//        String[] res = braces(values);
//
//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(res[i]);
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
