import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
        public void giveAway()
        {
            int number = this.getLocalNumber();
        }
        public int getLocalNumber()
        {
            return 14;
        }
}

class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainTest LN = new MainTest();
        int LC = LN.getLocalNumber();
        Assert.assertTrue(LC == 14);
    }
}
