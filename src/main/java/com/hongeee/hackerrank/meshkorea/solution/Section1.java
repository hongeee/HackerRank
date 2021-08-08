package com.hongeee.hackerrank.meshkorea.solution;

import java.util.Scanner;

/**
 * Java Exceptions: Securing Messages
 *
 * Create an Encrypter class to handle input validation and encryption. It should have the method String getEncryptedName(String name) that performs a simple string manipulation.
 *
 * The getEncryptedName method must perform the following tasks:
 *  Validate the name by calling the validate(name) method provided in the Validator class
 *  If the name validation returns true:
 *   Reverse the entire string and convert uppper-case letters to lower-case
 *   Return the modified string
 *  If the name validation returns false:
 *   Throw an exception of IllegalArgumentException class with the message 'Try again with valid name'
 *
 * The locked stub code in th editor provides the complete implementation of the Validator class and validates the implementation of the Encrypter class.
 */
public class Section1 {

    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();

        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

class Encrypter {
    public static String getEncryptedName(String name) {
        Validator validator = new Validator();

        // invalid
        if (!validator.validate(name)) {
            throw new IllegalArgumentException("Try again with valid name");
        }

        // convert upper-case to lower-case
        // reverse the entire string
        StringBuilder sb = new StringBuilder(name.toLowerCase());
        sb.reverse();

        return sb.toString();
    }
}