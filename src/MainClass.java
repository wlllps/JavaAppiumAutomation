import org.junit.Assert;
import org.junit.Test;

public class MainClass{

    private int class_number = 20;

    public int getClassNumber(){
        return class_number;
    }

}

class MainClassTest {
    public MainClassTest() {
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue( "Your value less then 45", mainClass.getClassNumber() > 45); //тут автоматом выставится
    }
}
