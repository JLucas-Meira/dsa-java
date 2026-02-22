package java_core.interfaces.contract_manager.service;

import java_core.interfaces.contract_manager.model.entities.Contract;
import java_core.interfaces.contract_manager.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, int months){
        double installmentValue = contract.getTotalValue() / months;

        for(int i=1; i<=months; i++){
            LocalDate dueDate = contract.getDate();
            dueDate = dueDate.plusMonths(i);


            double interest = onlinePaymentService.interest(installmentValue, i);
            double fee = onlinePaymentService.paymentFee(installmentValue+interest);
            double quota = installmentValue + interest + fee;

            Installment installment = new Installment(dueDate, quota);

            contract.getInstallments().add(installment);
        }
    }
}
