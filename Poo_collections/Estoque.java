package Expoo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {

	public static void main(String[] args) {
		//adicionando 
		Collection<String> estoque = new ArrayList();
		estoque.add("Celular");
		estoque.add("Batedeira");
		estoque.add("Geladeira");
		System.out.println("Armazenado dados "+estoque);

		//removendo
		estoque.remove("Geladeira");
		System.out.println("\nRemovendo dados "+estoque);
		
		//Atualizando 
		
		Collection<String> estoque1 = Arrays.asList("Camiseta","Sandalia");
		estoque.addAll(estoque1);
		System.out.println("\nAtualizando dados "+estoque);
		
		//Apresentando
		
		for(String Nestoque: estoque) {
			
			System.out.println("\nApresentando dados "+Nestoque);
		}
			
		
		
	}

}
