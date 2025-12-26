package java_core.oop.heranca.simple_bank.applications;
import java_core.oop.heranca.simple_bank.entities.ClientAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Coleta os dados da conta
        System.out.println("Enter with your account accountNumber: ");
        System.out.print("Account accountNumber: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter with your account holder");
        System.out.print("Holder: ");
        String holder = sc.next();

        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        ClientAccount account;

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new ClientAccount(accountNumber, holder, initialDeposit);
        } else {
            account = new ClientAccount(accountNumber, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account.toString());

        //Depósito
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);

        //Saque
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();
    }
}
