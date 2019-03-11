import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {

    @Test public void testGetClassString(){
        MainClass mC = new MainClass();
        Assert.assertTrue("String not contains Hello or hello", (mC.getClassString().contains("Hello") || mC.getClassString().contains("hello")) );
    }
}
