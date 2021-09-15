import org.junit.Assert;
import org.junit.Test;

public class MainClass{

    private String class_string = "Hello, world";

    public String getClassString(){
        return class_string;
    }
}

class MainClassTest {
    public MainClassTest() {
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
    }
}