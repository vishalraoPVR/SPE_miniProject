import org.junit.*;
import org.example.Calculator;
public class CalculatorTest {
    @Test
    public void TestAdd1() {
        Assert.assertEquals(0,Calculator.add(-23,23));
    }

    @Test
    public void TestAdd2() {
        Assert.assertEquals(25,Calculator.add(23,2));
    }

    @Test
    public void TestSub1() {
        Assert.assertEquals(2,Calculator.sub(23,21));
    }

    @Test
    public void TestSub2() {
        Assert.assertEquals(0,Calculator.sub(23,23));
    }
}
