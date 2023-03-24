package task1.main;

import java.util.HashMap;
import java.util.Map;

public final class Pricelist {
    private final Map<Product, Price> pricelist = new HashMap<>();

    //Add product and price
    public boolean addProduct(Product product, Price price) {
        boolean isNotOkay = false;
        if (!pricelist.containsKey(product)) {
            pricelist.put(product, price);
            return true;
        } else return false;
    }

    //Remove product
    public boolean removeProduct(Product product) {
        if (pricelist.containsKey(product)) {
            pricelist.remove(product);
            return true;
        } else return false;
    }

    //Change price of the product
    public boolean changePrice(Product product, Price price) {
        if (pricelist.containsKey(product)) {
            pricelist.replace(product, price);
            return true;
        } else return false;
    }

    //Change name of the product
    public boolean changeName(Product product, String name) {
        boolean isNotOkay = false;
        if (pricelist.containsKey(product)) {
            product.changeName(name);
            return true;
        } else return false;
    }

    //Define price of purchase by code and quantity
    public double codeAmount(int code, int amount) {
        if (code < 0 || amount < 0) throw new IllegalArgumentException("Code and amount must be > 0");
        double total = 0;
        for (Product product : pricelist.keySet()) {
            if (product.getCode() == code) {
                total = ((double) pricelist.get(product).getRoubles() +
                        (double) pricelist.get(product).getPennies() / 100) * amount;
            }
        }
        return total;
    }
}
