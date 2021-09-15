import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass Ln = new MainClass();
        int Lc = Ln.getLocalNumber();
        Assert.assertTrue( "Your value not equal 14", Lc == 14);
    }
}
