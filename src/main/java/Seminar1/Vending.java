package Seminar1;

import java.util.ArrayList;
import java.util.List;

public abstract class Vending {

    private final List<Product> listOfProducts;

    public Vending() {
        listOfProducts = new ArrayList<Product>();
    }

    /**
     * @param product на входе добавляет в список продукт
     */
    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    public Product findProduct(String name) {
        for (Product product : listOfProducts) {
            if (product.getKind().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product findProduct(Long id) {
        for (Product product : listOfProducts) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

}
