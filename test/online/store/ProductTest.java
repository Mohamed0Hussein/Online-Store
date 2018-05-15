/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hussein
 */
public class ProductTest {
    Product product1;
    public ProductTest() {
    }
    
   
    
    @Before
    public void setUp() {
         product1 = new Product("Ball",100, "sports", 10);
        
    }
    
  
    /**
     * Test of addAmount method, of class Product.
     */
    @Test
    public void testAddAmount() {
        System.out.println("addAmount Test");
        int amount = 12;
        product1.addAmount(amount);
        assertEquals("Amount didn't increase correctly", 22, product1.count);
        System.out.println("addAmount Test");
        
        int amount2 = -12;
        product1.addAmount(amount2);
        assertEquals("Amount shouldn't change decrease", 22, product1.count);
    }

    /**
     * Test of isAvailable method, of class Product.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("Test isAvailable");
       
        boolean expResult = true;
        boolean result = product1.isAvailable();
        assertEquals("Is available fails",expResult, result);
       
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("test getPrice");
        double expResult = 100;
        double result = product1.getPrice();
        assertEquals("Get peice fails",expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("Test setPrice");
        double price =75;
        product1.setPrice(price);
        assertEquals("Set price fails",75, product1.price,0);
        
        double price2 =-75;
        product1.setPrice(price2);
        assertEquals("Set price shouldn't be negative",75, product1.price,0);
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
}
