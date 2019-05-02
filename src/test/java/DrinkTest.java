import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    private final Drink drink = new Drink("Coffee");

    @Test
    void CreationOfADrink() {
        assertTrue(drink != null);
        assertEquals("Coffee", drink.getName());
    }
}