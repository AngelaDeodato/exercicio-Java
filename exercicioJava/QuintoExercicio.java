package ExerciciosJava;

import java.util.Scanner;

public class QuintoExercicio {
	public static void main(String args[])
	{
		Scanner notas = new Scanner(System.in);
		
		String nome;
		float N1, N2, N3, media;
		System.out.println("=========================");
		System.out.println("Escola Generation Brasil");
		System.out.println("=====Seja bem vindo======");
		
			System.out.println("Digite seu nome: ");
			nome = notas.next();
			System.out.println("\nPrimeira nota: ");
			N1= notas.nextInt();
			System.out.println("\nSegunda nota: ");
			N2= notas.nextInt();
			System.out.println("\nTerceira nota: ");
			N3= notas.nextInt();
			
			media = (N1+N2+N3)/3;
			
			System.out.printf("A media foi: "+media);
		
	}
}
