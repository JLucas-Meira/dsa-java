package java_core.oop.heranca.dolar_buying.applications;

import java.util.Scanner;
import java.util.Locale;

import java_core.oop.heranca.dolar_buying.entites.Dollar;
import java_core.oop.heranca.dolar_buying.converters.CurrencyConverter;

public class DollarApp {
    public static void main(String[] args) {
        // Define o formato padrão como US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o preço atual do dólar
        System.out.print("What's the price of dollar today? ");
        double dollarToday = sc.nextDouble();

        // Solicita ao usuário a quantidade de dólares que deseja comprar
        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();

        // Cria o objeto Dollar com o preço informado
        Dollar dollar = new Dollar(dollarToday);

        // Usa o metodo getPrice() para obter o valor armazenado no objeto
        // Passa esse valor + a quantidade para a classe CurrencyConverter fazer o cálculo
        double total = CurrencyConverter.convert(dollar.getPrice(), dollarQuantity);

        // Mostra o valor total que a pessoa pagará em reais, com IOF incluso
        System.out.printf("Amount to be paid in reais = %.2f%n", total);

        sc.close();
    }
}