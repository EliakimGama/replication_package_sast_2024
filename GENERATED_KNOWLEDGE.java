// Technique: GENERATED KNOWLEDGE
// Example: Iteration one: Which are the good practices for JEST unit tests. Iteration two: Considering this knowledge above, generate unit tests for the component
// Template: <Previous knowledge> Considering this knowledge above, generate <tool or testing type> tests for the target

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testAddition() {
        SimpleCalculator.main(new String[] {"5", "3", "+"});
        assertEquals("The result is: 8.0\n", outContent.toString());
    }

    @Test
    public void testSubtraction() {
        SimpleCalculator.main(new String[] {"5", "3", "-"});
        assertEquals("The result is: 2.0\n", outContent.toString());
    }

    @Test
    public void testMultiplication() {
        SimpleCalculator.main(new String[] {"5", "3", "*"});
        assertEquals("The result is: 15.0\n", outContent.toString());
    }

    @Test
    public void testDivision() {
        SimpleCalculator.main(new String[] {"6", "3", "/"});
        assertEquals("The result is: 2.0\n", outContent.toString());
    }

    @Test
    public void testDivisionByZero() {
        SimpleCalculator.main(new String[] {"5", "0", "/"});
        assertEquals("Error! Division by zero.\n", outContent.toString());
    }

    @Test
    public void testInvalidOperator() {
        SimpleCalculator.main(new String[] {"5", "3", "?"});
        assertEquals("Invalid operator!\n", outContent.toString());
    }
}