import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testEvenOdd() {
        App obj = new App();

        assertEquals("Even", obj.checkEvenOdd(8));
        assertEquals("Odd", obj.checkEvenOdd(7));
        assertEquals("Even", obj.checkEvenOdd(0));
        assertEquals("Odd", obj.checkEvenOdd(-3));
    }
}