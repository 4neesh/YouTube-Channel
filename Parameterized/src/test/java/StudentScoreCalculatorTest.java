import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentScoreCalculatorTest {

    private StudentScoreCalculator sc;
    @Before
    public void setup(){
        sc = new StudentScoreCalculator();
    }
    @Test
    public void studentScoreCalculatorRegular(){
        sc.calculateSATScore(50, 50);
        assertEquals(2500, sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorMathsNegative(){
        sc.calculateSATScore(-1, 50);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorLiteracyNegative(){
        sc.calculateSATScore(50, -1);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorBothNegative(){
        sc.calculateSATScore(-1, -1);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorMathsHigh(){
        sc.calculateSATScore(102, 50);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorLiteracyHigh(){
        sc.calculateSATScore(50, 150);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorBothHigh(){
        sc.calculateSATScore(150, 150);
        assertEquals(-1, sc.getSatScore());

    }
}
