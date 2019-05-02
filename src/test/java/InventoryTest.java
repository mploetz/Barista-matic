import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    private Inventory inventory;

    {
        try {
            inventory = new Inventory(System.getProperty("user.dir") + "\\src\\main\\Data\\Inventory.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final String[] ingredientsList = {"Coffee", "Decaf Coffee", "Sugar", "Cream", "Steamed Milk", "Foamed Milk", "Espresso", "Cocoa", "Whipped Cream"};

    @Test
    void InitOfInventoryTest() {
        assertTrue(inventory != null);
        for (Map.Entry<String, Integer> entry : inventory.GetInventory().entrySet()) {
            String ingredient = entry.getKey();
            int amount = entry.getValue();
            assertTrue(amount == 10);
            assertTrue(Arrays.asList(ingredientsList).contains(ingredient));
        }
    }

}