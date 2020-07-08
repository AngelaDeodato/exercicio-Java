package ForWhile;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 *Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/


import java.util.Scanner;

public class exerciciowhile01 {
public static void main(String[]args) {
		
		Scanner Primeirowhile= new Scanner(System.in);
		int idade=0, Menorde21=0, Maiorde50=0,soma21=0, soma50=0;
		
		while(idade>=0 && idade<=99) {
			
		System.out.println("Informe a idade:");
		idade = Primeirowhile.nextInt();
		idade++;
		
			if(idade<=21) {
				Menorde21 = Menorde21 + 1;
				soma21 = Menorde21;
			}
			else if(idade >=50&& idade <=99) {
				 Maiorde50 =  Maiorde50 + 1;
				 soma50 = Maiorde50;
			}
			else if(idade >=100) {
				System.out.println("Idade invalida!!");
			}
			
		}
		System.out.println("Total de idades menores que 21 é :"+soma21);
		System.out.println("Total de idades maiores que 50 é :"+soma50);
	
	}
}
