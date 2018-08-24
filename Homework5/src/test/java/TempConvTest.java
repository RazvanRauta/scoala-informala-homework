import org.junit.Assert;
import org.junit.Test;

public class TempConvTest {
    TempConv tempConv = new TempConv();

    @Test
    public void calcInCelsiusA() {
        int temp = 87;

        int res = tempConv.calcInCelsius(temp);

        Assert.assertEquals(res, 30);
    }

    @Test
    public void calcInCelsiusB() {

        int temp = -20;

        int res = tempConv.calcInCelsius(temp);

        Assert.assertEquals(res, -28);

    }

    @Test
    public void calcInCelsiusC() {

        int temp = 0;

        int res = tempConv.calcInCelsius(temp);

        Assert.assertEquals(res, -17);
    }
}
