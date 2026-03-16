package java_core.functionalAndLambda.consumers.util;

import java_core.functionalAndLambda.consumers.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
