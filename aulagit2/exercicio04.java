package Exercicioslacos;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
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
			System.out.println("A raiz quadrada de"+num+" � "+raiz);
			
		}
		else { 
			raiz = Math.pow(num, 2);
			
			System.out.println(" Impar");
			System.out.println("O "+num+" elevado ao quadrado � "+raiz);
			
		}
	}
}
		
	
	
