package com.example.softwaretesting_22805969;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorLogicTest {
    CalculatorLogic calc = new CalculatorLogic();

    @Test
    void add() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void subtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void multiply() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void divide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(30, 0));
    }
}