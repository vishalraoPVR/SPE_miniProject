import org.junit.*;
import org.example.Calculator;

public class CalculatorTest {

    @Test
    public void TestFact1() {
        Assert.assertEquals(2,Calculator.factorial(2));
    }

    @Test
    public void TestFact2() {
        Assert.assertEquals(120,Calculator.factorial(5));
    }

    @Test
    public void TestRoot1() {
        Assert.assertEquals(2.0,Calculator.square_root(4),0.0f);
    }

    @Test
    public void TestRoot2() {
        Assert.assertEquals(9.0,Calculator.square_root(81),0.0f);
    }
}