import task1.main.Price;
import task1.main.Pricelist;
import task1.main.Product;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("feel like cinderella naega byeonhae");
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Product prod3 = new Product("Shrimps", 1991);
        Price price1 = new Price(59, 99);
        Price price2 = new Price(89, 34);
        Price price3 = new Price(276, 13);
        System.out.println(pricelist.codeAmount(1703,7));
    }
}