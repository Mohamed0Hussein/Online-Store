package online.store;

import java.util.*;

public class Shop {

    ArrayList<Customer> customers;
    ArrayList<Product> products;
    //Product p = (new Product("ball", 100, "Any", 5));
    String name;
    int id = 0;

    public Shop(String name) {
        this.name = name;
        customers = new ArrayList();
        products = new ArrayList();
    }

    public void discount(double percentage, Product p) {
        if (percentage >= 0) {
            p.price = p.price - p.price * percentage / 100;
        }
    }

    public void IncreasePrice(double amount, Product p) {
        if (amount >= 0) {
            p.price += amount;
        }
    }

    public boolean addProduct(String name, double price, String category, int count) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equalsIgnoreCase(name)) {
                return false;

            }
        }

        Product p = new Product(name, price, category, count);
        products.add(p);
        return true;
    }

    public Product getProduct(String Name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equalsIgnoreCase(Name)) {
                return products.get(i);

            }
        }
        return null;
//return p   ; 
    }

    public boolean RegisterCustomer(Customer c) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).id == c.id) {
                return false;

            }
        }

        customers.add(c);
        return true;
    }

}
