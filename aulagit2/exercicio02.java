package Exercicioslacos;

import java.util.Scanner;

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
public class exercicio02 {
	public static void main(String[]args) {
		
		Scanner crescente = new Scanner(System.in);
		int A, B, C, Cres;
		
		System.out.println("Entre com o valor de A: ");
		A = crescente.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = crescente.nextInt();
		System.out.println("Entre com o valor de C: ");
		C = crescente.nextInt();
		
		if(A <= B && B <= C) {
			System.out.println("A ordem crescente dos numeros � "+A+","+B+"," +C);
		}
		else if(A <= C && C <= B) {
			System.out.println("Aordem crescente dos numeros � "+A+"," +C+ "," +B);
		}
		else if(B <= A && A <= C) {
			System.out.println("Aordem crescente dos numeros �  "+B+ ", " +A+","+C);
		}
		else if(B <= C && C <= A) {
			System.out.println("Aordem crescente dos numeros � "+B+ "," +C+ "," +A);
		}
		else if(C <= A && A <= B) {
			System.out.println("Aordem crescente dos numeros �  "+C+ "," +A+ "," +B);
		}
		else{
			System.out.println("Aordem crescente dos numeros �   "+C+ "," +B+ "," +A);
		}
	}
}
