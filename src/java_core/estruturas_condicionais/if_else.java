package java_core.estruturas_condicionais;
import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um número");
		int n1 = sc.nextInt();
		
		if (n1 > 0) {
			System.out.printf("O número %d é positivo", n1);			
		}
		else {
			System.out.printf("O número %d é negativo", n1);
		}

		
		sc.close();
	}

}
