package task1.test;


import org.junit.Test;
import org.junit.Assert.*;
import task1.main.Price;
import task1.main.Pricelist;
import task1.main.Product;

import static org.junit.Assert.*;

public class PricelistTests {
    @Test
    public void addProductTest() {
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Product prod3 = new Product("Shrimps", 1991);
        Price price1 = new Price(59, 99);
        Price price2 = new Price(89, 34);
        Price price3 = new Price(276, 13);
        assertTrue(pricelist.addProduct(prod1, price1));
        assertFalse(pricelist.addProduct(prod1, price1));
    }

    @Test
    public void removeProductTest() {
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Product prod3 = new Product("Shrimps", 1991);
        Price price1 = new Price(59, 99);
        Price price2 = new Price(89, 34);
        Price price3 = new Price(276, 13);
        pricelist.addProduct(prod2, price2);
        assertTrue(pricelist.removeProduct(prod2));
        assertFalse(pricelist.removeProduct(prod1));
    }

    @Test
    public void changeNameTest() {
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Product prod3 = new Product("Kiwi",1212);
        Price price1 = new Price(89, 34);
        Price price2 = new Price(276, 13);
        pricelist.addProduct(prod1, price1);
        pricelist.addProduct(prod2, price2);
        assertTrue(pricelist.changeName(prod1,"Water"));
        assertTrue(pricelist.changeName(prod2,"Guitar"));
        assertFalse(pricelist.changeName(prod3,"Apple"));
    }

    @Test
    public void changePriceTest() {
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Price price1 = new Price(89, 34);
        Price price2 = new Price(276, 13);
        pricelist.addProduct(prod1, price1);
        pricelist.addProduct(prod2, price2);
        pricelist.removeProduct(prod1);
        assertTrue(pricelist.changePrice(prod2,price1));
        assertFalse(pricelist.changePrice(prod1,price2));
    }

    @Test
    public void codeAmountTest() {
        Pricelist pricelist = new Pricelist();
        Product prod1 = new Product("Milk", 1703);
        Product prod2 = new Product("Mango", 1861);
        Product prod3 = new Product("Shrimps", 1991);
        Price price1 = new Price(59, 99);
        Price price2 = new Price(89, 34);
        Price price3 = new Price(276, 13);
        pricelist.addProduct(prod1, price1);
        pricelist.addProduct(prod2, price2);
        pricelist.addProduct(prod3, price3);
        assertEquals(419.93, pricelist.codeAmount(1703, 7), 0);
        assertEquals(80353.83, pricelist.codeAmount(1991, 291), 0);
    }


}
