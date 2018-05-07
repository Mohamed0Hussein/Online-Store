package online.store;

import java.util.*;

public class Shop {
    ArrayList<Customer> customers;
    static ArrayList<Product> products;
    String name;
    int id =0;
    public Shop(String name) {
        this.name = name;
    }
    
    public void discount (double percentage,Product p){
    p.price=p.price*percentage;
}
public void IncreasePrice (double amount ,Product p){
    p.price+=amount;
}
public void addProduct(String name,double price, String category,int count){
    Product p = new Product(name,price,category, count);
    products.add(p);
}
public void removeProduct(String name){
    for(int i=0;i<products.size();i++)
       if(products.get(i).name == name)
       {
           products.remove(i);
           break;
       }
}
 public static Product getProduct(String Name){
    for(int i=0;i<products.size();i++)
       if(products.get(i).name == Name)
       {
          return products.get(i);
           
       }
     return null;        
 }   
 public void RegisterCustomer(String Name, double Money){
     customers.add(new Customer(Name,++id,Money));
 }
   
}
