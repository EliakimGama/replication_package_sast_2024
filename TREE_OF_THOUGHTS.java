// Technique: TREE OF THOUGHTS
// Example: Imagine three different experts are answering the question for generating JUnit tests for the Calculator Class. All experts will write down 1 step of their thinking, then share it with the group. Then all experts will go on to the next step, etc. At the end, they compare the answers aiming to identify the different test cases. Then they merge the answers to provide a unique answer resulting in the best coverage and effective test suite
// Template: Imagine <number of profiles> different experts are generating <tool and/or testing type> unit tests for the <target>. All experts will write down 1 step of their thinking, then share it with the group. Then all experts will go on to the next step, etc. At the end, they compare the answers aiming to identify the different test cases. Then they merge the answers to provide a unique answer resulting in the best coverage and effective test suite.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void testAddition() {
        assertEquals(9, SimpleCalculator.calculate(4, 5, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, SimpleCalculator.calculate(5, 3, '-'));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            SimpleCalculator.calculate(10, 0, '/');
        });
        assertEquals("Error! Division by zero.", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SimpleCalculator.calculate(4, 5, '%');
        });
        assertEquals("Invalid operator!", exception.getMessage());
    }

    // Additional tests can be implemented following the same pattern
}
