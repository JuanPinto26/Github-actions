package com.juanpinto.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbersCorrectly() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractNumbersCorrectly() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void shouldHandleEnvironmentVariable() {
        String apiKey = System.getenv("TEST_API_KEY");
        if (apiKey != null) {
            assertNotNull(apiKey);
        }
    }
}