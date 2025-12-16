package java_core.arrays_listas.básico;

import java.util.Locale;
import java.util.Scanner;

public class n_negativos {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos números você vai digitar?");
        n = sc.nextInt();

        int [] vect = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");

        for (int i=0; i<n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
