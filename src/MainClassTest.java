import org.junit.Test;
import org.junit.Assert;

public class MainClassTest {
    MainClass mC = new MainClass();

    @Test
    public void testGetLocalclNumber()
    {
        MainClass mC = new MainClass();
        Assert.assertTrue("LocalNumber not 14", (mC.getLocalNumber() == 14) );
    }

}

