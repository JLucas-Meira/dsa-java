package java_core.functionalAndLambda.consumers.application;

import java_core.functionalAndLambda.consumers.util.PriceUpdate;
import java_core.functionalAndLambda.consumers.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1299.00));
        list.add(new Product("HD Case", 85.00));
        list.add(new Product("Mouse", 59.90));

        //Uso de metodo estatico
        list.forEach(Product::staticPriceUpdate);

        //Uso do consumer com interface
        //list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}
