package Exercicioslacos;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.
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
			System.out.println("A ordem crescente dos numeros é "+A+","+B+"," +C);
		}
		else if(A <= C && C <= B) {
			System.out.println("Aordem crescente dos numeros é "+A+"," +C+ "," +B);
		}
		else if(B <= A && A <= C) {
			System.out.println("Aordem crescente dos numeros é  "+B+ ", " +A+","+C);
		}
		else if(B <= C && C <= A) {
			System.out.println("Aordem crescente dos numeros é "+B+ "," +C+ "," +A);
		}
		else if(C <= A && A <= B) {
			System.out.println("Aordem crescente dos numeros é  "+C+ "," +A+ "," +B);
		}
		else{
			System.out.println("Aordem crescente dos numeros é   "+C+ "," +B+ "," +A);
		}
	}
}
