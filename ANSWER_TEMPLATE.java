// Technique: ANSWER TEMPLATE
// Example: Create JUnit  tests for the Calculator putting the imports at the beginning, after the global functions and variables, followed by the created test cases
// Template: Create <tool and/or testing type> tests for the <target> putting the imports at the beginning, after the global functions and variables, followed by the created test cases

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, SimpleCalculator.calculate(2, 3, '+'), "Addition should return the sum of two numbers");
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, SimpleCalculator.calculate(2, 3, '-'), "Subtraction should return the difference of two numbers");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, SimpleCalculator.calculate(2, 3, '*'), "Multiplication should return the product of two numbers");
    }

    @Test
    public void testDivision() {
        assertEquals(2, SimpleCalculator.calculate(4, 2, '/'), "Division should return the quotient of two numbers");
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> SimpleCalculator.calculate(4, 0, '/'), "Division by zero should throw IllegalArgumentException");
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> SimpleCalculator.calculate(4, 2, 'x'), "Invalid operator should throw IllegalArgumentException");
    }
}