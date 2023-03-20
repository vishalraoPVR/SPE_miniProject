//import org.junit.*;
import org.example.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    private Calculator objCalcUnderTest;
    private static final double DELTA = 1e-15;
    @Before
    public void setUp() {
        //Arrange
        objCalcUnderTest = new Calculator();
    }

    @Test
    public void PowerTruePositive() {
        int x = 2; int b = 3;
        double expectedResult = 8.0;
        //Act
        double result = objCalcUnderTest.x_power_b(x, b);

        assertEquals("Finding factorial for true positive", expectedResult, result, DELTA);
    }
    @Test
    public void SquareTruePositive(){
        assertEquals("Finding square root of a number", 2, objCalcUnderTest.square_root(4), DELTA);
        assertEquals("Finding square root of a number", 6, objCalcUnderTest.square_root(36), DELTA);
        assertEquals("Finding square root of a number", 8, objCalcUnderTest.square_root(64), DELTA);
    }

    public void SquareTrueNegative(){
        assertNotEquals("Checking square root false positive", 5, objCalcUnderTest.square_root(36), DELTA);
    }

    @Test
    public void FactorialTruePositive(){
        assertEquals("Finding factorial of a number", 120, objCalcUnderTest.factorial(5), DELTA);
        assertEquals("Finding factorial of a number", 720, objCalcUnderTest.factorial(6), DELTA);
    }

    @Test
    public void LogTruePositive(){
        assertEquals("Finding Natural Log of a number", Double.NEGATIVE_INFINITY, objCalcUnderTest.natural_log(0), DELTA);
        assertEquals("Finding Natural Log of a number", 0, objCalcUnderTest.natural_log(1), DELTA);
    }
}