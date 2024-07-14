// Technique: CONTEXT MANAGER
// Example: Considering that this application is built in Java and that this class is responsible for calculating basic math operations such as subtraction, addition, multiplication, and division, generate unit tests in JUnit for it
// Template: Considering that this application is built in <language> and that this class is responsible for <class’ goal>, generate <testing type> tests in <tool> for it

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
        calculator.calculate(1.0, 1.0, '%');
    }
}