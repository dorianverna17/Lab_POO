import java.util.*;
import java.lang.*;

class ShopSingleton {
    private static ShopSingleton obj;
    private String name;
    private LinkedList<Produs> produse;

    private ShopSingleton() {
        this.name = "Lidl";
        this.produse = new LinkedList<Produs>();
    }

    public static ShopSingleton getInstance() {
        if (obj == null) {
            obj = new ShopSingleton();
        }
        return obj;
    }

    public boolean addProduct(String name, float price) {
        Produs product = new Produs(name, price);

        if (!this.produse.contains(product)) {
            this.produse.add(product);
            return true;
        }
        return false;
    }

    public boolean removeProduct(Produs product) {
        if (this.produse.contains(product)) {
            this.produse.remove(product);
            return true;
        }
        return false;
    }

    public Produs getCheapestProduct() {
        int i = 0;
        float min = Float.MAX_VALUE;
        Produs min_prod = null;

        while (i < this.produse.size()) {
            if(this.produse.get(i).getPrice() < min) {
                min = this.produse.get(i).getPrice();
                min_prod = this.produse.get(i);
            }
            i++;
        }
        return min_prod;
    }
}

class Produs {
    private String name;
    private float price;

    public Produs(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}

public class Problema1 {
    public static void main(String args[]) {
        ShopSingleton.getInstance().addProduct("lapte", (float) 1.2);
        ShopSingleton.getInstance().addProduct("bere", (float) 5.2);
        ShopSingleton.getInstance().addProduct("apa", (float) 3.5);

        Produs product = new Produs("bere", (float) 5.2);
        ShopSingleton.getInstance().removeProduct(product);
        System.out.println(ShopSingleton.getInstance().getCheapestProduct().getPrice());
    }
}