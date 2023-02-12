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
    public void testFibbonacciWithOneAsInput() {// write different test cases and test for edge cases, normal cases
                                                // something like below.
        Assert.assertEquals(fibo.FiboRecursion(1), 1);
    }

    @Test
    public void testFibbonacciWith25AsInput() {
        Assert.assertEquals(fibo.FiboRecursion(25), 75025);
    }

}
