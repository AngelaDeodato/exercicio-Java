 package ForWhile;
/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.*/
import java.util.Scanner;

public class exerciciodowhile01 {

public static void main(String[]args) {
		
		Scanner Primeirodowhile = new Scanner(System.in);
		int numero,soma =0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = Primeirodowhile.nextInt();
			
			soma = soma + numero;
		} while(numero!=0);
		
		System.out.println("A soma dos numeros digitados �: "+soma);	
	}
}
