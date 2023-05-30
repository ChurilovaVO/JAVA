package JAVA.OOP.HomeWork1;

import java.util.List;
import java.util.ArrayList;

public class HotDrinkVending implements Vending {
    private final List<HotDrink> drinkList;
    public HotDrinkVending() {drinkList = new ArrayList<>();}


    @Override
    public void addProduct(Product product) {
        drinkList.add((HotDrink) product);
    }

    public List <Product> getProduct(String kind) {
        List <Product> productList = new ArrayList<>();
        for (Product product : drinkList) {
            if (kind.equals(product.getKind())){
                productList.add(product);
            }
        }
        if (productList.size()==0){
            return null;
        }
        return productList;
    }

    public List <Product> getProduct (String name, int volume, int temperature) {
        List<Product> productList = new ArrayList<>();
        for (HotDrink hotDrink : drinkList) {
            if (name.equals(hotDrink.getName()) ||
                    volume == hotDrink.getVolume() ||
                    temperature == hotDrink.getTemperature()) {
                productList.add(hotDrink);
            }
        }
        if (productList.size() == 0) {
            return null;
        }
        return productList;
    }
}


