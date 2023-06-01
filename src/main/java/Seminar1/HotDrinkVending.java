package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVending extends Vending {

    private final List<HotDrink> listOfDrinks;

    public HotDrinkVending() {
        listOfDrinks = new ArrayList<>();
    }

    public void addProduct(HotDrink product) {
        listOfDrinks.add(product);
    }

    public Product findProduct(String name) {
        for (Product product : listOfDrinks) {
            if (product.getKind().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product findProduct(Long id) {
        for (Product product : listOfDrinks) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public HotDrink findProductByTemp(int temperature) {
        for (HotDrink product : listOfDrinks) {
            if (product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
