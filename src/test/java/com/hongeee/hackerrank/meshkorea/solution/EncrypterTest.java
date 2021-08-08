package com.hongeee.hackerrank.meshkorea.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncrypterTest {

    @Test
    void getEncryptedNameTest() {
        assertEquals("telsniw etak", Encrypter.getEncryptedName("Kate Winslet"));
        assertThrows(IllegalArgumentException.class, () -> Encrypter.getEncryptedName("Kate Wins?let"), "Try again with valid name");
        assertEquals("nart aynos", Encrypter.getEncryptedName("Sonya Tran"));
        assertEquals("zepol latsyrc", Encrypter.getEncryptedName("Crystal Lopez"));
        assertEquals("nosdrahcir aseret", Encrypter.getEncryptedName("Teresa Richardson"));
    }
}