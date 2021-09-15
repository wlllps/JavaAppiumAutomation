import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    public MainClassTest() {
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Your value less then 45", mainClass.getClassNumber() > 45); //тут автоматом выставится
    }
}
