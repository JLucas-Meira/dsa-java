package java_core.interfaces.contract_manager.application;

import java_core.interfaces.contract_manager.model.entities.Contract;
import java_core.interfaces.contract_manager.model.entities.Installment;
import java_core.interfaces.contract_manager.service.ContractService;
import java_core.interfaces.contract_manager.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double contractTotalValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractTotalValue);

        System.out.print("Entre com o número de parcelas: ");
        int nParcelas = sc.nextInt();
        System.out.println("Parcelas: ");

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, nParcelas);

        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
