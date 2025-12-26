package java_core.basics.arrays.projetos.alturas.application;

import java_core.basics.arrays.projetos.alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, contagemMenor16 = 0;
        double somaAlturas = 0, alturaMedia;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        // Loop para ler os dados de cada pessoa
        for (int i=0; i<n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        for (int i=0; i<n; i++){
            somaAlturas += vect[i].getAltura();
        }

        alturaMedia = somaAlturas / n;
        System.out.println("Altura média: " + alturaMedia);

        for (int i=0; i<n; i++){
            if (vect[i].getIdade() < 16) {
                contagemMenor16++;
            }
        }

        double porcentagemMenor16 = (double) contagemMenor16 / n * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %2f%n", porcentagemMenor16);

    }
}
