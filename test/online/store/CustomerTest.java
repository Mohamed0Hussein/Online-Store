/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hussein
 */
public class CustomerTest {

    Customer c;

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c = new Customer("Mohamed Hussein", 10, 300);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of buy method, of class Customer.
     */
   
   /* public void testBuy() {
        System.out.println("buy");
        String productName = "";
        Customer c = null;
        int amount = 0;
        Customer.buy(productName, c, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of deposite method, of class Customer.
     */
    @Test
    public void testDeposite() {
        System.out.println("deposite");
        double money = 50.0;
        Customer instance = c;
        instance.deposite(money);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Deposit isn't working",350,c.money,0);
    }

}
