// Technique: PROMPT AUGMENTATION
// Example: A good unit test should address the following characteristics:
1. Fast Execution: Tests should run quickly to support rapid iterations and feedback during development. Jest runs tests in parallel and caches transformations to achieve faster test runs, but test design also affects speed.
2. Isolation: Unit tests should test functionality in isolation without relying on external systems or states. This means mocking dependencies like databases, APIs, or complex internal modules to ensure the unit under test is the focus.
3. Determinism: Tests should be deterministic, producing the same results every time they are run under the same conditions. Flakiness, where tests pass or fail unpredictably, should be avoided.
4. Readability: Code within tests should be clear and concise, making it easy for other developers (or future you) to understand the purpose of the test and the functionality being tested. Descriptive test names and well-structured test suites help achieve this.
5. Comprehensive: A good test suite covers all critical paths through the code, including success paths, failure paths, and edge cases. Coverage tools can help identify untested parts of your codebase, but coverage alone doesn't guarantee quality tests.
Based on these characteristics, create JUnit tests for the Calculator Class
// Template: A good <tool and/or testing type> test should address the following characteristics: <expected characteristics> Based on these characteristics create <testing type> tests for the <target>

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest {
    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2, 3), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }

    @Test
    public void testCalculateAdd() {
        assertEquals(5.0, calculator.calculate(2, 3, '+'), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        calculator.calculate(2, 3, 'x');
    }
}