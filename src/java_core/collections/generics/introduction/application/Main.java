package java_core.collections.generics.introduction.application;

import java_core.collections.generics.introduction.services.PrinterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrinterService<String> ps = new PrinterService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
