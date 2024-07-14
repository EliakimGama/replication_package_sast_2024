// Technique: ZERO SHOT
// Example: Create JUnit tests for the Calculator
// Template: Create <tool or testing type> tests for <target>

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.calculate(2, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, calculator.calculate(2, 3, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.calculate(2, 3, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.calculate(6, 3, '/'));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(1, 0, '/');
        });
        assertEquals("Error! Division by zero.", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(1, 1, '%');
        });
        assertEquals("Invalid operator!", exception.getMessage());
    }
}