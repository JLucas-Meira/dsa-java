package java_core.functionalAndLambda.predicates.application;

import java_core.functionalAndLambda.predicates.entities.Product;
import java_core.functionalAndLambda.predicates.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1299.00));
        list.add(new Product("HD Case", 85.00));
        list.add(new Product("Mouse", 59.90));

        list.removeIf(p -> p.getPrice() > 100);

        //Expressão lambda declarada, bom para reuso.
        //Predicate<Product> pred = p -> p.getPrice() > 100;
        //list.removeIf(pred);

        //Reference method com metodo NÃO estatico.
        //list.removeIf(Product::nonStaticProductPredicate);

        //Reference method com metodo estatico.
        //list.removeIf(Product::staticProductPredicate);

        //Versão usando implementação da interface.
        //list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }
    }
}
