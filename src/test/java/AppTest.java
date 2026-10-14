import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App obj = new App();

        assertEquals(30, obj.add(10, 20));
        assertEquals(15, obj.add(10, 5));
        assertEquals(0, obj.add(-5, 5));
        assertEquals(-5, obj.add(-2, -3));
    }
}