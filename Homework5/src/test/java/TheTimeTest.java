import org.junit.Assert;
import org.junit.Test;

public class TheTimeTest {
    TheTime theTime = new TheTime();

    @Test
    public void validateTimeA() {

        int hour = 20;
        int min = 30;

        boolean res = theTime.validateTime(hour, min);

        Assert.assertEquals(res, true);
    }

    @Test
    public void validateTimeB() {
        int hour = 25;
        int min = 20;

        boolean res = theTime.validateTime(hour, min);

        Assert.assertEquals(res, false);
    }

    @Test
    public void validateTimeC() {
        int hour = 10;
        int min = 70;

        boolean res = theTime.validateTime(hour, min);

        Assert.assertEquals(res, false);
    }

    @Test
    public void validateTimeD() {
        int hour = 0;
        int min = 0;

        boolean res = theTime.validateTime(hour, min);

        Assert.assertEquals(res,true);

    }

}
