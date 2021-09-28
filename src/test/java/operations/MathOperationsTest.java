package operations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

import static operations.MathOperations.*;

public class MathOperationsTest {


    @DataProvider(name = "testSupplement")
    public Object[][] Supplement() {
        return new Object[][]{
                {1, 2, 3},
                {2, -3, -1},
                {-6, 7, 1},
                {-5, -5, -10}
        };
    }

    @DataProvider(name = "testSubtraction")
    public Object[][] Subtraction() {
        return new Object[][]{
                {3, 2, 1},
                {5, -1, 6},
                {-4, 5, -9},
                {-4, -4, 0}
        };
    }

    @DataProvider(name = "testMultiplication")
    public Object[][] Multiplication() {
        return new Object[][]{
                {2, 3, 6},
                {0, 3, 0},
                {-4, -3, 12},
                {-4, 3, -12}
        };
    }

    @DataProvider(name = "testDivision")
    public Object[][] Division() {
        return new Object[][]{
                {-6, -3, 2},
                {-6, 3, -2},
                {0, 1, 0}
        };
    }

    @Test(dataProvider = "testSupplement")
    public void testSupplement(int a, int b, int result) {
        Assert.assertEquals(result, supplement(a, b));
    }

    @Test(dataProvider = "testSubtraction")
    public void testSubtraction(int a, int b, int result) {
        Assert.assertEquals(result, subtraction(a, b));
    }

    @Test(dataProvider = "testMultiplication")
    public void testMultiplication(int a, int b, int result) {
        Assert.assertEquals(result, multiplication(a, b));
    }

    @Test(dataProvider = "testDivision")
    public void testDivision(int a, int b, int result) {
        Assert.assertEquals(result, division(a, b));
    }
}