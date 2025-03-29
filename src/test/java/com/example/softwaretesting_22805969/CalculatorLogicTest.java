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

    @Test
    void testAddition10() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testDivisionBy2() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void testNegativeSubtraction() {
        assertEquals(-5, calc.subtract(5, 10));
    }

    @Test
    void testZeroMultiplication() {
        assertEquals(0, calc.multiply(0, 99));
    }

    @Test
    void testLargeAddition() {
        assertEquals(1000000, calc.add(999999, 1));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
    @Test
    void testConditionalAddition() {
        int a = 10;
        int b = 25;
        int result = calc.add(a, b);

        if (result == 35) {
            System.out.println("Passed: 10 + 25 = 35");
            assertEquals(35, result);
        } else {
            System.out.println("Failed: 10 + 25 != 35");
            fail("Addition logic failed");
        }
    }

}
