package java_core.functionalAndLambda.comparator_lambda.application;

import java_core.functionalAndLambda.comparator_lambda.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		/**
		 Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 list.sort(comp);
		*/
		//Expressão lambda passada dentro do list.sort, sem precisar declarar uma variavel antes.
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for(Product p : list){
			System.out.println(p);
		}
	}
}
