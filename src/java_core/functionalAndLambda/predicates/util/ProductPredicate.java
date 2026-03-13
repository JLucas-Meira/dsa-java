package java_core.functionalAndLambda.predicates.util;

import java_core.functionalAndLambda.predicates.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() > 100;
    }
}
