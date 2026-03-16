package java_core.functionalAndLambda.consumers.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //O metodo é da classe. Ele recebe um produto e o avalia de fora.
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    //O metodo é da instância. O próprio objeto se avalia (this).
    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
