import org.junit.Assert;
import org.junit.Test;

public class MainClass {
    @Test
        public void giveAway()
        {
            int number = this.getLocalNumber();
        }
        public int getLocalNumber() {
            return 14;
        }
}

class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass Ln = new MainClass();
        int Lc = Ln.getLocalNumber();
        Assert.assertTrue(Lc == 14);
    }
}
