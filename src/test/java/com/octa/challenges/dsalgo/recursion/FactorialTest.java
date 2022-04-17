package com.octa.challenges.dsalgo.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        assert (Factorial.factorial(5) == 120);
    }
}