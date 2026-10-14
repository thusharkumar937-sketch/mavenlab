import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    App obj = new App();
    @Test
    public void testEvenOdd1() {
        assertEquals("Even", obj.checkEvenOdd(8));
    }
    @Test
    public void testEvenOdd2() {
        assertEquals("Odd", obj.checkEvenOdd(7));
    }
    @Test
    public void testEvenOdd3() {
        assertEquals("Even", obj.checkEvenOdd(0));
    }
    @Test
    public void testEvenOdd4() {
        assertEquals("Odd", obj.checkEvenOdd(-3));
    }
}