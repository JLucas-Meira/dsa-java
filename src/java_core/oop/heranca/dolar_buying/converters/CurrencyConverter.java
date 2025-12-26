package java_core.oop.heranca.dolar_buying.converters;

public class CurrencyConverter {

    // Metodo estático que realiza a conversão de dólar para reais com acréscimo de IOF
    public static double convert(double dollarPrice, double quantity) {
        double gross = dollarPrice * quantity; // valor sem IOF
        double iof = gross * 0.06; // 6% de IOF
        return gross + iof; // valor total com IOF incluído
    }
}