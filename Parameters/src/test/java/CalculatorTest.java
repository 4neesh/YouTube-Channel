import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void squaredIntegerHappyPath(){

        Calculator calculator = new Calculator();
        assertEquals(9, calculator.squareInteger(3));
        assertEquals(100, calculator.squareInteger(10));

    }

    @Test(expected = RuntimeException.class)
    public void squaredIntegerUpperBoundary(){

        Calculator calculator = new Calculator();
        calculator.squareInteger(50000);
    }

    @Test(expected = RuntimeException.class)
    public void squaredIntegerLowerBoundary(){

        Calculator calculator = new Calculator();
        calculator.squareInteger(-50000);
    }

    @Test
    public void squaredIntegerNull(){

        Calculator calculator = new Calculator();
        assertEquals(0, calculator.squareInteger(null));

    }

    @Test
    public void squaredIntegerNegative(){

        Calculator calculator = new Calculator();
        assertEquals(25, calculator.squareInteger(-5));

    }

    @Test(expected = RuntimeException.class)
    public void squaredIntegerNaN(){

        Calculator calculator = new Calculator();
        calculator.squareInteger((int)Math.sqrt(-5));

    }

}
