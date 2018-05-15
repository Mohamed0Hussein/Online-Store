/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author eslam
 */
public class ShopTest {

    Shop shop;
    Product p1 = new Product("Ball", 100, "Any", 50);
    Product p2 = new Product("Phone", 1000, "Tech", 10);
    Customer c = new Customer("Mohamed", 1, 1000);

    public ShopTest() {
    }

    @Before
    public void setUp() {
        shop = new Shop("shop");
        shop.products.add(p1);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of discount method, of class Shop.
     */
    @Test
    public void testDiscount() {
        System.out.println("discount");
        double percentage = 10;
        Product p = p1;
        Shop instance = shop;
        //double price_before = p.price;
        instance.discount(percentage, p);

        assertEquals(90, p.price, 0.0);
        double percentage2 = -10;
        instance.discount(percentage2, p);

        assertEquals("Discount percentage should be more than zero ", 90, p.price, 0.0);

        System.out.println("IncreasePrice");
        double amount = 100;

        instance.IncreasePrice(amount, p);
        assertEquals(190, p.price, 0);
        
        double amount2 = -100;

        instance.IncreasePrice(amount2, p);
        assertEquals("Increasing price should be with positive",190, p.price, 0);

    }

    /**
     * Test of IncreasePrice method, of class Shop.
     */
    /**
     * Test of addProduct method, of class Shop.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "";
        double price = 0.0;
        String category = "";
        int count = 0;
        Shop instance = shop;
        instance.addProduct(p2.name, p2.price, p2.category, p2.count);
        assertEquals(p2.name, shop.products.get(shop.products.size() - 1).name);

        System.out.println("Adding same product again");

        int sizeBefore = shop.products.size();
        instance.addProduct(p2.name, p2.price, p2.category, p2.count);
        assertEquals(sizeBefore, shop.products.size());
    }

    /**
     * Test of removeProduct method, of class Shop.
     */
    /**
     * Test of getProduct method, of class Shop.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");

        Product result = shop.getProduct(p1.name);
        assertEquals(p1, result);

    }

    @Test
    public void testGetProduct2() {
        System.out.println("getProduct for non existing");

        Product result = shop.getProduct("No product");
        assertEquals(null, result);

    }

    /**
     * Test of RegisterCustomer method, of class Shop.
     */
    @Test
    public void testRegisterCustomer() {
        System.out.println("RegisterCustomer");

        shop.RegisterCustomer(c);
        assertEquals(c.id, shop.customers.get(shop.customers.size() - 1).id);
        System.out.println("RegisterCustomer of the same id");
        int oldSize = shop.customers.size();
        shop.RegisterCustomer(c);

        assertEquals(oldSize, shop.customers.size());

    }

}
