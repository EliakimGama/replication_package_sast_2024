// Technique: ROLE PROMPTING
// Example: You are a developer experienced in creating unit tests with JUnit. Create these tests for the Calculator
// Template: You are a <Role> in creating <tool or testing type> tests. Create these tests for <target>

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.calculate(2, 3, '+'), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calculator.calculate(2, 3, '-'), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.calculate(2, 3, '*'), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.calculate(6, 3, '/'), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.calculate(1, 0, '/');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        calculator.calculate(1, 1, '%');
    }
}