package projetoJava4;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
public class Arrays02 {

	public static void main(String[] args) {
		Scanner Array2 = new Scanner(System.in);
		int[] B = new int[6];
		int i, soma=0, impar=0 ,par=0;
			for(i=0; i<B.length;i++) {
				System.out.println("Digite os valores do vetor: ");
				B[i]= Array2.nextInt();
			}
			
			for(i=0; i<B.length;i++) {
			if(B[i]%2==0) {
					System.out.println("Numero par: "+B[i]);
					soma =soma+B[i];
				}
				else{
					System.out.println("Numero Impar: "+B[i]);
					impar++;
				}	
				
			}
			System.out.println("A soma dos pares é: "+soma+"\nOs numeros impares são: "+impar);
		}
	}


