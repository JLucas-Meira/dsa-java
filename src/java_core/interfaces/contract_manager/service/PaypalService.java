package java_core.interfaces.contract_manager.service;

public class PaypalService implements OnlinePaymentService {

    //taxa de pagamento de 2% ao mês
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    //taxa de juros simples de 1% ao mês
    @Override
    public double interest(double amount, int months) {
        return amount * (0.01 * months);
    }
}
