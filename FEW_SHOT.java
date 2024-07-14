// Technique: FEW SHOT
// Example: Create unit tests for the Calculator Java class based on the following test:
// Template: Create <test type> tests for the <target> based on the following test: <example of test>

public void testMinus() { 
    Calculadora calculadora = new Calculadora(); 
    int resultado = calculadora.subtrair(5, 3); 
    assertEquals(2, resultado, "5 - 3 deve ser 2"); 
}


import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    // Test addition
    @Test
    public void testAddition() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("Expected addition result not found", 8.0, calculator.calculate(5, 3, '+'), 0.001);
    }

    // Test subtraction
    @Test
    public void testSubtraction() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("Expected subtraction result not found", 2.0, calculator.calculate(5, 3, '-'), 0.001);
    }

    // Test multiplication
    @Test
    public void testMultiplication() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("Expected multiplication result not found", 15.0, calculator.calculate(5, 3, '*'), 0.001);
    }

    // Test division
    @Test
    public void testDivision() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals("Expected division result not found", 1.666, calculator.calculate(5, 3, '/'), 0.001);
    }

    // Test division by zero
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.calculate(5, 0, '/');
    }

    // Test invalid operator
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.calculate(5, 3, '%');
    }
}