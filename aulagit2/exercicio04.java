package Exercicioslacos;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[]args) {
		Scanner Numeropar = new Scanner(System.in);
		
		int num;
		double raiz;
		System.out.println("Digite um numero: ");
		 num = Numeropar.nextInt();
		
		if(num % 2 == 0){
			raiz = Math.sqrt(num);
			System.out.println("par");
			System.out.println("A raiz quadrada de"+num+" é "+raiz);
			
		}
		else { 
			raiz = Math.pow(num, 2);
			
			System.out.println(" Impar");
			System.out.println("O "+num+" elevado ao quadrado é "+raiz);
			
		}
	}
}
		
	
	
