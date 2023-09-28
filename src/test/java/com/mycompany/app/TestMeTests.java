//package u;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.mycompany.app.TestMe;

public class TestMeTests {

    TestMe testMe;

    @Before
    public void setUp() throws Exception {
        testMe = new TestMe();
    }

    @Test
    public void squareTest() {
        double baseValue = 3.0;
        double expected = baseValue * baseValue;
        testMe.setValue(baseValue);
        double actual = testMe.square();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void addTest() {
        double baseValue = 3.0;
        double x = 2.0;
        double expected = baseValue + x;
        testMe.setValue(baseValue);
        double actual = testMe.add(x);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void subtractTest() {
        double baseValue = 3.0;
        double x = 2.0;
        double expected = baseValue - x;
        testMe.setValue(baseValue);
        double actual = testMe.subtract(x);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void multiplyTest() {
        double baseValue = 3.0;
        double x = 2.0;
        double expected = baseValue * x;
        testMe.setValue(baseValue);
        double actual = testMe.multiply(x);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void divideTest() {
        double baseValue = 6.0;
        double x = 2.0;
        double expected = baseValue / x;
        testMe.setValue(baseValue);
        double actual = testMe.divide(x);
        assertEquals(expected, actual, 0.0001);
    }
}
