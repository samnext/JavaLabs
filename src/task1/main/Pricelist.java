package task1.main;

import java.util.HashMap;
import java.util.Map;

public final class Pricelist {
    private final Map<Product, Price> pricelist = new HashMap<>();

    //Add product and price
    public void addProduct(Product product, Price price) {
        if (!pricelist.containsKey(product)) {
            pricelist.put(product, price);
        } else throw new IllegalStateException("Product already exists in pricelist");
    }

    //Remove product
    public void removeProduct(Product product) {
        if (pricelist.containsKey(product)) {
            pricelist.remove(product);
        } else throw new IllegalArgumentException("There's no such product in pricelist to remove it");
    }

    //Change price of the product
    public void changePrice(Product product, Price price) {
        if (pricelist.containsKey(product)) {
            pricelist.replace(product, price);
        } else throw new IllegalArgumentException("There's no such product in pricelist to change price of it");
    }

    //Change name of the product
    public void changeName(Product product, String name) {
        if (pricelist.containsKey(product)) {
            product.changeName(name);
        } else throw new IllegalArgumentException("There's no such product in pricelist to change the name");
    }

    //Define price of purchase by code and quantity
    public double codeAmount(int code, int amount) {
        if (code < 0 || amount < 0) throw new IllegalArgumentException("Code and amount must be > 0");
        double total = 0;
        for (Product product : pricelist.keySet()) {
            if (product.getCode() == code) {
                int pennies = 0;
                pennies = (amount * pricelist.get(product).getPennies()) / 100;
                total = amount * pricelist.get(product).getRoubles() + pennies +
                        (amount * pricelist.get(product).getPennies()) % 100 * 0.01;
            }
        }
        return total;
    }
}
