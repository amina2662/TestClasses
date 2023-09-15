// MathUtilsTest.java - JUnit test class for MathUtils

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(0, MathUtils.add(0, 0));
        assertEquals(-5, MathUtils.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, MathUtils.subtract(5, 3));
        assertEquals(0, MathUtils.subtract(0, 0));
        assertEquals(-1, MathUtils.subtract(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, MathUtils.multiply(2, 3));
        assertEquals(0, MathUtils.multiply(0, 0));
        assertEquals(-6, MathUtils.multiply(2, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2, MathUtils.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(5, 0));
        assertEquals(-2, MathUtils.divide(-6, 3));
    }
}
