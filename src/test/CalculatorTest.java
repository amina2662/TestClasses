// CalculatorTest.java - JUnit test class for Calculator

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 0));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals(-2, calculator.divide(-6, 3));
    }
}
