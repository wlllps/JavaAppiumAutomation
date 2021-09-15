import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    public MainClassTest() {

    }

    @Test
    public void testGetClassNumber() {

        MainClass mainClass = new MainClass();
        String message = mainClass.getClassString();
        Assert.assertTrue("Where is hello?))", message.contains("Hello") | message.contains("hello"));
    }
}
