package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "2,3,5",
        "-5,5,0"
    })
    void addsNumbers(int a, int b, int expected) {
        assertEquals(expected, calc.add(a,b));
    }

    @Test
    void dividesNumbers() {
        assertEquals(2, calc.divide(10,5));
    }

    @Test
    void divisionByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1,0));
    }
}
