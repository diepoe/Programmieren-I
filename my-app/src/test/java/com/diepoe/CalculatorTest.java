package com.diepoe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calc.subtract(5, 4));
    }

    @AfterEach
    void tearDown() {
        // Cleanup code
    }
}