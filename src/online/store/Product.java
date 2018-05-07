package online.store;
public class Product {
String name;
double price;
String category;
int count;

public Product(String name, double price, String category,int count) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.count= count;
    }

public void addAmount(int amount){
        this.count+= count;
}
public boolean isAvailable (){
if (count>0)
    return false;
else return true;
}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
