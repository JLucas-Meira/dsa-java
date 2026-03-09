package java_core.collections.maps.stock_map;

import java_core.collections.maps.stock_map.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Product, Integer> stock = new HashMap<>();

        Product p1 = new Product("Tv", 1900.00);
        Product p2 = new Product("Notebook", 2400.00);
        Product p3 = new Product("Tablet", 1400.00);

        stock.put(p1, 100);
        stock.put(p2, 200);
        stock.put(p3, 350);

        Product ps = new Product("Tv", 1900.50);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
