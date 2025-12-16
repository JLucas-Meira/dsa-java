package java_core.estruturas_condicionais;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.printf("O resultado da soma dos números %d + %d é igual a: %n", x, y);
		System.out.println(soma);
		System.out.println();
		
		
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
		
		double raio, area, pi = 3.14159;
        
        System.out.println("Digite o valor do raio do círculo:");
        raio = sc.nextDouble();
        
        area = pi * Math.pow(raio, 2);
        
        System.out.printf("O resultado da área do círculo é %.4f%n", area);
        
        
		sc.close();
			
		
	}

}
