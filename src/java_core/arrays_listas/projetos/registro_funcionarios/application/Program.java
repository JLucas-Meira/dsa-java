package java_core.arrays_listas.projetos.registro_funcionarios.application;

import java_core.arrays_listas.projetos.registro_funcionarios.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        int n;

        System.out.print("Quantos funcionários serão registrados?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Cadastro de Funcionário: #" + (i+1) + ": ");

            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            listaDeFuncionarios.add(funcionario);
        }

        System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
        int idSalario = sc.nextInt();

        boolean idEncontrado = false;

        for (int i = 0; i < listaDeFuncionarios.size(); i++){
            Funcionario funcionarioAtual = listaDeFuncionarios.get(i);

            if(funcionarioAtual.getId() == idSalario){
                System.out.print("Insira a porcentagem do aumento do salário: ");
                double porcentagem = sc.nextDouble();

                funcionarioAtual.aumentoSalario(porcentagem);
                idEncontrado = true;
                break;
            }
        }

        if(!idEncontrado){
            System.out.println("Este ID não existe!");
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario f : listaDeFuncionarios){
            System.out.println(f);
        }

        sc.close();
    }
}
