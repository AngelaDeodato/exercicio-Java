package projetoJava4;
//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		Scanner Array3 = new Scanner(System.in);
		int[][] C = new int[3][3];
		int i, c, cont=0;
		
		for(i=0; i < C.length;i++) {
			for(c=0; c <C.length; c++) {
				System.out.printf("Insira o valor da C : ",i+1,c+1);
					C[i][c] = Array3.nextInt();
			}
		}
			for(i= 0; i<C.length; i++) {
				for(c=0; c <C.length; c++) {
					if(C[i][c] > 10) {				
						cont++;
						System.out.printf("\nMaiores que 10: "+cont);
						System.out.printf("\n E eles são "+C[i][c]);
					}
				}
				
			}
		}
	}


