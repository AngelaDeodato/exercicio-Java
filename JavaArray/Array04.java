package projetoJava4;
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
 Na terceira opção o valor da constante deve ser lido e o resultado da adição 
 da constante deve ser armazenado na própria matriz.
*/
import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner Array4 = new Scanner(System.in);
		float [][] matrix1 = new float[2][2], matrix2 = new float[2][2];
		float[][] somar = new float[2][2], subtrair = new float[2][2];
		int consti, op;
		
		for(int l=0; l<2;l++) {
			for(int c=0; c<2;c++) {
				System.out.println("Entre com o numero da Matrix 1: ");
				matrix1[l][c] = Array4.nextFloat();
			}
		}
			for(int l=0; l<2;l++) {
				for(int c=0; c<2;c++) {
				System.out.println("Entre com o numero da Matrix 2: ");
				matrix2[l][c] = Array4.nextFloat();
					}
				}
			
		
			System.out.println("\n(1) somar as duas matrizes"); 
			System.out.println("\n(2) subtrair a primeira matriz da segunda ");	
			System.out.println("\n(3) adicionar uma constante as duas matrizes");
			System.out.println("\n(4) imprimir as matrizes");
			System.out.println("\nDigite sua opcão: ");
			op = Array4.nextInt();
			switch(op) {
			case 1: 
				for(int l=0; l<2;l++) {
					for(int c=0; c<2; c++) {
						somar[l][c] = matrix1[l][c]+matrix2[l][c];
						System.out.println("\nValor: "+somar[l][c]);
					}
				}
				break;
			case 2:
				for(int l=0; l<2;l++) {
					for(int c=0; c<2; c++) {
						subtrair[l][c] = matrix1[l][c]-matrix2[l][c];
						System.out.println("\nValor: "+subtrair[l][c]);
					}
				}
				break;
			case 3:
				System.out.println("Entre com o valor da constante: ");
				consti= Array4.nextInt();
				for(int l=0; l<2;l++) {
					for(int c=0; c<2; c++) {
					matrix1[l][c] = matrix1[l][c]+consti;
					matrix2[l][c] = matrix2[l][c]+consti;
					System.out.println("\nMatrix 1 : "+matrix1[l][c]);
					System.out.println("\nMatrix 2 : "+matrix2[l][c]);
					}
				}
					for(int l=0; l<2;l++) {
						for(int c=0; c<2; c++) {
						System.out.println("\nMatrix 2 : "+matrix2[l][c]);
					}
				}
				break;
				default:
				System.out.println("Opção Invalida");
			}
		}
	}
	


