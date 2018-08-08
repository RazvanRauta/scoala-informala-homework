import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    MaxNumber maxNumber = new MaxNumber();

    int[] alfa;

    @Test
    public void getFromThreeMaxim() {

        alfa = new int[]{2, 5, 8};

        int res = maxNumber.getMax(alfa);

        Assert.assertEquals(res, 8);

    }

    @Test
    public void getFromFourMaxim() {

        alfa = new int[]{2, 5, 8, 20};

        int res = maxNumber.getMax(alfa);

        Assert.assertEquals(res, 20);

    }

    @Test
    public void getFromFiveMaxim() {

        alfa = new int[]{2, 5, 8, -45, -4};

        int res = maxNumber.getMax(alfa);

        Assert.assertEquals(res, 8);

    }
}
