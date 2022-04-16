package com.octa.challenges.dsalgo.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    void encrypt() {
        String a = "HELLO";
        assert caesarCipher.encrypt(a).equals("KHOOR");
    }

    @Test
    void decrypt() {
        String encrypted = "KHOOR";
        assert caesarCipher.decrypt(encrypted).equals("HELLO");
    }
}