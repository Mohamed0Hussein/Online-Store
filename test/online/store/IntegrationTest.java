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

/**
 *
 * @author eslam
 */
public class IntegrationTest {
    Customer customer;
    Shop shop;
    int amount;
    Product p;
    public IntegrationTest() {
        
    }
    
    @Before
    public void setUp() {
        customer = new Customer("Mohamed Hussein", 10, 100);
        shop = new Shop("Store");
        amount = 5;
        p =new Product("Ball", 50, "sports", 5);
        shop.products.add(p);
        
    }
    
    @After
    public void tearDown() {
    }
@Test
    public void testBuy1() {
        System.out.println("buy non-Existing product");
        String productName = "no product";
        Product p = shop.getProduct(productName);
        
        
       int oldSize = customer.products.size();
        customer.buy(productName, amount, shop);
        assertEquals(oldSize,customer.products.size() );

        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testBuy2() {
        System.out.println("buy with not enough money");
        
        
        
       
        boolean bought=customer.buy(p.name, 20, shop);
        System.out.println(customer.money);
        System.out.println(bought);
        assertTrue(customer.money>=0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testBuy3() {
        System.out.println("buy product with not enough amount");
        
        
        
        
       int oldSize = customer.products.size();
        customer.buy(p.name, 10, shop);
        assertTrue(p.count>=0);

        // TODO review the generated test code and remove the default call to fail.
      
    }

}
