import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {
    @Test
    public void testGetClassNumber()
    {
        MainClass mC = new MainClass();
        Assert.assertTrue("ClassNumber NOT more 45", (mC.getClassNumber() >= 45) );
    }
}
