package java_core.poo.dolar_buying.entites;

// Classe que representa a entidade Dollar (valor do dólar informado pelo usuário)
public class Dollar {
    // Atributo privado que armazena o preço do dólar
    private double price;

    // Construtor da classe. Recebe o valor do dólar digitado e atribui ao atributo 'price'
    public Dollar(double price) {
        // 'this.price' se refere ao atributo da classe (linha 6)
        // O parâmetro 'price' é o valor passado ao criar o objeto
        this.price = price;
    }

    // Metodo de acesso (getter) para obter o valor do dólar armazenado
    public double getPrice() {
        return price; // Retorna o valor armazenado no atributo 'price'
    }
}