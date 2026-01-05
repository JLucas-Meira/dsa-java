package java_core.oop.enums.worker_contract.entities;

import java_core.oop.enums.worker_contract.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    /**
     * Calcula o ganho total do trabalhador baseando-se no ano e mês fornecidos.
     * @param year Ano do contrato
     * @param month Mês do contrato (1 a 12)
     * @return Soma do salário base + contratos do período
     */
    public double income (int year, int month){

        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            // Adicionamos +1 pois o Calendar.MONTH começa em 0 (Janeiro)
            int c_month = 1 + cal.get(Calendar.MONTH);

            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
