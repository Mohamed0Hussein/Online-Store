/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author eslam
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({online.store.IntegrationTest.class, online.store.CustomerTest.class, online.store.ProductTest.class, online.store.ShopTest.class})
public class TestSuit {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
