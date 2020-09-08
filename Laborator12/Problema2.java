import java.util.*;
import java.lang.*;

abstract class Product {
    private String productName;
    private float productPrice;

    public Product(String name, float price) {
        this.productName = name;
        this.productPrice = price;
    }

    public String getName() {
        return this.productName;
    }

    public float getPrice() {
        return this.productPrice;
    }


}

public class Problema2 {
    public static void main(String args[]) {
        ShopSingleton.getInstance().addProduct("lapte", (float) 1.2);
        ShopSingleton.getInstance().addProduct("bere", (float) 5.2);
        ShopSingleton.getInstance().addProduct("apa", (float) 3.5);

//        Product product = new Product("bere", (float) 5.2);
//        ShopSingleton.getInstance().removeProduct(product);
        System.out.println(ShopSingleton.getInstance().getCheapestProduct().getPrice());
    }
}