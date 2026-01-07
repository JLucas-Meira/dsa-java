package java_core.oop.polimorfismo.payment_system.app;

import java_core.oop.polimorfismo.payment_system.entities.Employee;
import java_core.oop.polimorfismo.payment_system.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(isOutsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                // UPCASTING:
                // Instanciamos um OutsourcedEmployee, mas guardamos na lista de Employee.
                // O Java aceita pois "Todo OutsourcedEmployee É UM Employee".
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                // Instanciação padrão da classe pai
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
