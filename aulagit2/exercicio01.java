package Exercicioslacos;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class exercicio01 {
	public static void main(String[]args) {
		
		Scanner Numeromaior = new Scanner(System.in);
		int a, b, c, maior;
		
		System.out.println("Entre com o valor de A: ");
		a = Numeromaior.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = Numeromaior.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = Numeromaior.nextInt();
		
		if(a>b) 
		{
			if(a>c) System.out.println("O maior dos numeros � "+a);//entre a e c ver quem � o maior
			else System.out.println("O maior dos numeros � "+c);
		}
		else {
			if(b>c) System.out.println("O maior dos numeros � "+b);// entre b e c quem � o maior 
			else System.out.println("O maior dos numeros � "+c);
		}
		
	}
}
