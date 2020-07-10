import java.util.Scanner;
/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos
 deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
A entrada de dados deve terminar quando for lido um número negativo.
*/
public class Revisão03 {

	public static void main(String[] args) {
		Scanner R3 = new Scanner(System.in); 
		int Rs3[] = new int [200];
		int Num,I,B,Inter1,Inter2,Inter3,Inter4;
		I= Inter1 = Inter2 = Inter3 = Inter4 = 0;
		
		
		
		System.out.printf("Insira um numero");
		Num = R3.nextInt();
		while((Num >= 0) && (Num <= 100) && (I < 200)) {
			Rs3[I] = Num;
			System.out.printf("Insira um numero");
			Num = R3.nextInt();
			I++;
		}
			for(B= 0; B < I; B++) {
				if((Rs3[B]>=0) && (Rs3[B] <=25)) {
					Inter1++;
				}
				else if((Rs3[B]>=26) && (Rs3[B] <=50)) {
					Inter2++;
				}
				else if((Rs3[B]>=51) && (Rs3[B] <=75)) {
					Inter3++;
				}
				else if((Rs3[B]>=76) && (Rs3[B] <=100)) {
					Inter4++;
				}
		}
			System.out.printf("\nIntervalo 1: %d Numeros:  " ,Inter1);
			System.out.printf("\nIntervalo 2: %d Numeros: " ,Inter2);
			System.out.printf("\nIntervalo 3: %d Numeros: " ,Inter3);
			System.out.printf("\nIntervalo 4: %d Numeros: " ,Inter4);
	}

}
