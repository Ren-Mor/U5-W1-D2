
import com.epicode.U5D1.entities.Pizza;
import com.epicode.U5D1.entities.Topping;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCaloriePrezzoTest {

    @Test
    void testCaloriePrezzoPizzaNonXL() {
        // Creo alcuni toppings
        Topping tomato = new Topping("Tomato", 0, 0);
        Topping cheese = new Topping("Cheese", 92, 0.69);
        Topping ham = new Topping("Ham", 35, 0.99);

        // Creo pizza non XL con toppings
        Pizza pizza = new Pizza("Custom Pizza", List.of(tomato, cheese, ham), false);

        // Calorie previste:
        // base pizza 1012 + 0 + 92 + 35 = 1139
        int expectedCalories = 1139;
        assertEquals(expectedCalories, pizza.getCalories(), "Calorie pizza normale non corrette");

        // Prezzo previsto:
        // base 4.3 + 0 + 0.69 + 0.99 = 5.98
        double expectedPrice = 5.98;
        assertEquals(expectedPrice, pizza.getPrice(), 0.001, "Prezzo pizza normale non corretto");
    }
}
