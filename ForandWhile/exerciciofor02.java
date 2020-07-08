package ForWhile;
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.Scanner;

public class exerciciofor02 {
public static void main(String[]args) {
		
		Scanner SegundoFor = new Scanner(System.in);
		int Num, Numimpar=0, Numpar=0, somapar=0, somaimpar=0;
		
		
		
		for(Num=1; Num<=10; Num++) {
			
			System.out.println("Entre com um numero: ");
			Num = SegundoFor.nextInt();	
			
			
			if(Num%2==0) {
				 Numpar= Numpar++;
				 somapar = somapar + Num;
			}
			else {
				Numpar = Numimpar++;
				somaimpar = somaimpar + Num;
			}
			
		}
		
		System.out.print("Existem: "+somapar+" Numeros pares");
		System.out.print("\nExistem: "+somaimpar+" Numeros impares");
		
	}
}
