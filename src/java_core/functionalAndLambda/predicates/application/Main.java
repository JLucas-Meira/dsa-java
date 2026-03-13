package java_core.functionalAndLambda.predicates.application;

import java_core.functionalAndLambda.predicates.entities.Product;
import java_core.functionalAndLambda.predicates.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1299.00));
        list.add(new Product("HD Case", 85.00));
        list.add(new Product("Mouse", 59.90));

        //Versão usando implementação da interface.
        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }
    }
}
