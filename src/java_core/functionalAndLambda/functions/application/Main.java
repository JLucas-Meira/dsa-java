package java_core.functionalAndLambda.functions.application;

import java_core.functionalAndLambda.functions.entities.Product;
import java_core.functionalAndLambda.functions.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1299.00));
        list.add(new Product("HD Case", 85.00));
        list.add(new Product("Mouse", 59.90));

        //Uso de metodo estatico
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Uso do function com interface
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
