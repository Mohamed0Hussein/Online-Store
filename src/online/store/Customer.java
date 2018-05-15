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
        products = new ArrayList();
    }

    public boolean buy(String productName, int amount, Shop Shop) {
        Product p = Shop.getProduct(productName);
        if (p != null) {
            if (p.isAvailable()) {
                if (money >= p.price * amount && p.count >= amount) {
                    if (!products.contains(p)) {
                        products.add(p);
                        money -= p.price * amount;
                        p.count -= amount;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void deposite(double money) {
        if (money >= 0) {
            this.money += money;
        }
    }
}
