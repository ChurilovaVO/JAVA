package JAVA.OOP.HomeWork1;

import java.util.List;

public interface Vending {

    void addProduct(Product product);
    List<Product> getProduct(String kind);
    List <Product> getProduct (String name, int volume, int temperature);
}
