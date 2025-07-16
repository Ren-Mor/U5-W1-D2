
import com.epicode.U5D1.entities.Topping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToppingTest {

    @Test
    void testToppingConstructor() {
        Topping topping = new Topping("Cheese", 92, 0.69);

        assertEquals("Cheese", topping.getName(), "Il nome del topping deve essere Cheese");
        assertEquals(92, topping.getCalories(), "Le calorie devono essere 92");
        assertEquals(0.69, topping.getPrice(), 0.001, "Il prezzo deve essere 0.69");
    }
}