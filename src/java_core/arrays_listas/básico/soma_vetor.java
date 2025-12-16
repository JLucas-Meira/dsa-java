package java_core.arrays_listas.básico;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[(int) n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("VALORES: ");

        double soma = 0;
        for (int i=0; i<n; i++){
            System.out.println(vect[i]);
            soma += vect[i];
        }
        double media = soma / n;

        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);

    }
}
