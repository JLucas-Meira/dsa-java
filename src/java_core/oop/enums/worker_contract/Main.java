package java_core.oop.enums.worker_contract;


import java_core.oop.enums.worker_contract.enums.WorkerLevel;
import java_core.oop.enums.worker_contract.entities.Department;
import java_core.oop.enums.worker_contract.entities.HourContract;
import java_core.oop.enums.worker_contract.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Cadastro do trabalhador
        System.out.print("Enter department's name: ");
        String departmentName = sc.next();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        double workerSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), workerSalary, new Department(departmentName));

        //Registro de contratos do trabalhador.
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Enter contract data #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

        sc.close();
    }
}
