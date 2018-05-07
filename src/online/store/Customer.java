package online.store;

import java.util.*;

public class Customer {
String name;
int id;
ArrayList<Product> products;
double money;

    public Customer(String name, int id, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }
    
    public static void buy(String productName, Customer c, int amount){
        Product p= Shop.getProduct(productName);
        c.products.add(p);
        c.money+= p.price*amount;
        p.count-= amount;
    }
    public void deposite(double money){
        this.money-=money;
    }
}
