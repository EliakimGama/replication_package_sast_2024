// Technique: ZERO SHOT CHAIN OF THOUGHT
// Example: Create JUnit unit tests for the Calculator. Let's think step by step.
// Template: Create <tool and/or testing type> tests for the Calculator. Let's think step by step.

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.calculate(2, 3, '+'), "Addition should return the sum of two numbers.");
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, calculator.calculate(2, 3, '-'), "Subtraction should return the difference between two numbers.");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.calculate(2, 3, '*'), "Multiplication should return the product of two numbers.");
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.calculate(6, 3, '/'), "Division should return the quotient of two numbers.");
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(1, 0, '/');
        });
        assertTrue(exception.getMessage().contains("Error! Division by zero."));
    }

    @Test
    public void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(1, 1, '%');
        });
        assertTrue(exception.getMessage().contains("Invalid operator!"));
    }
}