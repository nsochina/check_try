import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testGetClassNumber()
    {
        MainClass mainClass = new MainClass();
        assertTrue("class_number NOT more 45", (mainClass.getClassNumber() >= 45) );
    }

}

