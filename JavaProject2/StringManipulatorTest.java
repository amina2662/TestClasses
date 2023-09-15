// StringManipulatorTest.java - JUnit test class for StringManipulator

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    private StringManipulator stringManipulator;

    @BeforeEach
    void setUp() {
        stringManipulator = new StringManipulator();
    }

    @Test
    void testConcatenateStrings() {
        assertEquals("Hello,World", stringManipulator.concatenateStrings("Hello,", "World"));
        assertEquals("", stringManipulator.concatenateStrings("", ""));
    }

    @Test
    void testCountWords() {
        assertEquals(3, stringManipulator.countWords("This is a test"));
        assertEquals(0, stringManipulator.countWords(""));
        assertEquals(1, stringManipulator.countWords("SingleWord"));
    }

    @Test
    void testReverseString() {
        assertEquals("tacocat", stringManipulator.reverseString("tacocat"));
        assertEquals("", stringManipulator.reverseString(""));
        assertEquals("racecar", stringManipulator.reverseString("racecar"));
    }
}
