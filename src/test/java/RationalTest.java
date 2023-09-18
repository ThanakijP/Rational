import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testConstructor() {
        try {
            new Rational();
            new Rational(1, 2);
            new Rational(-10, -5);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 5;
        x.multiply(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(15, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 7;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 3;
        x.divide(y);
        Assert.assertEquals(9, x.numerator);
        Assert.assertEquals(14, x.denominator);
    }

    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        Assert.assertEquals(x, y);
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        Rational z = new Rational();
        z.numerator = 2;
        z.denominator = 4;

        Assert.assertTrue(x.compareTo(y) < 0); // x is less than y
        Assert.assertTrue(y.compareTo(x) > 0); // y is greater than x
        Assert.assertTrue(x.compareTo(z) == 0); // x is equal to z
    }

}
