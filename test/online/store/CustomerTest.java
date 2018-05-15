/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Hussein
 */
@RunWith(value = Parameterized.class)
public class CustomerTest {

    Customer customer;
    Shop shop;
    int amount;

    public CustomerTest(Customer c, Shop s ,int amount) {
        this.customer=c;
        this.shop=s;
        this.amount=amount;
        
        
    }

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{new Customer("Mohamed Hussein", 10, 300),new Shop("Store"),5},{new Customer("Eslam Tayseer", 10, 0),new Shop("Store"),10}});
    }

    @Before
    public void setUp() throws Exception {
    }

    /*@Before
    public void setUp() {
        customer = new Customer("Mohamed Hussein", 10, 300);
        shop = new Shop("Store");
        amount = 5;

    }*/

    @After
    public void tearDown() {
    }

    /**
     * Test of buy method, of class Customer.
     */
   /* @Test
    public void testBuy() {
        //Testin Buy with stub of get product // Neglected in test suit
        System.out.println("buy");
        String productName = "ball";
        Product p = shop.getProduct(productName);
        int productCount_before = p.count;
        double customerMoney_before= customer.money;
       
        customer.buy(productName, amount, shop);
        assertEquals(productName,customer.products.get(customer.products.size() - 1).name);
        assertEquals(customerMoney_before - p.price * amount,customer.money, 0);
        assertEquals(productCount_before - amount,p.count);
        // TODO review the generated test code and remove the default call to fail.
      
    }*/
    
    

    /**
     * Test of deposite method, of class Customer.
     */
    @Test
    public void testDeposite() {
        System.out.println("deposite");
        double money = 50.0;
        Customer instance = customer;
        double customerMoney_before = instance.money;
        instance.deposite(money);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Deposit isn't working", customerMoney_before+50, customer.money, 0);
        
        double money2 = -50.0;
        instance.deposite(money2);
        assertEquals("Deposit shouldn't change with negative values", customerMoney_before+50, customer.money, 0);
    }

}
