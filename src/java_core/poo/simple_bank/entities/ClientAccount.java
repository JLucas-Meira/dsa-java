package java_core.poo.simple_bank.entities;
import java.lang.Override;

/*
* Representa uma conta bancária com número, titular e saldo.
* Permite depósitos e saques com taxa fixa.
*/
public class ClientAccount {
    //Atributos privados, garantindo encapsulamento
    private int accountNumber;
    private String holder;
    private double balance;

    //Construtores

    public ClientAccount(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public ClientAccount(int accountNumber, String holder){
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    //getters e setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    //Realiza um depósito na conta
    public void deposit(double amount){
            balance += amount;
    }
    //Realiza um saque na conta, já incluso a taxa
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
