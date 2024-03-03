import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationTests {

    @Disabled
    @Test
    public void testAdd() {
        // Logique de test pour l'addition
        assertEquals(4, add(2, 3));
    }

    @Test
    public void testMultiply() {
        // Logique de test pour la multiplication
        assertEquals(6, multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, divide(6, 3));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
