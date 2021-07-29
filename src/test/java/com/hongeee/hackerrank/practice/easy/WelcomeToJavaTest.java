package com.hongeee.hackerrank.practice.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeToJavaTest {

    private ByteArrayOutputStream console;

    @BeforeEach
    void beforeEach() {
        console = new ByteArrayOutputStream();
        System.setOut(new PrintStream(console));
    }

    @Test
    void solution() {
        WelcomeToJava.main(null);
        assertEquals(String.format("Hello, World.%sHello, Java.%s", System.lineSeparator(), System.lineSeparator()), console.toString());
    }
}