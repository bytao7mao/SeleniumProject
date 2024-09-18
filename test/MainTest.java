
import com.example.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public static void main(String[] args) {
        Assert.assertTrue(true);
        MainTest mainTest = new MainTest();
        mainTest.test();
    }
    @Test
    public void test() {
        Integer immutableInt = 42;
        Integer modifiedInt = immutableInt + 8;

        assertNotSame(immutableInt, modifiedInt);

        assertEquals(42, (int) immutableInt);
        assertEquals(50, (int) modifiedInt);
    }
}