import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class FiboTests {

    Fibo fibo = new Fibo();

    @Before
    public void setUp() throws Exception {
        testFibbonacciWithOneAsInput();
    }

    @Test
    public void testFibbonacciWithOneAsInput() {

        Assert.assertEquals(fibo.FiboRecursion(1), 1);
    }

    @Test
    public void testFibbonacciWith25AsInput() {
        Assert.assertEquals(fibo.FiboRecursion(25), 75025);
    }

    @Test
    public void testFibbonacciWith2AsInputAndCauseFailure() {
        Assert.assertEquals(fibo.FiboRecursion(2), 75025);
    }

}
