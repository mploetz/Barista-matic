import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Drink {
    private String name;
    private HashMap<String, Object> drinkDetails = new HashMap<String, Object>(); // Retrieve by drink name and return a Object has drink recipe and price
    private Double price;
    private List<String> ingredients = new ArrayList<String>();
    private HashMap<String, ArrayList<Object>> drinkRecipes = new HashMap<String, ArrayList<Object>>();

    public Drink(String name) {
        this.name = name;
        CreateDrinkRecipes();
    }



    // @params: String name
    // @returns: An Object containing price and ingredients of the Drink
    public Object GetDrink(String name) {
        return this.drinkDetails.get(name);
    }

    private void CreateDrinkRecipes() {

    }

    private void MakeDrink() {

    }


    public String getName() {
        return name;
    }
}
