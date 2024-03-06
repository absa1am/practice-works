package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Standard Test Class")
class StandardTests {

    @BeforeAll
    @DisplayName("@BeforeAll")
    static void initAll() {
        System.out.println("initAll()");
    }

    @BeforeEach
    void init() {
        System.out.println("init()");
    }

    @Test
    void succedingTest() {

    }

    @Test
    @DisplayName("A failing test")
    void failingTest() {
//        fail("A failing test");
    }

    @Test
    @Disabled("For demonstration purposes")
    void skippedTest() {
        // Not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("Test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    @DisplayName("@AfterAll")
    static void tearDownAll() {
        System.out.println("tearDownAll()");
    }

}
