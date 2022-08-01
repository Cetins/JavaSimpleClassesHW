import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers() {
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    public void canSubtractNumbers() {
        assertEquals(5, calculator.subtract(7, 2));
    }

    @Test
    public void canMultiplyNumbers() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void canDivideNumbers() {
        assertEquals(4.0, calculator.divide(12.0, 3.0), 0.01);
    }
}
