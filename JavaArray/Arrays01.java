package projetoJava4;

import java.util.Scanner;

/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa 
 * deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5]
 do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
public class Arrays01 {

	public static void main(String[] args) {
		Scanner Array1 = new Scanner(System.in);
		int[] A =  new int[] {1,0,5,-2,-5,7};
		int i;
		A[4] = 100;// Aqui estamos trocando os valores
		System.out.println(A[0]+ A[1]+A[5]);//Aqui estamos somando os vetores.
		
		for(i=0; i<A.length;i++) {
			System.out.println(A[i]);//Aqui estamos mostrando todos od vetores
			
		}
	
	}
}


