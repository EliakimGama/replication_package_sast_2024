// Technique: FEW SHOT CHAIN OF THOUGHT
// Example: For generating JUnit Test cases follow these steps:
Step 1: Analyze the functions of the Calculator class and create a unit test for each function considering success and failure cases.
Step 2: Review the test code. Verify that the test cases make logical sense, cover an adequate range of input scenarios, and effectively test the expected behavior of the class.
Step 3: Verify if the needed imports were included in the code.
Following these steps for the Calculator, generate Java unit tests.
// Template: For generating <tool or test type> test cases follow these steps: <reasoning steps> Following these steps for the <target> generate the <test type> tests

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.calculate(2.0, 3.0, '+'), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calculator.calculate(2.0, 3.0, '-'), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.calculate(2.0, 3.0, '*'), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.calculate(6.0, 3.0, '/'), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.calculate(1.0, 0, '/');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        calculator.calculate(1.0, 1.0, 'x');
    }
}