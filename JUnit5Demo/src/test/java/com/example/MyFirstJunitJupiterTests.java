package com.example;

import com.example.annotations.Fast;
import com.example.annotations.FastTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJunitJupiterTests {

    private final Calculator calculator = new Calculator();

    @FastTest
    void addition1() {
        assertEquals(2, calculator.add(1, 1));
    }

    @FastTest
    void addition2() {
        assertEquals(10.0, calculator.add(4.6, 5.4));
    }

    @FastTest
    void multiplication1() {
        assertEquals(100, calculator.multiply(10, 10));
    }

    @FastTest
    void multiplication2() {
        assertEquals(100.000000000000001, calculator.multiply(10, 10.0));
    }

    @Test
    @Fast
    void myFastTest() {

    }

}
