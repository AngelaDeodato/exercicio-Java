package Exercicioslacos;

import java.util.Scanner;

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/
public class exercio03 {
		public static void main(String [] args) {
			Scanner Idadecat = new Scanner(System.in);
			
			int idade;
			
			System.out.println("Digite sua idade: ");
			idade = Idadecat.nextInt();
			if(idade <=10 && idade <= 14 ) {
				System.out.println("Idade na categoria: INFANTIL");
			}
			else if(idade >=15 && idade <= 17) {
				System.out.println("Idade na categoria: JUVENIL");
			}
			else if(idade >=18 && idade <= 25) {
				System.out.println("Idade na categoria: ADULTO");
			}
			else {
				System.out.println("Voc� est� com mais de 30");
			}
		}
}
